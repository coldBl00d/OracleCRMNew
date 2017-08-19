package view.backing.pages;



import javax.faces.event.ActionEvent;

import oracle.ui.pattern.dynamicShell.TabContext;

public class Launcher {
    
    /* dont edit this */
    public void manageRoleActivity(ActionEvent actionEvent) 
      { 
        /** 
        * Example method when called repeatedly, will open another instance as 
        * oppose to selecting a previously opened tab instance. Note the boolean 
        * to create another tab instance is set to true. 
        */ 
          
        _launchActivity( 
          "Roles", 
          "/WEB-INF/flows/manage-role-taskflow.xml#manage-role-taskflow",  
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
