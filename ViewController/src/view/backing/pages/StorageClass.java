package view.backing.pages;

public class StorageClass {
    
    
    
    private String customerIdForView;
    private int count=0;
    private boolean lock;

    public void setCustomerIdForView(String customerIdForView) {
        if(count==0){
            System.out.println("customerView set :"+customerIdForView);
            this.customerIdForView = customerIdForView;
        }
        count++;
        if(count ==2)
            count = 0;
    }

    public String getCustomerIdForView() {
        System.out.println("customerView read :"+customerIdForView);
        return customerIdForView;
    }
}
