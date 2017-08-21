package view.backing.WEBINF.fragments;

import java.util.ArrayList;
import java.util.List;


import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;


import oracle.adf.view.rich.component.rich.RichQuickQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;


public class Manager_home {


    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph1;
    private RichQuickQuery qryId1;
    private RichCommandLink cl1;
    private RichTable t1;
    private RichPanelGroupLayout pgl3;
    private List selectedItems;
    private RichTable t2;
    private RichPanelHeader ph2;

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
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

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }


    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setSelectedItems(List selectedItems) {
        List oldSelectedItems = this.selectedItems;
        this.selectedItems = selectedItems;
        
        DCBindingContainer bindings=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iterBind = bindings.findIteratorBinding("AllManRepU1Iterator");
        for (int newIndex = 0;newIndex<(this.selectedItems == null?0:this.selectedItems.size());newIndex++){
            if(oldSelectedItems == null || !oldSelectedItems.contains(this.selectedItems.get(newIndex))){
                    RowSetIterator rows=iterBind.getRowSetIterator();
                    Row[] newlyAddedRows = rows.findByKey(new Key(new Object[]{null,this.selectedItems.get(newIndex)}), 1);
                    System.out.println(newlyAddedRows.length);
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
        DCIteratorBinding iterBind =  bindings.findIteratorBinding("AllManRepU1Iterator");
        Row[] rows=iterBind.getAllRowsInRange();
        for(int index=0;index<(rows==null?0:rows.length);index++){
            if((Boolean)rows[index].getAttribute("AreAssociated")){
                selectedItems.add(rows[index].getAttribute("Repid"));
            }
        }
        return selectedItems;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }
}
