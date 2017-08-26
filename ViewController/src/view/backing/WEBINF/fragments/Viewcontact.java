package view.backing.WEBINF.fragments;

import java.util.HashMap;
import java.util.Map;

import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlOutputLabel;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichQuickQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichDecorativeBox;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichImage;

import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;

import oracle.ui.pattern.dynamicShell.TabContext;

public class Viewcontact {
    private RichPanelGroupLayout pgl1;
    private RichDecorativeBox db1;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichPanelBox pb1;
    private RichImage i1;
    private RichPanelGroupLayout pgl3;
    private RichPanelTabbed pt1;
    private RichShowDetailItem tab1;
    private RichShowDetailItem tab2;
    private RichShowDetailItem tab3;
    private RichShowDetailItem tab4;
    private RichShowDetailItem tab5;
    private HtmlOutputLabel ol1;
    private HtmlOutputLabel ol2;
    private HtmlOutputLabel ol3;
    private HtmlOutputLabel ol4;
    private HtmlOutputLabel ol5;
    private HtmlOutputLabel ol6;
    private HtmlOutputLabel ol7;
    private HtmlOutputLabel ol8;
    private HtmlOutputLabel ol9;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it8;
    private RichInputText it9;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichInputText it6;
    private RichInputText it7;
    private RichButton b1;
    private RichInputText it10;
    private RichSpacer s1;
    private RichSpacer s2;
    private RichSpacer s3;
    private RichSpacer s4;
    private RichSpacer s5;
    private RichSpacer s6;
    private RichSpacer s7;
    private RichSpacer s8;
    private RichSpacer s9;
    private RichPanelGroupLayout pgl4;
    private RichPanelGroupLayout pgl5;
    private RichQuickQuery qryId1;
    private RichCommandLink cl1;
    private RichTable t1;
    private RichPanelGroupLayout pgl6;
    private RichQuickQuery qryId2;
    private RichCommandLink cl2;
    private RichTable t2;
    private RichPanelGroupLayout pgl7;
    private RichTable t3;
    private RichToolbar t4;
    private RichButton b2;
    private RichButton b3;
    private RichPanelGroupLayout pgl8;
    private RichQuickQuery qryId3;
    private RichCommandLink cl3;
    private RichTable t5;

    public Viewcontact(){
        super();
        System.out.println("Pointer Id is :"+ADFContext.getCurrent().getPageFlowScope().get("PointerId"));
    }
    
    public String goOpportunity(){
        goPlace("OpportunitiesOfContactIterator",
                "OpportunityName",
                "PointerId",
                "OpportunityId",
                "WEB-INF/flows/view-oppertunity-taskflow.xml#view-oppertunity-taskflow");
        
        return null;
    }
    
    
    public String goInteraction(){
        goPlace("InteractionsUVO1Iterator",
            "ActivityTitle",
            "PointerId","InteractionId", 
            "/WEB-INF/flows/view-interactions-taskflow.xml#view-interactions-taskflow");
        return null;
    }
    
    public String goTask(){
        goPlace("TaskUVO_arVO1Iterator",
            "ActivityTitle",
            "PointerId","TaskId", 
            "/WEB-INF/flows/view-task-taskflow.xml#view-task-taskflow");
        return null;
    }
    
    public String goAppointment(){
        goPlace("OpportunitiesOfContactIterator",
            "ActivityTitle",
            "AppointmentId","AppointmentId", 
            "/WEB-INF/flows/view-appointment-taskflow.xml#view-appointment-taskflow");
        return null;
    }
    
    public String goContact(){
        goPlace("ContactListIterator",
            "ContactName",
            "PointerId","ContactId", 
            "/WEB-INF/flows/view-contact-taskflow.xml#view-contact-taskflow");
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

    public void setPgl2(RichPanelGridLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGridLayout getPgl2() {
        return pgl2;
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

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
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

    public void setTab5(RichShowDetailItem tab5) {
        this.tab5 = tab5;
    }

    public RichShowDetailItem getTab5() {
        return tab5;
    }

    public void setOl1(HtmlOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public HtmlOutputLabel getOl1() {
        return ol1;
    }

    public void setOl2(HtmlOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public HtmlOutputLabel getOl2() {
        return ol2;
    }

    public void setOl3(HtmlOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public HtmlOutputLabel getOl3() {
        return ol3;
    }

    public void setOl4(HtmlOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public HtmlOutputLabel getOl4() {
        return ol4;
    }

    public void setOl5(HtmlOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public HtmlOutputLabel getOl5() {
        return ol5;
    }

    public void setOl6(HtmlOutputLabel ol6) {
        this.ol6 = ol6;
    }

    public HtmlOutputLabel getOl6() {
        return ol6;
    }

    public void setOl7(HtmlOutputLabel ol7) {
        this.ol7 = ol7;
    }

    public HtmlOutputLabel getOl7() {
        return ol7;
    }

    public void setOl8(HtmlOutputLabel ol8) {
        this.ol8 = ol8;
    }

    public HtmlOutputLabel getOl8() {
        return ol8;
    }

    public void setOl9(HtmlOutputLabel ol9) {
        this.ol9 = ol9;
    }

    public HtmlOutputLabel getOl9() {
        return ol9;
    }


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
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


    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
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

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }


    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
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

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }

    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }

    public void setS6(RichSpacer s6) {
        this.s6 = s6;
    }

    public RichSpacer getS6() {
        return s6;
    }

    public void setS7(RichSpacer s7) {
        this.s7 = s7;
    }

    public RichSpacer getS7() {
        return s7;
    }

    public void setS8(RichSpacer s8) {
        this.s8 = s8;
    }

    public RichSpacer getS8() {
        return s8;
    }

    public void setS9(RichSpacer s9) {
        this.s9 = s9;
    }

    public RichSpacer getS9() {
        return s9;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }


    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
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

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }


    public void setQryId2(RichQuickQuery qryId2) {
        this.qryId2 = qryId2;
    }

    public RichQuickQuery getQryId2() {
        return qryId2;
    }

    public void setCl2(RichCommandLink cl2) {
        this.cl2 = cl2;
    }

    public RichCommandLink getCl2() {
        return cl2;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }


    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }

    public void setT4(RichToolbar t4) {
        this.t4 = t4;
    }

    public RichToolbar getT4() {
        return t4;
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

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }


    public void setQryId3(RichQuickQuery qryId3) {
        this.qryId3 = qryId3;
    }

    public RichQuickQuery getQryId3() {
        return qryId3;
    }

    public void setCl3(RichCommandLink cl3) {
        this.cl3 = cl3;
    }

    public RichCommandLink getCl3() {
        return cl3;
    }

    public void setT5(RichTable t5) {
        this.t5 = t5;
    }

    public RichTable getT5() {
        return t5;
    }
}
