package view.backing.WEBINF.fragments;


import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UISelectItems;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuickQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectManyShuttle;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adfdt.model.objects.IteratorBinding;

import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;

import org.apache.myfaces.trinidad.event.ReturnEvent;

public class Role_Home {
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichToolbar t1;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichSpacer s1;
    private RichPopup p1;
    private RichDialog d1;
    private RichPopup p2;
    private RichDialog d2;
    private RichOutputText ot4;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputDate id1;
    private RichInputDate id2;
    private RichPopup p3;
    private RichDialog d3;
    private RichPanelFormLayout pfl2;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputDate id3;
    private RichInputDate id4;
    private RichPanelGroupLayout pgl2;
    private RichQuickQuery qryId1;
    private RichCommandLink cl1;
    private RichTable t2;
    private RichPopup p4;
    private RichDialog d4;
    private RichSelectManyShuttle sms1;
    private UISelectItems si1;
    private List selectedItems;
    private RichPanelFormLayout pfl3;
    private RichInputText it5;
    private RichInputText it6;
    private RichInputDate id5;
    private RichInputDate id6;

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
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


    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }


    public void onCreateReturn(ReturnEvent returnEvent){
        
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

    public void editPopupActionListener(ActionEvent actionEvent){
       
   
        
            BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
            operationBinding.execute();
            
            
       
    }
   
    public void editPopupFetchListener(PopupFetchEvent popupFetchEvent){
        System.out.println(popupFetchEvent.getLaunchSourceClientId());
        if(popupFetchEvent.getLaunchSourceClientId().contains("b1"))
        {
            BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
            operationBinding.execute();
            
            
        }
    }
    
    public void editDialogListener(DialogEvent dialogEvent) {
       
            if(dialogEvent.getOutcome().name().equals("ok")==true) {
               
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                operationBinding.execute();
               
                
            } else if(dialogEvent.getOutcome().name().equals("Closed")==true){
              
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                operationBinding.execute();
                
            }
       
    }
    public void editorsDialogListener(DialogEvent dialogEvent) {
       
            if(dialogEvent.getOutcome().name().equals("ok")==true) {
               
                BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                operationBinding.execute();
               
                
            } 
       
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

    public void setOt4(RichOutputText ot4) {
        this.ot4 = ot4;
    }

    public RichOutputText getOt4() {
        return ot4;
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

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
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

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
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

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }

    public void setId4(RichInputDate id4) {
        this.id4 = id4;
    }

    public RichInputDate getId4() {
        return id4;
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


    public void setSms1(RichSelectManyShuttle sms1) {
        this.sms1 = sms1;
    }

    public RichSelectManyShuttle getSms1() {
        return sms1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setSelectedItems(List selectedItems) {
        List oldSelectedItems = this.selectedItems;
        this.selectedItems = selectedItems;
        
        DCBindingContainer bindings=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iterBind = bindings.findIteratorBinding("AllRoleUserPairUVO_AK1Iterator");
        for (int newIndex = 0;newIndex<(this.selectedItems == null?0:this.selectedItems.size());newIndex++){
            if(oldSelectedItems == null || !oldSelectedItems.contains(this.selectedItems.get(newIndex))){
                    RowSetIterator rows=iterBind.getRowSetIterator();
                    Row[] newlyAddedRows = rows.findByKey(new Key(new Object[]{null,this.selectedItems.get(newIndex)}), 1);
                    if(newlyAddedRows!=null&&newlyAddedRows.length==1){
                        newlyAddedRows[0].setAttribute("AreAssociated", true);
                    }
                }
            }
        
        for(int oldIndex=0;oldIndex<(oldSelectedItems==null?0:oldSelectedItems.size());oldIndex++){
            if(this.selectedItems==null||!this.selectedItems.contains(oldSelectedItems.get(oldIndex))){
                RowSetIterator rows= iterBind.getRowSetIterator();
                Row[] justRemovedRows = rows.findByKey(new Key(new Object[]{null,oldSelectedItems.get(oldIndex)}),1);
                if(justRemovedRows!=null&justRemovedRows.length==1){
                    justRemovedRows[0].setAttribute("AreAssociated", false);
                }
                                                                                                                     
              }
        }
    }

    public List getSelectedItems() {
        if(selectedItems==null) {
            selectedItems=new ArrayList();
        }
        else{
            selectedItems.clear();
        }
        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iterBind =  bindings.findIteratorBinding("AllRoleUserPairUVO_AK1Iterator");
        Row[] rows=iterBind.getAllRowsInRange();
        for(int index=0;index<(rows==null?0:rows.length);index++){
            if((Boolean)rows[index].getAttribute("AreAssociated")){
                selectedItems.add(rows[index].getAttribute("UserId"));
            }
        }
        return selectedItems;
    }


    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
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


}
