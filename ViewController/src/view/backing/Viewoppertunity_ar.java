package view.backing;


import java.util.HashMap;
import java.util.Map;

import javax.faces.component.UISelectItems;

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

public class Viewoppertunity_ar {
    private RichPanelGroupLayout pgl1;
    private RichDecorativeBox db1;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichImage i1;
    private RichPanelGroupLayout pgl3;
    private RichPanelBox pb1;
    private RichPanelTabbed pt1;
    private RichShowDetailItem tab4;
    private RichShowDetailItem tab3;
    private RichShowDetailItem tab1;
    private RichShowDetailItem tab2;
    private RichSpacer s1;
    private RichToolbar t1;
    private RichButton b1;
    private RichButton b3;
    private RichToolbar t2;
    private RichButton b4;
    private RichButton b6;
    private RichToolbar t3;
    private RichButton b7;
    private RichButton b9;
    private RichToolbar t4;
    private RichButton b10;
    private RichButton b12;
    private RichButton b13;
    private RichInputText it1;
    private RichInputText it2;
    private RichPanelGroupLayout pgl4;
    private RichPanelGroupLayout pgl5;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichInputText it7;
    private RichInputDate id1;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichInputText it3;
    private RichSelectOneChoice soc4;
    private UISelectItems si4;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichOutputLabel ol3;
    private RichOutputLabel ol4;
    private RichOutputLabel ol5;
    private RichOutputLabel ol6;
    private RichOutputLabel ol7;
    private RichOutputLabel ol8;
    private RichSpacer s2;
    private RichSpacer s3;
    private RichSpacer s4;
    private RichSpacer s5;
    private RichShowDetailItem sdi1;
    private RichShowDetailItem sdi2;
    private RichToolbar t5;
    private RichButton b2;
    private RichButton b5;
    private RichToolbar t6;
    private RichButton b8;
    private RichButton b11;
    private RichShowDetailItem sdi4;
    private RichToolbar t8;
    private RichButton b16;
    private RichButton b17;
    private RichTable t9;
    private RichButton b18;
    private RichOutputLabel ol9;
    private RichLink l1;
    private RichOutputText ot18;
    private RichOutputText ot19;
    private RichPanelGroupLayout pgl7;
    private RichQuickQuery qryId2;
    private RichCommandLink cl2;
    private RichTable t10;
    private RichPanelGroupLayout pgl6;
    private RichQuickQuery qryId1;
    private RichCommandLink cl1;
    private RichTable t7;
    private RichPanelGroupLayout pgl8;
    private RichQuickQuery qryId3;
    private RichCommandLink cl3;
    private RichTable t11;
    private RichPanelGroupLayout pgl9;
    private RichQuickQuery qryId4;
    private RichCommandLink cl4;
    private RichTable t12;
    private RichPanelGroupLayout pgl10;
    private RichQuickQuery qryId5;
    private RichCommandLink cl5;
    private RichTable t13;
    private RichPopup p1;
    private RichPopup p2;
    private RichPopup p3;
    private RichDialog d1;
    private RichPanelFormLayout pfl1;
    private RichSelectOneChoice soc10;
    private UISelectItems si10;
    private RichInputText it8;
    private RichInputText it9;
    private RichInputText it10;
    private RichInputText it11;
    private RichInputText it12;
    private RichDialog d2;
    private RichPanelFormLayout pfl2;
    private RichInputText it13;
    private RichInputText it14;
    private RichInputText it15;
    private RichInputText it16;
    private RichInputText it17;
    private RichDialog d3;
    private RichActiveOutputText aot1;
    private RichPopup p4;
    private RichDialog d4;
    private RichPanelFormLayout pfl3;
    private RichInputText it18;
    private RichSelectOneChoice soc11;
    private UISelectItems si11;
    private RichInputDate id2;
    private RichInputDate id3;
    private RichInputText it19;
    private RichSelectOneChoice soc12;
    private UISelectItems si12;
    private RichPopup p5;
    private RichDialog d5;
    private RichOutputText ot32;
    private RichInputText it20;


    public Viewoppertunity_ar(){
       //setRow();
       
    }
    
    public void setRow(){
        System.out.println("In constructor :" + ADFContext.getCurrent().getPageFlowScope().get("PointerId"));
        if( ADFContext.getCurrent().getPageFlowScope().get("PointerId") != null){
            String iteratorName = "OppertunityForOverviewIterator";
            Integer id = Integer.parseInt(ADFContext.getCurrent().getPageFlowScope().get("PointerId").toString());
            DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();                      
            DCIteratorBinding iterator = bindings.findIteratorBinding(iteratorName);
            ViewObject vobj = iterator.getViewObject();
            Key key = new Key(new Object[] {id});
            RowSetIterator rsi = iterator.getRowSetIterator();
            Row row = rsi.findByKey(key, 1)[0];
            System.out.println(row.getAttribute("OpportunityName"));
            rsi.setCurrentRow(row);  
            System.out.println("Done with setting the poninter from Oppertunity Backing");
        }
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

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }


    public void setPt1(RichPanelTabbed pt1) {
        this.pt1 = pt1;
    }

    public RichPanelTabbed getPt1() {
        return pt1;
    }

    public void setTab4(RichShowDetailItem tab4) {
        this.tab4 = tab4;
    }

    public RichShowDetailItem getTab4() {
        return tab4;
    }

    public void setTab3(RichShowDetailItem tab3) {
        this.tab3 = tab3;
    }

    public RichShowDetailItem getTab3() {
        return tab3;
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

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
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


    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }


    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public void setT3(RichToolbar t3) {
        this.t3 = t3;
    }

    public RichToolbar getT3() {
        return t3;
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

    public void setT4(RichToolbar t4) {
        this.t4 = t4;
    }

    public RichToolbar getT4() {
        return t4;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }


    public void setB12(RichButton b12) {
        this.b12 = b12;
    }

    public RichButton getB12() {
        return b12;
    }


    public void setB13(RichButton b13) {
        this.b13 = b13;
    }

    public RichButton getB13() {
        return b13;
    }


    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
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

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
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

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
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

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }

    public void setOl5(RichOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public RichOutputLabel getOl5() {
        return ol5;
    }

    public void setOl6(RichOutputLabel ol6) {
        this.ol6 = ol6;
    }

    public RichOutputLabel getOl6() {
        return ol6;
    }

    public void setOl7(RichOutputLabel ol7) {
        this.ol7 = ol7;
    }

    public RichOutputLabel getOl7() {
        return ol7;
    }

    public void setOl8(RichOutputLabel ol8) {
        this.ol8 = ol8;
    }

    public RichOutputLabel getOl8() {
        return ol8;
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

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
    }

    public void setT5(RichToolbar t5) {
        this.t5 = t5;
    }

    public RichToolbar getT5() {
        return t5;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setT6(RichToolbar t6) {
        this.t6 = t6;
    }

    public RichToolbar getT6() {
        return t6;
    }

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }

    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }

    public void setSdi4(RichShowDetailItem sdi4) {
        this.sdi4 = sdi4;
    }

    public RichShowDetailItem getSdi4() {
        return sdi4;
    }

    public void setT8(RichToolbar t8) {
        this.t8 = t8;
    }

    public RichToolbar getT8() {
        return t8;
    }

    public void setB16(RichButton b16) {
        this.b16 = b16;
    }

    public RichButton getB16() {
        return b16;
    }

    public void setB17(RichButton b17) {
        this.b17 = b17;
    }

    public RichButton getB17() {
        return b17;
    }


    public void setT9(RichTable t9) {
        this.t9 = t9;
    }

    public RichTable getT9() {
        return t9;
    }

    public void setB18(RichButton b18) {
        this.b18 = b18;
    }

    public RichButton getB18() {
        return b18;
    }

    public void setOl9(RichOutputLabel ol9) {
        this.ol9 = ol9;
    }

    public RichOutputLabel getOl9() {
        return ol9;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    public void setOt18(RichOutputText ot18) {
        this.ot18 = ot18;
    }

    public RichOutputText getOt18() {
        return ot18;
    }

    public void setOt19(RichOutputText ot19) {
        this.ot19 = ot19;
    }

    public RichOutputText getOt19() {
        return ot19;
    }
    
    public String goContact(){
        goPlace("PrimaryContactIterator",
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


    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
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

    public void setT10(RichTable t10) {
        this.t10 = t10;
    }

    public RichTable getT10() {
        return t10;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
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

    public void setT7(RichTable t7) {
        this.t7 = t7;
    }

    public RichTable getT7() {
        return t7;
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

    public void setT11(RichTable t11) {
        this.t11 = t11;
    }

    public RichTable getT11() {
        return t11;
    }

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }


    public void setQryId4(RichQuickQuery qryId4) {
        this.qryId4 = qryId4;
    }

    public RichQuickQuery getQryId4() {
        return qryId4;
    }

    public void setCl4(RichCommandLink cl4) {
        this.cl4 = cl4;
    }

    public RichCommandLink getCl4() {
        return cl4;
    }

    public void setT12(RichTable t12) {
        this.t12 = t12;
    }

    public RichTable getT12() {
        return t12;
    }

    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }


    public void setQryId5(RichQuickQuery qryId5) {
        this.qryId5 = qryId5;
    }

    public RichQuickQuery getQryId5() {
        return qryId5;
    }

    public void setCl5(RichCommandLink cl5) {
        this.cl5 = cl5;
    }

    public RichCommandLink getCl5() {
        return cl5;
    }

    public void setT13(RichTable t13) {
        this.t13 = t13;
    }

    public RichTable getT13() {
        return t13;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setP3(RichPopup p3) {
        this.p3 = p3;
    }

    public RichPopup getP3() {
        return p3;
    }

    public void setD1(RichDialog d1) {
        this.d1 = d1;
    }

    public RichDialog getD1() {
        return d1;
    }
    public void insertPopupFetchListener(PopupFetchEvent popupFetchEvent){
            System.out.println(popupFetchEvent.getLaunchSourceClientId());
            if(popupFetchEvent.getLaunchSourceClientId().contains("b8"))
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
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("OppertunityForOverviewIterator");
//                    RowSetIterator rsi = iter.getRowSetIterator();
                    Row row = iter.getCurrentRow();
                    System.out.println(row.getAttribute("OpportunityId"));
                    DCBindingContainer bc = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
                    DCIteratorBinding iter1 = (DCIteratorBinding) bc.findIteratorBinding("CreateItemsForOpportunityU1Iterator");
                    Row row1 = iter1.getCurrentRow();
                    row1.setAttribute("OppurtunityId",row.getAttribute("OpportunityId"));
                    operationBinding.execute();
                    iter1 = (DCIteratorBinding) bc.findIteratorBinding("RevenueItemsOfOpportunityIterator");
                    ViewObject vo = iter1.getViewObject();
                    int Brev=0, Rev=0, Wrev=0;
                    for(int i=0;i<vo.getEstimatedRowCount();i++){
                        Row row2 = vo.getRowAtRangeIndex(i);
                        int qty = Integer.parseInt(row2.getAttribute("Quantity").toString());
                        Brev = Brev + qty*Integer.parseInt(row2.getAttribute("BestCaseRevenue").toString());
                        Rev = Rev + qty*Integer.parseInt(row2.getAttribute("SettledPrice").toString());
                        Wrev = Wrev + qty*Integer.parseInt(row2.getAttribute("WorseCaseRevenue").toString());
                        
                    }
                    row.setAttribute("BestCaseRevenue",Brev);
                    row.setAttribute("Revenue",Rev);
                    row.setAttribute("WorstCaseRevenue",Wrev);
                    operationBinding.execute();
                    iter1.executeQuery();
                    
                    
                    
                } else if(dialogEvent.getOutcome().name().equals("Closed")==true){
                  
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                    operationBinding.execute();
                    
                }
           
        }
    
    public void editDialogListener(DialogEvent dialogEvent) {
           
                if(dialogEvent.getOutcome().name().equals("ok")==true) {
                   
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("OppertunityForOverviewIterator");                    RowSetIterator rsi = iter.getRowSetIterator();
                    Row row = iter.getCurrentRow();
                    DCBindingContainer bc = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
                    DCIteratorBinding iter1 = (DCIteratorBinding) bc.findIteratorBinding("RevenueItemsOfOpportunityIterator");
                    ViewObject vo = iter1.getViewObject();
                    int Brev=0, Rev=0, Wrev=0;
                    for(int i=0;i<vo.getEstimatedRowCount();i++){
                        Row row2 = vo.getRowAtRangeIndex(i);
                        int qty = Integer.parseInt(row2.getAttribute("Quantity").toString());
                        Brev = Brev + qty*Integer.parseInt(row2.getAttribute("BestCaseRevenue").toString());
                        Rev = Rev + qty*Integer.parseInt(row2.getAttribute("SettledPrice").toString());
                        Wrev = Wrev + qty*Integer.parseInt(row2.getAttribute("WorseCaseRevenue").toString());
                        
                    }
                    row.setAttribute("BestCaseRevenue",Brev);
                    row.setAttribute("Revenue",Rev);
                    row.setAttribute("WorstCaseRevenue",Wrev);
                    operationBinding.execute();
                    iter1.executeQuery();
                    
                    
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
                
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("OppertunityForOverviewIterator");                    RowSetIterator rsi = iter.getRowSetIterator();
                    Row row = iter.getCurrentRow();
                    DCBindingContainer bc = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
                    DCIteratorBinding iter1 = (DCIteratorBinding) bc.findIteratorBinding("RevenueItemsOfOpportunityIterator");
                    ViewObject vo = iter1.getViewObject();
                    int Brev=0, Rev=0, Wrev=0;
                    for(int i=0;i<vo.getEstimatedRowCount();i++){
                        Row row2 = vo.getRowAtRangeIndex(i);
                        int qty = Integer.parseInt(row2.getAttribute("Quantity").toString());
                        Brev = Brev + qty*Integer.parseInt(row2.getAttribute("BestCaseRevenue").toString());
                        Rev = Rev + qty*Integer.parseInt(row2.getAttribute("SettledPrice").toString());
                        Wrev = Wrev + qty*Integer.parseInt(row2.getAttribute("WorseCaseRevenue").toString());
                        
                    }
                    row.setAttribute("BestCaseRevenue",Brev);
                    row.setAttribute("Revenue",Rev);
                    row.setAttribute("WorstCaseRevenue",Wrev);
                    operationBinding.execute();
                    iter1.executeQuery();
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


    public void insertInterPopupFetchListener(PopupFetchEvent popupFetchEvent){
            System.out.println(popupFetchEvent.getLaunchSourceClientId());
            
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert1");
                operationBinding.execute();
                
           
        }
    public void insertInterDialogListener(DialogEvent dialogEvent) {
           
                if(dialogEvent.getOutcome().name().equals("ok")==true) {
                   System.out.println("Enter commit");
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("CreateInteractionU1Iterator");
                    DCIteratorBinding iter1 = (DCIteratorBinding)bindings2.findIteratorBinding("OppertunityForOverviewIterator");
                    DCIteratorBinding iter2 = (DCIteratorBinding)bindings2.findIteratorBinding("OpportunityInteractionsIterator");
                    Row row = iter.getCurrentRow();
                    Row row1 = iter1.getCurrentRow();
                    System.out.println("Before commit");
                    row.setAttribute("ACreatorId", Integer.parseInt(ADFContext.getCurrent().getSessionScope().get("CURRENT_USER_ID").toString()));
                    operationBinding.execute();
                    OperationBinding op = bindings.getOperationBinding("populateAcOppJun");
                    op.getParamsMap().put("aId", Integer.parseInt(row.getAttribute("ActivityId").toString()));
                    op.getParamsMap().put("oId", Integer.parseInt(row1.getAttribute("OpportunityId").toString()));
                    op.execute();
                    iter2.executeQuery();
                    
                    
                    
                } else if(dialogEvent.getOutcome().name().equals("Closed")==true){
                  
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                    operationBinding.execute();
                    
                }
           
        }
    public void deleteInterDialogListener(DialogEvent dialogEvent) {
                if(dialogEvent.getOutcome().name().equals("yes")) {
                    DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                    DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("OpportunityInteractionsIterator");
                    BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                    OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
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
    
    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
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

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
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

    public void setD3(RichDialog d3) {
        this.d3 = d3;
    }

    public RichDialog getD3() {
        return d3;
    }

    public void setAot1(RichActiveOutputText aot1) {
        this.aot1 = aot1;
    }

    public RichActiveOutputText getAot1() {
        return aot1;
    }

    public void setP4(RichPopup p4) {
        this.p4 = p4;
    }

    public RichPopup getP4() {
        return p4;
    }

    public void setD4(RichDialog d4) {
        this.d4 = d4;
    }

    public RichDialog getD4() {
        return d4;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
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

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }

    public void setIt19(RichInputText it19) {
        this.it19 = it19;
    }

    public RichInputText getIt19() {
        return it19;
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

    public void setP5(RichPopup p5) {
        this.p5 = p5;
    }

    public RichPopup getP5() {
        return p5;
    }

    public void setD5(RichDialog d5) {
        this.d5 = d5;
    }

    public RichDialog getD5() {
        return d5;
    }

    public void setOt32(RichOutputText ot32) {
        this.ot32 = ot32;
    }

    public RichOutputText getOt32() {
        return ot32;
    }

    public void setIt20(RichInputText it20) {
        this.it20 = it20;
    }

    public RichInputText getIt20() {
        return it20;
    }
}
