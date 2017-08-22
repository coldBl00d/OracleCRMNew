package view.backing.WEBINF.flows;


import java.util.HashMap;
import java.util.Map;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichQuickQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichDecorativeBox;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.jbo.Row;
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
    private RichButton b8;
    private RichButton b9;
    private RichToolbar t6;
    private RichButton b10;
    private RichButton b11;
    private RichButton b12;
    private RichPanelGroupLayout pgl6;
    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichPanelGroupLayout pgl7;
    private RichTable t8;
    private RichTable t9;
    private RichInputText it2;
    private RichInputText it3;
    private RichSpacer s4;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichInputText it7;
    private RichButton b13;
    private RichOutputLabel ol3;
    private RichPanelGroupLayout pgl9;
    private RichQuickQuery qq1;
    private RichCommandLink cl2;
    private RichTable t5;
    private RichQuickQuery qq2;
    private RichCommandLink cl3;
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
    private RichTable t10;

    public ViewCustomer(){
        System.out.println(ADFContext.getCurrent().getPageFlowScope().get("customerIdForView"));
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

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
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


    public void setT8(RichTable t8) {
        this.t8 = t8;
    }

    public RichTable getT8() {
        return t8;
    }


    public void setT9(RichTable t9) {
        this.t9 = t9;
    }

    public RichTable getT9() {
        return t9;
    }
    
    public String goOpportunity(){
        DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();                      
        DCIteratorBinding iterator = bindings.findIteratorBinding("OppertunitiesOfCustomerIterator");
        System.out.println(ADFContext.getCurrent().getPageFlowScope().get("oppertunityId"));
        //ViewObject vobj = iterator.getViewObject();
        ViewObject obj = iterator.getViewObject();
        Row row1 = iterator.getCurrentRow();
        String tabHeading = (String)row1.getAttribute("OpportunityName");
        Map<String, Object > m = new HashMap<String, Object> ();
        m.put("tabContext", TabContext.getCurrentInstance());
        m.put("PointerId", row1.getAttribute("OpportunityId"));
        //System.out.println("Hey Im putting the value :"+custIter.getCurrentRowKeyStringValue());
        System.out.println("Oppertunity id i got:"+row1.getAttribute("OpportunityId"));
        System.out.println(tabHeading);
        viewOppertunityActivity(m, tabHeading);
        System.out.println("Done");
        return null;
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

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
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

    public void setT10(RichTable t10) {
        this.t10 = t10;
    }

    public RichTable getT10() {
        return t10;
    }
}
