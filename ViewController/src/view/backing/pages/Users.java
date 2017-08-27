package view.backing.pages;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichDecorativeBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelList;
import oracle.adf.view.rich.component.rich.nav.RichCommandNavigationItem;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.nav.RichNavigationPane;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;

public class Users {
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    private RichNavigationPane np1;
    private RichCommandNavigationItem ni1;
    private RichCommandNavigationItem ni2;
    private RichDecorativeBox db1;
    private RichPanelGroupLayout pgl1;
    private RichLink l1;
    private RichPanelList pl1;
    private RichLink l2;
    private RichRegion r1;
    private RichLink l4;
    private RichCommandNavigationItem cni1;

    public Users(){
        super();
        setUser();     
    }
    
    public void setUser(){
        String iteratorName = "UserForLoginIterator";
        String userName = ADFContext.getCurrent().getSecurityContext().getUserName();
        System.out.println(userName);
        if((ADFContext.getCurrent().getSessionScope().get("CURRENT_USERNAME"))== null){
            ADFContext.getCurrent().getSessionScope().put("CURRENT_USERNAME", userName);
            DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();                      
            DCIteratorBinding iterator = bindings.findIteratorBinding(iteratorName);
            ViewObject vobj = iterator.getViewObject();
            
            RowSetIterator iter =  vobj.createRowSetIterator(null);
            while(iter.hasNext()){
                Row r = iter.next();
                System.out.println(r.getAttribute("UName"));
                if(((String)r.getAttribute("UName")).equals(userName)){
                    ADFContext.getCurrent().getSessionScope().put("CURRENT_USER_ID", r.getAttribute("UserId"));
                    System.out.println("Found user id for "+ userName + " = "+r.getAttribute("UserId") );
                    break;
                }
            }
            iter.closeRowSetIterator();
        }
        
    }

    public void setPt1(RichPageTemplate pt1) {
        this.pt1 = pt1;
    }

    public RichPageTemplate getPt1() {
        return pt1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setNp1(RichNavigationPane np1) {
        this.np1 = np1;
    }

    public RichNavigationPane getNp1() {
        return np1;
    }

    public void setNi1(RichCommandNavigationItem ni1) {
        this.ni1 = ni1;
    }

    public RichCommandNavigationItem getNi1() {
        return ni1;
    }

    public void setNi2(RichCommandNavigationItem ni2) {
        this.ni2 = ni2;
    }

    public RichCommandNavigationItem getNi2() {
        return ni2;
    }

    public void setDb1(RichDecorativeBox db1) {
        this.db1 = db1;
    }

    public RichDecorativeBox getDb1() {
        return db1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    public void setPl1(RichPanelList pl1) {
        this.pl1 = pl1;
    }

    public RichPanelList getPl1() {
        return pl1;
    }

    public void setL2(RichLink l2) {
        this.l2 = l2;
    }

    public RichLink getL2() {
        return l2;
    }


    public void setR1(RichRegion r1) {
        this.r1 = r1;
    }

    public RichRegion getR1() {
        return r1;
    }

    public void setL4(RichLink l4) {
        this.l4 = l4;
    }

    public RichLink getL4() {
        return l4;
    }

    public void setCni1(RichCommandNavigationItem cni1) {
        this.cni1 = cni1;
    }

    public RichCommandNavigationItem getCni1() {
        return cni1;
    }
}
