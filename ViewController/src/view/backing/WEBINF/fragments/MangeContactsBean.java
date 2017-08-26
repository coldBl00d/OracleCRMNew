package view.backing.WEBINF.fragments;

import java.util.HashMap;
import java.util.Map;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichQuickQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichDecorativeBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;

import oracle.ui.pattern.dynamicShell.TabContext;

public class MangeContactsBean {
    private RichPanelGroupLayout pgl1;
    private RichDecorativeBox db1;
    private RichToolbar t1;
    private RichButton b1;
    private RichButton b2;
    private RichPanelGroupLayout pgl2;
    private RichQuickQuery qryId1;
    private RichCommandLink cl1;
    private RichTable t2;

    public MangeContactsBean() {
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setDb1(RichDecorativeBox db1) {
        this.db1 = db1;
    }

    public RichDecorativeBox getDb1() {
        return db1;
    }

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }


    public void setQryId1(RichQuickQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuickQuery getQryId1() {
        return qryId1;
    }

    public void setCl1(RichCommandLink cl1) {
        this.cl1 = cl1;
    }

    public RichCommandLink getCl1() {
        return cl1;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }
    
    public String goContact(){
        goPlace("ContactListIterator",
            "ContactName",
            "PointerId","ContactId", 
            "/WEB-INF/flows/view-contact-taskflow.xml#view-contact-taskflow");
        return null;
    }
    
    
    
    public String goInteraction(){
        goPlace("OpportunityInteractionsIterator",
            "ActivityTitle",
            "PointerId","InteractionId", 
            "/WEB-INF/flows/view-interactions-taskflow.xml#view-interactions-taskflow");
        return null;
    }
    
    public String goTask(){
        goPlace("OpportunityTaskIterator",
            "ActivityTitle",
            "PointerId","TaskId", 
            "/WEB-INF/flows/view-task-taskflow.xml#view-task-taskflow");
        return null;
    }
    
    public String goAppointment(){
        goPlace("OpportunityAppointmentsIterator",
            "ActivityTitle",
            "AppointmentId","AppointmentId", 
            "/WEB-INF/flows/view-appointment-taskflow.xml#view-appointment-taskflow");
        return null;
    }
    
    
    public String goPlace(String iteratorName, String fieldName, String PointerName,String currentScopePointerName,  String taskflowId){
        
        System.out.println("Setting iterator as "+ iteratorName);
        System.out.println("Setting field to fetch from database as "+ fieldName);
        System.out.println("Setting pointer name as " + PointerName);
        System.out.println("Make sure that the taskflow variable in the destination taskflow is "+ PointerName);
        System.out.println("Make sure that the pageFlowScope variable containing the id is "+ currentScopePointerName);
    
        Integer id = Integer.parseInt(ADFContext.getCurrent().getPageFlowScope().get(currentScopePointerName).toString());
        System.out.println("Found the id from " +currentScopePointerName+" pageflow to be "+ id);
    
        DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();                      
        DCIteratorBinding iterator = bindings.findIteratorBinding(iteratorName);
        if(iterator == null){
            System.out.println("The iterator returned null");
            return null;
        }
        ViewObject vobj = iterator.getViewObject();
        Key key = new Key(new Object[] {id});
        if(vobj == null){
            System.out.println("The view object returned null");
            return null;
        }
        Row row[] = vobj.findByKey(key, 1);
    //Row row = vobj.getRow(key);
        if(row[0] == null){
            System.out.println("The row object returned null");
            return null;
        }
    
        System.out.println("Row identified") ;
        String tabHeading = (String)row[0].getAttribute(fieldName);
        System.out.println("Fetched "+ fieldName) ;
        Map<String, Object > m = new HashMap<String, Object> ();
        m.put("tabContext", TabContext.getCurrentInstance());
       // System.out.println("Fetched from pageFlowScope as  :" + ADFContext.getCurrent().getPageFlowScope().get(PointerName));
        //Integer value = Integer.parseInt(ADFContext.getCurrent().getPageFlowScope().get(PointerName).toString());
        m.put(PointerName, id);
        launchTab(m, tabHeading, taskflowId);
        System.out.println("Called tab with taskflow id "+ taskflowId);
        System.out.println("Done");
        return null;
    }
    
    public void launchTab(Map<String, Object> params, String tabHeading, String taskFlow){
        _launchActivity( 
          tabHeading,
          taskFlow,
          true, params); 
    }
    
    private void _launchActivity(String title, String taskflowId, boolean newTab, Map<String, Object> params) 
    { 
      try 
      { 
        if (newTab) 
        { 
            System.out.println("Calling new tab");
          TabContext.getCurrentInstance().addTab( 
            title, 
            taskflowId, params); 
        } 
        else 
        { 
          TabContext.getCurrentInstance().addOrSelectTab( 
            title, 
            taskflowId, params); 
        } 
      } 
      catch (TabContext.TabOverflowException toe) 
      { 
        // causes a dialog to be displayed to the user saying that there are 
        // too many tabs open - the new tab will not be opened... 
        toe.handleDefault();  
      } 
      
      System.out.println("Exiting launch activity");
      
      
    }
}
