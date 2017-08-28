package view.backing.WEBINF.flows;


import java.util.HashMap;
import java.util.Map;

import javax.faces.component.UISelectItems;

import javax.faces.component.html.HtmlOutputLabel;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuickQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichDecorativeBox;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichActiveOutputText;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;

import oracle.ui.pattern.dynamicShell.TabContext;


public class ViewCustomer {


    private RichPanelGridLayout pgl1;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichImage i1;
    private RichPanelGroupLayout pgl2;
    private RichLink l1;
    private RichGridCell gc5;
    private RichDecorativeBox db1;
    private RichPanelTabbed pt1;
    private RichShowDetailItem tab1;
    private RichShowDetailItem tab2;
    private RichShowDetailItem tab3;
    private RichShowDetailItem tab4;
    private RichSpacer s1;
    private RichSpacer s2;
    private RichPanelBox pb1;
    private RichToolbar t1;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichPanelGroupLayout pgl3;
    private RichPanelGroupLayout pgl4;
    private RichPanelHeader ph1;
    private RichQuickQuery qryId1;
    private RichCommandLink cl1;
    private RichTable t2;
    private RichSpacer s3;
    private RichToolbar t3;
    private RichButton b4;
    private RichButton b5;
    private RichButton b6;
    private RichToolbar t4;
    private RichButton b7;
    private RichButton b9;
    private RichToolbar t6;
    private RichButton b10;
    private RichButton b11;
    private RichButton b12;
    private RichPanelGroupLayout pgl6;
    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichPanelGroupLayout pgl7;
    private RichTable t9;
    private RichInputText it2;
    private RichSpacer s4;
    private RichInputText it4;
    private RichInputText it5;
    private RichButton b13;
    private RichOutputLabel ol3;
    private RichPanelGroupLayout pgl9;
    private RichQuickQuery qq1;
    private RichCommandLink cl2;
    private RichTable t5;
    private RichQuickQuery qq3;
    private RichCommandLink cl4;
    private RichQuickQuery qq4;
    private RichCommandLink cl5;
    private RichTable t7;
    private RichShowDetailItem sdi1;
    private RichToolbar t11;
    private RichButton b14;
    private RichButton b15;
    private RichButton b16;
    private RichPanelGroupLayout pgl5;
    private RichQuickQuery qq5;
    private RichCommandLink cl6;
    private RichPanelGroupLayout pgl8;
    private RichQuickQuery qq2;
    private RichCommandLink cl3;
    private RichTable t8;
    private RichPopup p1;
    private RichDialog d1;
    private RichInputText it6;
    private RichInputText it7;
    private HtmlOutputLabel ol4;
    private RichInputText it16;
    private RichInputText it17;
    private RichInputText it18;
    private RichSpacer s7;

    private RichPanelFormLayout pfl1;
    private RichInputText it8;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichInputText it9;
    private RichInputText it10;
    private RichSelectOneChoice soc4;
    private UISelectItems si4;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichSelectOneChoice soc12;
    private UISelectItems si12;
    private RichInputText it11;
    private RichInputText it12;
    private RichInputText it13;
    private RichInputText it14;
    private RichInputText it15;
    private RichDialog d2;
    private RichPanelFormLayout pfl2;
    private RichInputText it1;
    private RichInputText it19;
    private RichInputText it20;
    private RichSelectOneChoice soc7;
    private UISelectItems si7;
    private RichSelectOneChoice soc8;
    private UISelectItems si8;
    private RichSelectOneChoice soc9;
    private UISelectItems si9;
    private RichSelectOneChoice soc10;
    private UISelectItems si10;
    private RichSelectOneChoice soc11;
    private UISelectItems si11;
    private RichInputDate id1;
    private RichInputText it21;
    private RichPopup p3;
    private RichDialog d3;
    private RichOutputText ot32;
    private RichPopup p4;
    private RichPanelGroupLayout pgl10;
    private RichTable t10;
    private RichSelectOneChoice soc6;
    private UISelectItems si6;
    private RichPopup p2;
    private RichDialog d4;
    private RichActiveOutputText aot1;
    private RichPopup p5;
    private RichPopup p6;
    private RichDialog d5;
    private RichPanelFormLayout pfl3;
    private RichInputText it23;
    private RichInputDate id2;
    private RichSelectOneChoice soc13;
    private UISelectItems si13;
    private RichInputText it25;
    private RichSelectOneChoice soc14;
    private UISelectItems si14;
    private RichInputText it26;
    private RichDialog d6;
    private RichOutputText ot38;
    private RichPopup p7;
    private RichPopup p8;
    private RichDialog d7;
    private RichPanelFormLayout pfl4;
    private RichInputText it27;
    private RichInputDate id3;
    private RichInputText it28;
    private RichDialog d8;
    private RichOutputText ot39;
    private RichPopup p9;
    private RichDialog d9;
    private RichPanelFormLayout pfl5;
    private RichInputDate id4;
    private RichInputText it30;
    private RichInputText it31;
    private RichPopup p10;
    private RichPopup p11;
    private RichDialog d10;
    private RichPanelFormLayout pfl6;
    private RichInputText it24;
    private RichInputDate id5;
    private RichInputDate id6;
    private RichInputText it29;
    private RichInputText it32;
    private RichInputText it33;
    private RichDialog d11;
    private RichOutputText ot40;
    private RichSelectOneChoice soc15;
    private UISelectItems si15;

    public ViewCustomer(){
        
    }

    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }


    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }


    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }


    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }


    public void setDb1(RichDecorativeBox db1) {
        this.db1 = db1;
    }

    public RichDecorativeBox getDb1() {
        return db1;
    }


    public void setPt1(RichPanelTabbed pt1) {
        this.pt1 = pt1;
    }

    public RichPanelTabbed getPt1() {
        return pt1;
    }

    public void setTab1(RichShowDetailItem tab1) {
        this.tab1 = tab1;
    }

    public RichShowDetailItem getTab1() {
        return tab1;
    }

    public void setTab2(RichShowDetailItem tab2) {
        this.tab2 = tab2;
    }

    public RichShowDetailItem getTab2() {
        return tab2;
    }

    public void setTab3(RichShowDetailItem tab3) {
        this.tab3 = tab3;
    }

    public RichShowDetailItem getTab3() {
        return tab3;
    }

    public void setTab4(RichShowDetailItem tab4) {
        this.tab4 = tab4;
    }

    public RichShowDetailItem getTab4() {
        return tab4;
    }


    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }


    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
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

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }


    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }


    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
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

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }


    public void setT3(RichToolbar t3) {
        this.t3 = t3;
    }

    public RichToolbar getT3() {
        return t3;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public void setT4(RichToolbar t4) {
        this.t4 = t4;
    }

    public RichToolbar getT4() {
        return t4;
    }

    public void setB7(RichButton b7) {
        this.b7 = b7;
    }

    public RichButton getB7() {
        return b7;
    }


    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }


    public void setT6(RichToolbar t6) {
        this.t6 = t6;
    }

    public RichToolbar getT6() {
        return t6;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }

    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }

    public void setB12(RichButton b12) {
        this.b12 = b12;
    }

    public RichButton getB12() {
        return b12;
    }


    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
    }


    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }


    public void setT9(RichTable t9) {
        this.t9 = t9;
    }

    public RichTable getT9() {
        return t9;
    }
    
    public String goOpportunity(){
        String iteratorName = "OppertunityOfCustomerIterator";
        String fieldName = "OpportunityName";
        String PointerName = "PointerId";
        
        
        Integer id = Integer.parseInt(ADFContext.getCurrent().getPageFlowScope().get(PointerName).toString());
        
        DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();                      
        DCIteratorBinding iterator = bindings.findIteratorBinding(iteratorName);
        ViewObject vobj = iterator.getViewObject();
        Key key = new Key(new Object[] {id});
        Row row = vobj.getRow(key);
        
        //RowSetIterator rsi = iterator.getRowSetIterator();
        //Row row = rsi.findByKey(key, 1)[0];
        
        String tabHeading = "Opp-"+(String)row.getAttribute(fieldName);
        Map<String, Object > m = new HashMap<String, Object> ();
        m.put("tabContext", TabContext.getCurrentInstance());
        System.out.println("Pointer id in go :" + ADFContext.getCurrent().getPageFlowScope().get("PointerId"));
        Integer value = Integer.parseInt(ADFContext.getCurrent().getPageFlowScope().get("PointerId").toString());
        m.put("PointerId", value);
        viewOppertunityActivity(m, tabHeading);
        System.out.println("Done");
        return null;
    }
    
//    public String goContact(){
//        String iteratorName = "CustomerContactsIterator";
//        Integer id = Integer.parseInt(ADFContext.getCurrent().getPageFlowScope().get("PointerId").toString());
//        String fieldName = "ContactName";
//        //String PointerName = "ContactId";
//        
//        
//        
//        System.out.println("Id passed on by view customer is "+ id);
//        DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();                      
//        DCIteratorBinding iterator = bindings.findIteratorBinding(iteratorName);
//        ViewObject vobj = iterator.getViewObject();
//        Key key = new Key(new Object[] {id});
//        Row row = vobj.getRow(key);
//        String tabHeading = "Contact-"+(String)row.getAttribute(fieldName);
//        
//        Map<String, Object > m = new HashMap<String, Object> ();
//        m.put("tabContext", TabContext.getCurrentInstance());
//        m.put("PointerId", id);
//        
//        viewContactActivity(m, tabHeading);
//        return null;
//    }

    
    public String goAppointments(){
    String iteratorName = "AppointmentDisplayIterator";
    String fieldName = "ActivityTitle";
    String PointerName = "AppointmentId";
    String taskflowId = "WEB-INF/flows/view-appointment-taskflow.xml#view-appointment-taskflow";
    
        System.out.println("Setting iterator as "+ iteratorName);
        System.out.println("Setting field to fetch from database as "+ fieldName);
        System.out.println("Setting pointer name as " + PointerName);
        System.out.println("Make sure that the taskflow variable in the destination taskflow is "+ PointerName);
        System.out.println("Make sure that the pageFlowScope variable containing the id is "+ PointerName);
    
    Integer id = Integer.parseInt(ADFContext.getCurrent().getPageFlowScope().get(PointerName).toString());
    System.out.println("Found the id from the pageflow to be "+ id);
    
    DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();                      
    DCIteratorBinding iterator = bindings.findIteratorBinding(iteratorName);
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
    String tabHeading = "Appointment-"+(String)row[0].getAttribute(fieldName);
        System.out.println("Fetched "+ fieldName) ;
    Map<String, Object > m = new HashMap<String, Object> ();
    m.put("tabContext", TabContext.getCurrentInstance());
    System.out.println("Fetched from pageFlowScope as  :" + ADFContext.getCurrent().getPageFlowScope().get(PointerName));
    Integer value = Integer.parseInt(ADFContext.getCurrent().getPageFlowScope().get(PointerName).toString());
    m.put(PointerName, id);
    launchTab(m, tabHeading, taskflowId);
    System.out.println("Called tab with taskflow id "+ taskflowId);
    System.out.println("Done");
    return null;
    }
    
    public String goTask(){
        goPlace("CustomerTasksIterator",
                "ActivityTitle",
                "TaskId",
                "WEB-INF/flows/view-task-taskflow.xml#view-task-taskflow");
        return null;
    }
    
    public String goContactv2(){
        goPlacev2("CustomerContactsIterator",
                "ContactName",
                "PointerId","ContactId",
                "WEB-INF/flows/view-contact-taskflow.xml#view-contact-taskflow");
        return null;
    }
    
    public String goPlacev2(String iteratorName, String fieldName, String PointerName,String currentScopePointerName,  String taskflowId){
        
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
        
        m.put(PointerName, id);
        launchTab(m, tabHeading, taskflowId);
        System.out.println("Called tab with taskflow id "+ taskflowId);
        System.out.println("Done");
        return null;
    }
    
    public String goPlace(String iteratorName, String fieldName, String PointerName, String taskflowId){
        
        System.out.println("Setting iterator as "+ iteratorName);
        System.out.println("Setting field to fetch from database as "+ fieldName);
        System.out.println("Setting pointer name as " + PointerName);
        System.out.println("Make sure that the taskflow variable in the destination taskflow is "+ PointerName);
        System.out.println("Make sure that the pageFlowScope variable containing the id is "+ PointerName);
    
        Integer id = Integer.parseInt(ADFContext.getCurrent().getPageFlowScope().get(PointerName).toString());
        System.out.println("Found the id from the pageflow to be "+ id);
    
        DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();                      
        DCIteratorBinding iterator = bindings.findIteratorBinding(iteratorName);
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
        System.out.println("Fetched from pageFlowScope as  :" + ADFContext.getCurrent().getPageFlowScope().get(PointerName));
        Integer value = Integer.parseInt(ADFContext.getCurrent().getPageFlowScope().get(PointerName).toString());
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
    
    
    
    
    public void viewContactActivity(Map<String, Object> params, String tabHeading){
        _launchActivity( 
          tabHeading, 
          "/WEB-INF/flows/view-contact-taskflow.xml#view-contact-taskflow",  
          true, params); 
    }
    
    public void viewOppertunityActivity(Map<String, Object> params, String companyName) 
      { 
        /** 
        * Example method when called repeatedly, will open another instance as 
        * oppose to selecting a previously opened tab instance. Note the boolean 
        * to create another tab instance is set to true. 
        */ 
        System.out.println("Calling activity");
        _launchActivity( 
          companyName, 
          "/WEB-INF/flows/view-oppertunity-taskflow.xml#view-oppertunity-taskflow",  
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


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }


    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }


    public void setB13(RichButton b13) {
        this.b13 = b13;
    }

    public RichButton getB13() {
        return b13;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }


    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }


    public void setQq1(RichQuickQuery qq1) {
        this.qq1 = qq1;
    }

    public RichQuickQuery getQq1() {
        return qq1;
    }

    public void setCl2(RichCommandLink cl2) {
        this.cl2 = cl2;
    }

    public RichCommandLink getCl2() {
        return cl2;
    }

    public void setT5(RichTable t5) {
        this.t5 = t5;
    }

    public RichTable getT5() {
        return t5;
    }


    public void setQq3(RichQuickQuery qq3) {
        this.qq3 = qq3;
    }

    public RichQuickQuery getQq3() {
        return qq3;
    }

    public void setCl4(RichCommandLink cl4) {
        this.cl4 = cl4;
    }

    public RichCommandLink getCl4() {
        return cl4;
    }


    public void setQq4(RichQuickQuery qq4) {
        this.qq4 = qq4;
    }

    public RichQuickQuery getQq4() {
        return qq4;
    }

    public void setCl5(RichCommandLink cl5) {
        this.cl5 = cl5;
    }

    public RichCommandLink getCl5() {
        return cl5;
    }

    public void setT7(RichTable t7) {
        this.t7 = t7;
    }

    public RichTable getT7() {
        return t7;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setT11(RichToolbar t11) {
        this.t11 = t11;
    }

    public RichToolbar getT11() {
        return t11;
    }

    public void setB14(RichButton b14) {
        this.b14 = b14;
    }

    public RichButton getB14() {
        return b14;
    }

    public void setB15(RichButton b15) {
        this.b15 = b15;
    }

    public RichButton getB15() {
        return b15;
    }

    public void setB16(RichButton b16) {
        this.b16 = b16;
    }

    public RichButton getB16() {
        return b16;
    }


    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }


    public void setQq5(RichQuickQuery qq5) {
        this.qq5 = qq5;
    }

    public RichQuickQuery getQq5() {
        return qq5;
    }

    public void setCl6(RichCommandLink cl6) {
        this.cl6 = cl6;
    }

    public RichCommandLink getCl6() {
        return cl6;
    }


    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }


    public void setQq2(RichQuickQuery qq2) {
        this.qq2 = qq2;
    }

    public RichQuickQuery getQq2() {
        return qq2;
    }

    public void setCl3(RichCommandLink cl3) {
        this.cl3 = cl3;
    }

    public RichCommandLink getCl3() {
        return cl3;
    }

    public void setT8(RichTable t8) {
        this.t8 = t8;
    }

    public RichTable getT8() {
        return t8;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }
    public void insertPopupFetchListener(PopupFetchEvent popupFetchEvent){
        System.out.println(popupFetchEvent.getLaunchSourceClientId());
        if(popupFetchEvent.getLaunchSourceClientId().contains("b4"))
        {
            BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
            operationBinding.execute();
            
            
        }
    }
    public void insertDialogListener(DialogEvent dialogEvent) {
       
            if(dialogEvent.getOutcome().name().equals("ok")==true) {
               
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                operationBinding.execute();
                DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("CreateContact1Iterator");
                RowSetIterator rsi = iter.getRowSetIterator();
                Row row = rsi.getCurrentRow();
                row.setAttribute("Address",row.getAttribute("AddressId"));
                operationBinding.execute();
                DCBindingContainer bc = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
                DCIteratorBinding iter1 = bc.findIteratorBinding("CreateContact1Iterator");
                DCIteratorBinding iter2 = bc.findIteratorBinding("CustomerListIterator");
                Row row1 = iter1.getCurrentRow();
                Row row2 = iter2.getCurrentRow();
                OperationBinding op = bindings.getOperationBinding("populateCusConJun");
                op.getParamsMap().put("aId", row2.getAttribute("AccountId"));
                op.getParamsMap().put("cId", row1.getAttribute("ContactId"));
                op.execute();
                operationBinding.execute();
                
                
            } else if(dialogEvent.getOutcome().name().equals("Closed")==true){
              
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                operationBinding.execute();
                
            }
       
    }
    
    public void deleteDialogListener(DialogEvent dialogEvent) {
            if(dialogEvent.getOutcome().name().equals("yes")) {
               
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Delete");
                operationBinding.execute();
                operationBinding = bindings.getOperationBinding("Commit");
                operationBinding.execute();
                
            } else if(dialogEvent.getOutcome().name().equals("no")){
              
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                operationBinding.execute();
                
            }
       
    }
    public void cancelPopupListener(PopupCanceledEvent popupCanceledEvent){
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        
    }
    
    
    
    public void insertOppPopupFetchListener(PopupFetchEvent popupFetchEvent){
        System.out.println(popupFetchEvent.getLaunchSourceClientId());
        if(popupFetchEvent.getLaunchSourceClientId().contains("b1"))
        {
            BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert1");
            operationBinding.execute();
            
            
            
            
        }
    }
    public void insertOppDialogListener(DialogEvent dialogEvent) {
       
            if(dialogEvent.getOutcome().name().equals("ok")==true) {
               
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                operationBinding.execute();
                DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("CustomerListIterator");
                Row row1 = iter.getCurrentRow();
                DCIteratorBinding iter1 = bindings2.findIteratorBinding("CreateOpportunity1Iterator");
                RowSetIterator rsi = iter1.getRowSetIterator();
                Row row = rsi.getCurrentRow();
                row.setAttribute("AccId", row1.getAttribute("AccountId"));
                row.setAttribute("CreatorId",Integer.parseInt(ADFContext.getCurrent().getSessionScope().get("CURRENT_USER_ID").toString()));
                operationBinding.execute();
                
                
            } else if(dialogEvent.getOutcome().name().equals("Closed")==true){
              
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                operationBinding.execute();
                
            }
       
    }
    public void cancelOppPopupListener(PopupCanceledEvent popupCanceledEvent){
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        
    }
    public void deleteOppDialogListener(DialogEvent dialogEvent) {
            if(dialogEvent.getOutcome().name().equals("yes")) {
               
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
                operationBinding.execute();
                operationBinding = bindings.getOperationBinding("Commit");
                operationBinding.execute();
                
            } else if(dialogEvent.getOutcome().name().equals("no")){
              
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                operationBinding.execute();
                
            }
       
    }

    public void setD1(RichDialog d1) {
        this.d1 = d1;
    }

    public RichDialog getD1() {
        return d1;
    }


    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setOl4(HtmlOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public HtmlOutputLabel getOl4() {
        return ol4;
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }

    public void setIt17(RichInputText it17) {
        this.it17 = it17;
    }

    public RichInputText getIt17() {
        return it17;
    }

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
    }


    public void setS7(RichSpacer s7) {
        this.s7 = s7;
    }

    public RichSpacer getS7() {
        return s7;
    }


    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }


    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }

    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }

    public void setSoc12(RichSelectOneChoice soc12) {
        this.soc12 = soc12;
    }

    public RichSelectOneChoice getSoc12() {
        return soc12;
    }

    public void setSi12(UISelectItems si12) {
        this.si12 = si12;
    }

    public UISelectItems getSi12() {
        return si12;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
    }


    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt19(RichInputText it19) {
        this.it19 = it19;
    }

    public RichInputText getIt19() {
        return it19;
    }


    public void setIt20(RichInputText it20) {
        this.it20 = it20;
    }

    public RichInputText getIt20() {
        return it20;
    }

    public void setSoc7(RichSelectOneChoice soc7) {
        this.soc7 = soc7;
    }

    public RichSelectOneChoice getSoc7() {
        return soc7;
    }

    public void setSi7(UISelectItems si7) {
        this.si7 = si7;
    }

    public UISelectItems getSi7() {
        return si7;
    }

    public void setSoc8(RichSelectOneChoice soc8) {
        this.soc8 = soc8;
    }

    public RichSelectOneChoice getSoc8() {
        return soc8;
    }

    public void setSi8(UISelectItems si8) {
        this.si8 = si8;
    }

    public UISelectItems getSi8() {
        return si8;
    }

    public void setSoc9(RichSelectOneChoice soc9) {
        this.soc9 = soc9;
    }

    public RichSelectOneChoice getSoc9() {
        return soc9;
    }

    public void setSi9(UISelectItems si9) {
        this.si9 = si9;
    }

    public UISelectItems getSi9() {
        return si9;
    }

    public void setSoc10(RichSelectOneChoice soc10) {
        this.soc10 = soc10;
    }

    public RichSelectOneChoice getSoc10() {
        return soc10;
    }

    public void setSi10(UISelectItems si10) {
        this.si10 = si10;
    }

    public UISelectItems getSi10() {
        return si10;
    }

    public void setSoc11(RichSelectOneChoice soc11) {
        this.soc11 = soc11;
    }

    public RichSelectOneChoice getSoc11() {
        return soc11;
    }

    public void setSi11(UISelectItems si11) {
        this.si11 = si11;
    }

    public UISelectItems getSi11() {
        return si11;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setIt21(RichInputText it21) {
        this.it21 = it21;
    }

    public RichInputText getIt21() {
        return it21;
    }

    public void setP3(RichPopup p3) {
        this.p3 = p3;
    }

    public RichPopup getP3() {
        return p3;
    }

    public void setD3(RichDialog d3) {
        this.d3 = d3;
    }

    public RichDialog getD3() {
        return d3;
    }

    public void setOt32(RichOutputText ot32) {
        this.ot32 = ot32;
    }

    public RichOutputText getOt32() {
        return ot32;
    }

    public void setP4(RichPopup p4) {
        this.p4 = p4;
    }

    public RichPopup getP4() {
        return p4;
    }


    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setT10(RichTable t10) {
        this.t10 = t10;
    }

    public RichTable getT10() {
        return t10;
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }

    public void setSi6(UISelectItems si6) {
        this.si6 = si6;
    }

    public UISelectItems getSi6() {
        return si6;
    }

    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setD4(RichDialog d4) {
        this.d4 = d4;
    }

    public RichDialog getD4() {
        return d4;
    }

    public void setAot1(RichActiveOutputText aot1) {
        this.aot1 = aot1;
    }

    public RichActiveOutputText getAot1() {
        return aot1;
    }

    public void setP5(RichPopup p5) {
        this.p5 = p5;
    }

    public RichPopup getP5() {
        return p5;
    }

    public void setP6(RichPopup p6) {
        this.p6 = p6;
    }

    public RichPopup getP6() {
        return p6;
    }
    public void insertTaskPopupFetchListener(PopupFetchEvent popupFetchEvent){
            System.out.println(popupFetchEvent.getLaunchSourceClientId());
            
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert2");
                operationBinding.execute();
                
           
        }
    public void insertTaskDialogListener(DialogEvent dialogEvent) {
           
                if(dialogEvent.getOutcome().name().equals("ok")==true) {
                   System.out.println("Enter commit");
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("CreateTask1Iterator");
                    DCIteratorBinding iter1 = (DCIteratorBinding)bindings2.findIteratorBinding("CustomerListIterator");
                    DCIteratorBinding iter2 = (DCIteratorBinding)bindings2.findIteratorBinding("CustomerTasksIterator");
                    Row row = iter.getCurrentRow();
                    Row row1 = iter1.getCurrentRow();
                    
                    System.out.println("Before commit");
                    row.setAttribute("AccountId",Integer.parseInt(row1.getAttribute("AccountId").toString()));
                    row.setAttribute("ACreatorId", Integer.parseInt(ADFContext.getCurrent().getSessionScope().get("CURRENT_USER_ID").toString()));
                    operationBinding.execute();
                
                    iter2.executeQuery();
                    
                    
                    
                } else if(dialogEvent.getOutcome().name().equals("Closed")==true){
                  
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                    operationBinding.execute();
                    
                }
           
        }
    public void deleteTaskDialogListener(DialogEvent dialogEvent) {
                if(dialogEvent.getOutcome().name().equals("yes")) {
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("CustomerTasksIterator");
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Delete2");
                    operationBinding.execute();
                    operationBinding = bindings.getOperationBinding("Commit");
                    operationBinding.execute();
                    iter.executeQuery();
                    
                } else if(dialogEvent.getOutcome().name().equals("no")){
                  
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                    operationBinding.execute();
                    
                }
           
        }
    
    public void insertNotePopupFetchListener(PopupFetchEvent popupFetchEvent){
            System.out.println(popupFetchEvent.getLaunchSourceClientId());
            
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert3");
                operationBinding.execute();
                
           
        }
    public void insertNoteDialogListener(DialogEvent dialogEvent) {
           
                if(dialogEvent.getOutcome().name().equals("ok")==true) {
                   System.out.println("Enter commit");
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("CreateNotesU1Iterator");
                    DCIteratorBinding iter1 = (DCIteratorBinding)bindings2.findIteratorBinding("CustomerListIterator");
                    DCIteratorBinding iter2 = (DCIteratorBinding)bindings2.findIteratorBinding("NotesUVO_arVO1Iterator");
                    Row row = iter.getCurrentRow();
                    Row row1 = iter1.getCurrentRow();
                    
                    System.out.println("Before commit");
                    
                    row.setAttribute("NoteCreatorId", Integer.parseInt(ADFContext.getCurrent().getSessionScope().get("CURRENT_USER_ID").toString()));
                    operationBinding.execute();
                    OperationBinding op = bindings.getOperationBinding("populateCustNoteJun");
                    op.getParamsMap().put("nId", Integer.parseInt(row.getAttribute("NoteId").toString()));
                    op.getParamsMap().put("cId", Integer.parseInt(row1.getAttribute("AccountId").toString()));
                    op.execute();
                
                    iter2.executeQuery();
                    
                    
                    
                } else if(dialogEvent.getOutcome().name().equals("Closed")==true){
                  
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                    operationBinding.execute();
                    
                }
           
        }
    public void deleteNoteDialogListener(DialogEvent dialogEvent) {
                if(dialogEvent.getOutcome().name().equals("yes")) {
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("NotesUVO_arVO1Iterator");
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Delete3");
                    operationBinding.execute();
                    operationBinding = bindings.getOperationBinding("Commit");
                    operationBinding.execute();
                    iter.executeQuery();
                    
                } else if(dialogEvent.getOutcome().name().equals("no")){
                  
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                    operationBinding.execute();
                    
                }
           
        }
    public void editNoteDialogListener(DialogEvent dialogEvent) {
           
                if(dialogEvent.getOutcome().name().equals("ok")==true) {
                   System.out.println("Enter commit");
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                    operationBinding.execute();
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter2 = (DCIteratorBinding)bindings2.findIteratorBinding("NotesUVO_arVO1Iterator");
                   
                    iter2.executeQuery();
                    
                    
                    
                } else if(dialogEvent.getOutcome().name().equals("Closed")==true){
                  
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                    operationBinding.execute();
                    
                }
           
        }
    public void insertAppoPopupFetchListener(PopupFetchEvent popupFetchEvent){
            System.out.println(popupFetchEvent.getLaunchSourceClientId());
            
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert4");
                operationBinding.execute();
                
           
        }
    public void insertAppoDialogListener(DialogEvent dialogEvent) {
           
                if(dialogEvent.getOutcome().name().equals("ok")==true) {
                   System.out.println("Enter commit");
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("CreateAppointmentU1Iterator");
                    DCIteratorBinding iter1 = (DCIteratorBinding)bindings2.findIteratorBinding("CustomerListIterator");
                    DCIteratorBinding iter2 = (DCIteratorBinding)bindings2.findIteratorBinding("AppointmentsIterator");
                    Row row = iter.getCurrentRow();
                    Row row1 = iter1.getCurrentRow();
                    System.out.println("Before commit");
                    
                    row.setAttribute("AccountId",Integer.parseInt(row1.getAttribute("AccountId").toString()));
                    row.setAttribute("ACreatorId", Integer.parseInt(ADFContext.getCurrent().getSessionScope().get("CURRENT_USER_ID").toString()));
                    operationBinding.execute();
                    row.setAttribute("AAppLocationId", Integer.parseInt(row.getAttribute("AddressId").toString()));
                    operationBinding.execute();
                    
                    iter2.executeQuery();
                    
                    
                    
                } else if(dialogEvent.getOutcome().name().equals("Closed")==true){
                  
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                    operationBinding.execute();
                    
                }
           
        }
    public void deleteAppoDialogListener(DialogEvent dialogEvent) {
                if(dialogEvent.getOutcome().name().equals("yes")) {
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("AppointmentsIterator");
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Delete4it add");
                    operationBinding.execute();
                    operationBinding = bindings.getOperationBinding("Commit");
                    operationBinding.execute();
                    iter.executeQuery();
                    
                } else if(dialogEvent.getOutcome().name().equals("no")){
                  
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                    operationBinding.execute();
                    
                }
           
        }

    public void setD5(RichDialog d5) {
        this.d5 = d5;
    }

    public RichDialog getD5() {
        return d5;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setIt23(RichInputText it23) {
        this.it23 = it23;
    }

    public RichInputText getIt23() {
        return it23;
    }


    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setSoc13(RichSelectOneChoice soc13) {
        this.soc13 = soc13;
    }

    public RichSelectOneChoice getSoc13() {
        return soc13;
    }

    public void setSi13(UISelectItems si13) {
        this.si13 = si13;
    }

    public UISelectItems getSi13() {
        return si13;
    }

    public void setIt25(RichInputText it25) {
        this.it25 = it25;
    }

    public RichInputText getIt25() {
        return it25;
    }

    public void setSoc14(RichSelectOneChoice soc14) {
        this.soc14 = soc14;
    }

    public RichSelectOneChoice getSoc14() {
        return soc14;
    }

    public void setSi14(UISelectItems si14) {
        this.si14 = si14;
    }

    public UISelectItems getSi14() {
        return si14;
    }

    public void setIt26(RichInputText it26) {
        this.it26 = it26;
    }

    public RichInputText getIt26() {
        return it26;
    }

    public void setD6(RichDialog d6) {
        this.d6 = d6;
    }

    public RichDialog getD6() {
        return d6;
    }

    public void setOt38(RichOutputText ot38) {
        this.ot38 = ot38;
    }

    public RichOutputText getOt38() {
        return ot38;
    }

    public void setP7(RichPopup p7) {
        this.p7 = p7;
    }

    public RichPopup getP7() {
        return p7;
    }

    public void setP8(RichPopup p8) {
        this.p8 = p8;
    }

    public RichPopup getP8() {
        return p8;
    }

    public void setD7(RichDialog d7) {
        this.d7 = d7;
    }

    public RichDialog getD7() {
        return d7;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }

    public void setIt27(RichInputText it27) {
        this.it27 = it27;
    }

    public RichInputText getIt27() {
        return it27;
    }

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }

    public void setIt28(RichInputText it28) {
        this.it28 = it28;
    }

    public RichInputText getIt28() {
        return it28;
    }


    public void setD8(RichDialog d8) {
        this.d8 = d8;
    }

    public RichDialog getD8() {
        return d8;
    }

    public void setOt39(RichOutputText ot39) {
        this.ot39 = ot39;
    }

    public RichOutputText getOt39() {
        return ot39;
    }

    public void setP9(RichPopup p9) {
        this.p9 = p9;
    }

    public RichPopup getP9() {
        return p9;
    }

    public void setD9(RichDialog d9) {
        this.d9 = d9;
    }

    public RichDialog getD9() {
        return d9;
    }

    public void setPfl5(RichPanelFormLayout pfl5) {
        this.pfl5 = pfl5;
    }

    public RichPanelFormLayout getPfl5() {
        return pfl5;
    }

    public void setId4(RichInputDate id4) {
        this.id4 = id4;
    }

    public RichInputDate getId4() {
        return id4;
    }

    public void setIt30(RichInputText it30) {
        this.it30 = it30;
    }

    public RichInputText getIt30() {
        return it30;
    }

    public void setIt31(RichInputText it31) {
        this.it31 = it31;
    }

    public RichInputText getIt31() {
        return it31;
    }

    public void setP10(RichPopup p10) {
        this.p10 = p10;
    }

    public RichPopup getP10() {
        return p10;
    }

    public void setP11(RichPopup p11) {
        this.p11 = p11;
    }

    public RichPopup getP11() {
        return p11;
    }

    public void setD10(RichDialog d10) {
        this.d10 = d10;
    }

    public RichDialog getD10() {
        return d10;
    }

    public void setPfl6(RichPanelFormLayout pfl6) {
        this.pfl6 = pfl6;
    }

    public RichPanelFormLayout getPfl6() {
        return pfl6;
    }

    public void setIt24(RichInputText it24) {
        this.it24 = it24;
    }

    public RichInputText getIt24() {
        return it24;
    }

    public void setId5(RichInputDate id5) {
        this.id5 = id5;
    }

    public RichInputDate getId5() {
        return id5;
    }

    public void setId6(RichInputDate id6) {
        this.id6 = id6;
    }

    public RichInputDate getId6() {
        return id6;
    }

    public void setIt29(RichInputText it29) {
        this.it29 = it29;
    }

    public RichInputText getIt29() {
        return it29;
    }

    public void setIt32(RichInputText it32) {
        this.it32 = it32;
    }

    public RichInputText getIt32() {
        return it32;
    }

    public void setIt33(RichInputText it33) {
        this.it33 = it33;
    }

    public RichInputText getIt33() {
        return it33;
    }

    public void setD11(RichDialog d11) {
        this.d11 = d11;
    }

    public RichDialog getD11() {
        return d11;
    }

    public void setOt40(RichOutputText ot40) {
        this.ot40 = ot40;
    }

    public RichOutputText getOt40() {
        return ot40;
    }


    public void setSoc15(RichSelectOneChoice soc15) {
        this.soc15 = soc15;
    }

    public RichSelectOneChoice getSoc15() {
        return soc15;
    }

    public void setSi15(UISelectItems si15) {
        this.si15 = si15;
    }

    public UISelectItems getSi15() {
        return si15;
    }
}
