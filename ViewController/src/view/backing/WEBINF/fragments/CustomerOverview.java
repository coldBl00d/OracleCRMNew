package view.backing.WEBINF.fragments;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.layout.RichDecorativeBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichSpacer;
import java.util.Map;
import java.util.HashMap;

import javax.faces.component.UISelectItems;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuickQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;

import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.adf.view.rich.event.PopupCanceledEvent;

import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;

import oracle.ui.pattern.dynamicShell.TabContext;

public class CustomerOverview {
    private RichPanelGroupLayout pgl1;
    private RichDecorativeBox db1;
    private RichToolbar t1;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichPanelGroupLayout pgl2;
    private RichSpacer s1;
    private RichSpacer s2;
    private RichSpacer s3;
    private RichPanelGroupLayout pgl3;
    private RichQuickQuery qryId1;
    private RichCommandLink cl1;
    private RichTable t2;
    private RichPopup p1;
    private RichDialog d1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichInputText it5;
    private RichInputText it6;
    private RichInputText it7;
    private RichInputText it8;
    private RichInputText it9;
    private RichInputText it10;
    private RichPopup p2;
    private RichDialog d2;
    private RichOutputText ot5;

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

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
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
    
    public String action(){
        DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();                      
        DCIteratorBinding custIter = bindings.findIteratorBinding("CustomerIterator");
        ViewObject obj = custIter.getViewObject();
        Row row = obj.getCurrentRow();
        String companyName = (String)row.getAttribute("AccountName");
        Map<String, Object > m = new HashMap<String, Object> ();
        m.put("customerIdForView", custIter.getCurrentRowKeyString());
        m.put("tabContext", TabContext.getCurrentInstance());
        //m.put("customerId", row.getAttribute("AccountId"));
        //System.out.println("Hey Im putting the value :"+custIter.getCurrentRowKeyStringValue());
        //System.out.println("Customer id i got:"+row.getAttribute("CustomerId"));
        System.out.println(companyName);
        viewCustomerActivity(m, companyName);
        System.out.println("Done");
        return null;
    }
    
    public void viewCustomerActivity(Map<String, Object> params, String companyName) 
      { 
        /** 
        * Example method when called repeatedly, will open another instance as 
        * oppose to selecting a previously opened tab instance. Note the boolean 
        * to create another tab instance is set to true. 
        */ 
        System.out.println("Calling activity");
        _launchActivity( 
          companyName, 
          "/WEB-INF/flows/view-customer-taskflow.xml#view-customer-taskflow",  
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


    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
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

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setD1(RichDialog d1) {
        this.d1 = d1;
    }

    public RichDialog getD1() {
        return d1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
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
    public void deleteDialogListener(DialogEvent dialogEvent) {
                System.out.println(dialogEvent.getOutcome().name().equals("yes"));
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
    public void insertCustomerPopupFetchListener(PopupFetchEvent popupFetchEvent){
        System.out.println(popupFetchEvent.getLaunchSourceClientId());
        if(popupFetchEvent.getLaunchSourceClientId().contains("b1"))
        {
            BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
            operationBinding.execute();
            
            
        }
    }
    
    public void insertCustomerDialogListener(DialogEvent dialogEvent) {
       
            if(dialogEvent.getOutcome().name().equals("ok")==true) {
               
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                operationBinding.execute();
                DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
                DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("CreateCustomerU1Iterator");
                RowSetIterator rsi = iter.getRowSetIterator();
                Row row = rsi.getCurrentRow();
                row.setAttribute("PrimaryAddress",row.getAttribute("AddressId"));
                row.setAttribute("ShippingAddress",row.getAttribute("AddressId1"));
                operationBinding.execute();
                
            } else if(dialogEvent.getOutcome().name().equals("Closed")==true){
              
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

    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void setOt5(RichOutputText ot5) {
        this.ot5 = ot5;
    }

    public RichOutputText getOt5() {
        return ot5;
    }
}
