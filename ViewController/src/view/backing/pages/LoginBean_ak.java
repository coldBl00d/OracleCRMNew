package view.backing.pages;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import weblogic.security.URLCallbackHandler;
import weblogic.security.services.Authentication;
import oracle.adf.share.ADFContext;

import weblogic.servlet.security.ServletAuthentication;

public class LoginBean_ak {
    public LoginBean_ak() {
        super();
    }
    
    private String username; 
    private String password;
    private String LANDING_PAGE = "/pages/Home.jsf";

    private String LANDING_PAGE_ADMIN = "/pages/Admin.jsf";
    private String LANDING_PAGE_REP_AND_MANAGER =  "/pages/Users.jsf";

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public String doLogin(){
        FacesContext ctx = FacesContext.getCurrentInstance();
            HttpServletRequest request = (HttpServletRequest)ctx.getExternalContext().getRequest();
            CallbackHandler handler = new URLCallbackHandler(username, password);
            try{
            Subject mySubject = Authentication.login(handler);
            ServletAuthentication.runAs(mySubject, request);
            ServletAuthentication.generateNewSessionID(request);
                String loginUrl = "/adfAuthentication?success_url=/faces"+LANDING_PAGE;
            //ctx.getViewRoot().getViewId();
                System.out.println("Login url :"+loginUrl);
            HttpServletResponse response = 
                       (HttpServletResponse)ctx.getExternalContext().getResponse();
                
            
            sendForward(request, response, loginUrl);
            }catch(FailedLoginException e){
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                                        "Incorrect Username or Password",
                                                        "An incorrect Username or Password" +
                                                        " was specified");
                     ctx.addMessage(null, msg);
            }catch(LoginException e){
                reportUnexpectedLoginError("LoginException", e);
            }
            return null;
    }
    
    private void sendForward(HttpServletRequest request,  HttpServletResponse response, String forwardUrl){
        
        String roles[] = ADFContext.getCurrent().getSecurityContext().getUserRoles();
        for(String s : roles){
            System.out.println(s);
        }
        
       
        
           FacesContext ctx = FacesContext.getCurrentInstance();
           
           RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
           try {
             dispatcher.forward(request, response);
           } catch (ServletException se) {
             reportUnexpectedLoginError("ServletException", se);
           } catch (IOException ie) {
             reportUnexpectedLoginError("IOException", ie);
           }
           ctx.responseComplete();
         }
        
        private void reportUnexpectedLoginError(String errType, Exception e){
          FacesMessage msg =
            new FacesMessage(FacesMessage.SEVERITY_ERROR, "Unexpected error                                                        during login",
                             "Unexpected error during login (" + errType + 
                             "), please consult logs for detail");
          FacesContext.getCurrentInstance().addMessage(null, msg);
          e.printStackTrace();
        }
        
    public String onLogout() {
      FacesContext fctx = FacesContext.getCurrentInstance();
      ExternalContext ectx = fctx.getExternalContext();
      String url = ectx.getRequestContextPath()+ 
                 "/adfAuthentication?logout=true&end_url=/faces/pages/Login.jsf";     
      try {
        ectx.redirect(url);
      } catch (IOException e) {
        e.printStackTrace();
      }
      fctx.responseComplete();
      return null;
    }
    
}
