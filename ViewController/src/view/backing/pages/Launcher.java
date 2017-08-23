package view.backing.pages;



import javax.faces.event.ActionEvent;

import oracle.ui.pattern.dynamicShell.TabContext;

public class Launcher {
    
    public String viewCustomerActivity() { 
            /** 
            * Example method when called repeatedly, will open another instance as 
            * oppose to selecting a previously opened tab instance. Note the boolean 
            * to create another tab instance is set to true. 
            */ 
              
            _launchActivity( 
              "Customer Detail", 
              "/WEB-INF/flows/view-customer-taskflow.xml#view-customer-taskflow",  
              false); 
            
            return null;
            
          } 
        
        public void manageCustomerActivity(ActionEvent actionEvent) { 
            /** 
            * Example method when called repeatedly, will open another instance as 
            * oppose to selecting a previously opened tab instance. Note the boolean 
            * to create another tab instance is set to true. 
            */ 
              
            _launchActivity( 
              "Customers", 
              "/WEB-INF/flows/manage-customer-taskflow.xml#manage-customer-taskflow",  
              true); 
        } 
    
    /* dont edit this */
    public void manageRoleActivity(ActionEvent actionEvent) 
      { 
        /** 
        * Example method when called repeatedly, will open another instance as 
        * oppose to selecting a previously opened tab instance. Note the boolean 
        * to create another tab instance is set to true. 
        */ 
          
        _launchActivity( 
          "Role management", 
          "/WEB-INF/flows/manage-role-taskflow.xml#manage-role-taskflow",  
          true); 
      } 
    public void manageProductActivity(ActionEvent actionEvent) 
      { 
        /** 
        * Example method when called repeatedly, will open another instance as 
        * oppose to selecting a previously opened tab instance. Note the boolean 
        * to create another tab instance is set to true. 
        */ 
          
        _launchActivity( 
          "Product management", 
          "/WEB-INF/flows/manage-product-taskflow.xml#manage-product-taskflow",  
          true); 
      } 
    public void manageUserActivity(ActionEvent actionEvent) 
      { 
        /** 
        * Example method when called repeatedly, will open another instance as 
        * oppose to selecting a previously opened tab instance. Note the boolean 
        * to create another tab instance is set to true. 
        */ 
          
        _launchActivity( 
          "User management", 
          "/WEB-INF/flows/manage-user-taskflow.xml#manage-user-taskflow",  
          true); 
      } 
    public void manageTeamActivity(ActionEvent actionEvent) 
      { 
        /** 
        * Example method when called repeatedly, will open another instance as 
        * oppose to selecting a previously opened tab instance. Note the boolean 
        * to create another tab instance is set to true. 
        */ 
          
        _launchActivity( 
          "Team management", 
          "/WEB-INF/flows/manage-team-taskflow.xml#manage-team-taskflow",  
          true); 
      } 
    
    
      private void _launchActivity(String title, String taskflowId, boolean newTab) 
      { 
        try 
        { 
          if (newTab) 
          { 
            TabContext.getCurrentInstance().addTab( 
              title, 
              taskflowId); 
          } 
          else 
          { 
            TabContext.getCurrentInstance().addOrSelectTab( 
              title, 
              taskflowId); 
          } 
        } 
        catch (TabContext.TabOverflowException toe) 
        { 
          // causes a dialog to be displayed to the user saying that there are 
          // too many tabs open - the new tab will not be opened... 
          toe.handleDefault();  
        } 
      } 

        
    
}
