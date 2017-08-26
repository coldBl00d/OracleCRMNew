package model.am;

import model.am.common.UserApplicationModule;


import model.uvo.TaskUVO_arVOImpl;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 24 12:40:25 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UserApplicationModuleImpl extends ApplicationModuleImpl implements UserApplicationModule {
    /**
     * This is the default constructor (do not remove).
     */
    public UserApplicationModuleImpl() {
    }

    /**
     * Container's getter for Customer.
     * @return Customer
     */
    public ViewObjectImpl getCustomer() {
        return (ViewObjectImpl) findViewObject("Customer");
    }

    /**
     * Container's getter for CustomerParent.
     * @return CustomerParent
     */
    public ViewObjectImpl getCustomerParent() {
        return (ViewObjectImpl) findViewObject("CustomerParent");
    }

    /**
     * Container's getter for PrimaryAddress.
     * @return PrimaryAddress
     */
    public ViewObjectImpl getPrimaryAddress() {
        return (ViewObjectImpl) findViewObject("PrimaryAddress");
    }

    /**
     * Container's getter for OppertunityForOverview.
     * @return OppertunityForOverview
     */
    public ViewObjectImpl getOppertunityForOverview() {
        return (ViewObjectImpl) findViewObject("OppertunityForOverview");
    }

    /**
     * Container's getter for Contact.
     * @return Contact
     */
    public ViewObjectImpl getContact() {
        return (ViewObjectImpl) findViewObject("Contact");
    }

    /**
     * Container's getter for Tasks.
     * @return Tasks
     */
    public TaskUVO_arVOImpl getTasks() {
        return (TaskUVO_arVOImpl) findViewObject("Tasks");
    }

    /**
     * Container's getter for OppertunityOfCustomer.
     * @return OppertunityOfCustomer
     */
    public ViewObjectImpl getOppertunityOfCustomer() {
        return (ViewObjectImpl) findViewObject("OppertunityOfCustomer");
    }

    /**
     * Container's getter for OppertunityCreator.
     * @return OppertunityCreator
     */
    public ViewObjectImpl getOppertunityCreator() {
        return (ViewObjectImpl) findViewObject("OppertunityCreator");
    }

    /**
     * Container's getter for OppertunityContact.
     * @return OppertunityContact
     */
    public ViewObjectImpl getOppertunityContact() {
        return (ViewObjectImpl) findViewObject("OppertunityContact");
    }

    /**
     * Container's getter for CustomerNotes.
     * @return CustomerNotes
     */
    public ViewObjectImpl getCustomerNotes() {
        return (ViewObjectImpl) findViewObject("CustomerNotes");
    }

    /**
     * Container's getter for NoteCreator.
     * @return NoteCreator
     */
    public ViewObjectImpl getNoteCreator() {
        return (ViewObjectImpl) findViewObject("NoteCreator");
    }

    /**
     * Container's getter for CustomerContacts.
     * @return CustomerContacts
     */
    public ViewObjectImpl getCustomerContacts() {
        return (ViewObjectImpl) findViewObject("CustomerContacts");
    }

    /**
     * Container's getter for CustomerTasks.
     * @return CustomerTasks
     */
    public TaskUVO_arVOImpl getCustomerTasks() {
        return (TaskUVO_arVOImpl) findViewObject("CustomerTasks");
    }

    /**
     * Container's getter for TaskCreator.
     * @return TaskCreator
     */
    public ViewObjectImpl getTaskCreator() {
        return (ViewObjectImpl) findViewObject("TaskCreator");
    }

    /**
     * Container's getter for Appointments.
     * @return Appointments
     */
    public ViewObjectImpl getAppointments() {
        return (ViewObjectImpl) findViewObject("Appointments");
    }


    /**
     * Container's getter for CustContactLinkUVO_ar1.
     * @return CustContactLinkUVO_ar1
     */
    public ViewObjectImpl getCustContactLinkUVO_ar1() {
        return (ViewObjectImpl) findViewObject("CustContactLinkUVO_ar1");
    }

    /**
     * Container's getter for CustomerToParentViewLink_ar1.
     * @return CustomerToParentViewLink_ar1
     */
    public ViewLinkImpl getCustomerToParentViewLink_ar1() {
        return (ViewLinkImpl) findViewLink("CustomerToParentViewLink_ar1");
    }

    /**
     * Container's getter for CustomerToPrimaryAddressLink_ar1.
     * @return CustomerToPrimaryAddressLink_ar1
     */
    public ViewLinkImpl getCustomerToPrimaryAddressLink_ar1() {
        return (ViewLinkImpl) findViewLink("CustomerToPrimaryAddressLink_ar1");
    }

    /**
     * Container's getter for CustomerToOppertunityViewLink_ar1.
     * @return CustomerToOppertunityViewLink_ar1
     */
    public ViewLinkImpl getCustomerToOppertunityViewLink_ar1() {
        return (ViewLinkImpl) findViewLink("CustomerToOppertunityViewLink_ar1");
    }

    /**
     * Container's getter for OppertunityToCreatorVL_ar1.
     * @return OppertunityToCreatorVL_ar1
     */
    public ViewLinkImpl getOppertunityToCreatorVL_ar1() {
        return (ViewLinkImpl) findViewLink("OppertunityToCreatorVL_ar1");
    }

    /**
     * Container's getter for OppertunityToPrimaryContactsVL_ar2.
     * @return OppertunityToPrimaryContactsVL_ar2
     */
    public ViewLinkImpl getOppertunityToPrimaryContactsVL_ar2() {
        return (ViewLinkImpl) findViewLink("OppertunityToPrimaryContactsVL_ar2");
    }

    /**
     * Container's getter for CustomerToNoteVL1.
     * @return CustomerToNoteVL1
     */
    public ViewLinkImpl getCustomerToNoteVL1() {
        return (ViewLinkImpl) findViewLink("CustomerToNoteVL1");
    }

    /**
     * Container's getter for NotesToCreator1.
     * @return NotesToCreator1
     */
    public ViewLinkImpl getNotesToCreator1() {
        return (ViewLinkImpl) findViewLink("NotesToCreator1");
    }

    /**
     * Container's getter for CustomerToContactsVL1.
     * @return CustomerToContactsVL1
     */
    public ViewLinkImpl getCustomerToContactsVL1() {
        return (ViewLinkImpl) findViewLink("CustomerToContactsVL1");
    }

    /**
     * Container's getter for CustomerToTask1.
     * @return CustomerToTask1
     */
    public ViewLinkImpl getCustomerToTask1() {
        return (ViewLinkImpl) findViewLink("CustomerToTask1");
    }

    /**
     * Container's getter for TaskToCreator1.
     * @return TaskToCreator1
     */
    public ViewLinkImpl getTaskToCreator1() {
        return (ViewLinkImpl) findViewLink("TaskToCreator1");
    }

    /**
     * Container's getter for CustomerToAppointmentVL_ar1.
     * @return CustomerToAppointmentVL_ar1
     */
    public ViewLinkImpl getCustomerToAppointmentVL_ar1() {
        return (ViewLinkImpl) findViewLink("CustomerToAppointmentVL_ar1");
    }


    public void populateCusConJun(Integer aId,Integer cId){
        ViewObjectImpl vo= getCustContactLinkUVO_ar1();
        Row row = vo.createRow();
        row.setAttribute("AccId", aId);
        row.setAttribute("ContactId", cId);
        vo.insertRow(row);
        this.getDBTransaction().commit();
    }


    /**
     * Container's getter for CreateCustomerU1.
     * @return CreateCustomerU1
     */
    public ViewObjectImpl getCreateCustomerU1() {
        return (ViewObjectImpl) findViewObject("CreateCustomerU1");
    }

    /**
     * Container's getter for AddressUVO_ar1.
     * @return AddressUVO_ar1
     */
    public ViewObjectImpl getShippingAddress() {
        return (ViewObjectImpl) findViewObject("ShippingAddress");
    }

    /**
     * Container's getter for CustToShippingVL1.
     * @return CustToShippingVL1
     */
    public ViewLinkImpl getCustToShippingVL1() {
        return (ViewLinkImpl) findViewLink("CustToShippingVL1");
    }

    /**
     * Container's getter for RevenueItemsU1.
     * @return RevenueItemsU1
     */
    public ViewObjectImpl getRevenueItemsOfOpportunity() {
        return (ViewObjectImpl) findViewObject("RevenueItemsOfOpportunity");
    }

    /**
     * Container's getter for OpportunityToRevenueItemVL1.
     * @return OpportunityToRevenueItemVL1
     */
    public ViewLinkImpl getOpportunityToRevenueItemVL1() {
        return (ViewLinkImpl) findViewLink("OpportunityToRevenueItemVL1");
    }

    /**
     * Container's getter for ProductsU1.
     * @return ProductsU1
     */
    public ViewObjectImpl getProductsName() {
        return (ViewObjectImpl) findViewObject("ProductsName");
    }

    /**
     * Container's getter for RevenueItemToProductVL1.
     * @return RevenueItemToProductVL1
     */
    public ViewLinkImpl getRevenueItemToProductVL1() {
        return (ViewLinkImpl) findViewLink("RevenueItemToProductVL1");
    }


    /**
     * Container's getter for CreateContact1.
     * @return CreateContact1
     */
    public ViewObjectImpl getCreateContact1() {
        return (ViewObjectImpl) findViewObject("CreateContact1");
    }

    /**
     * Container's getter for CreateOpportunity1.
     * @return CreateOpportunity1
     */
    public ViewObjectImpl getCreateOpportunity1() {
        return (ViewObjectImpl) findViewObject("CreateOpportunity1");
    }

    /**
     * Container's getter for ContactR1.
     * @return ContactR1
     */
    public ViewObjectImpl getContactR1() {
        return (ViewObjectImpl) findViewObject("ContactR1");
    }

    /**
     * Container's getter for ContactRVOVL1.
     * @return ContactRVOVL1
     */
    public ViewLinkImpl getContactRVOVL1() {
        return (ViewLinkImpl) findViewLink("ContactRVOVL1");
    }

    /**
     * Container's getter for AddressUVO_arVO1.
     * @return AddressUVO_arVO1
     */
    public ViewObjectImpl getAddressOfCustomer() {
        return (ViewObjectImpl) findViewObject("AddressOfCustomer");
    }

    /**
     * Container's getter for ContactToAddressVL1.
     * @return ContactToAddressVL1
     */
    public ViewLinkImpl getContactToAddressVL1() {
        return (ViewLinkImpl) findViewLink("ContactToAddressVL1");
    }


    /**
     * Container's getter for TaskUVO_arVO1.
     * @return TaskUVO_arVO1
     */
    public TaskUVO_arVOImpl getTaskUVO_arVO1() {
        return (TaskUVO_arVOImpl) findViewObject("TaskUVO_arVO1");
    }

    /**
     * Container's getter for ContactToTask1.
     * @return ContactToTask1
     */
    public ViewLinkImpl getContactToTask1() {
        return (ViewLinkImpl) findViewLink("ContactToTask1");
    }

    /**
     * Container's getter for NotesUVO_arVO1.
     * @return NotesUVO_arVO1
     */
    public ViewObjectImpl getNotesUVO_arVO1() {
        return (ViewObjectImpl) findViewObject("NotesUVO_arVO1");
    }

    /**
     * Container's getter for ContactToNoteVL1.
     * @return ContactToNoteVL1
     */
    public ViewLinkImpl getContactToNoteVL1() {
        return (ViewLinkImpl) findViewLink("ContactToNoteVL1");
    }

    /**
     * Container's getter for InteractionsUVO1.
     * @return InteractionsUVO1
     */
    public ViewObjectImpl getInteractionsUVO1() {
        return (ViewObjectImpl) findViewObject("InteractionsUVO1");
    }

    /**
     * Container's getter for ContactsToInteractions1.
     * @return ContactsToInteractions1
     */
    public ViewLinkImpl getContactsToInteractions1() {
        return (ViewLinkImpl) findViewLink("ContactsToInteractions1");
    }

    /**
     * Container's getter for AppointmentUVO1.
     * @return AppointmentUVO1
     */
    public ViewObjectImpl getAppointmentUVO1() {
        return (ViewObjectImpl) findViewObject("AppointmentUVO1");
    }

    /**
     * Container's getter for ContactToAppointmentVL1.
     * @return ContactToAppointmentVL1
     */
    public ViewLinkImpl getContactToAppointmentVL1() {
        return (ViewLinkImpl) findViewLink("ContactToAppointmentVL1");
    }

    /**
     * Container's getter for UserUVO_arVO1.
     * @return UserUVO_arVO1
     */
    public ViewObjectImpl getCreator2() {
        return (ViewObjectImpl) findViewObject("Creator2");
    }

    /**
     * Container's getter for TaskToCreator2.
     * @return TaskToCreator2
     */
    public ViewLinkImpl getTaskToCreator2() {
        return (ViewLinkImpl) findViewLink("TaskToCreator2");
    }


    /**
     * Container's getter for UserUVO_arVO3.
     * @return UserUVO_arVO3
     */
    public ViewObjectImpl getAssignee2() {
        return (ViewObjectImpl) findViewObject("Assignee2");
    }

    /**
     * Container's getter for TaskToAssigneeVL_ar2.
     * @return TaskToAssigneeVL_ar2
     */
    public ViewLinkImpl getTaskToAssigneeVL_ar2() {
        return (ViewLinkImpl) findViewLink("TaskToAssigneeVL_ar2");
    }

    /**
     * Container's getter for UserUVO_arVO1.
     * @return UserUVO_arVO1
     */
    public ViewObjectImpl getCreator3() {
        return (ViewObjectImpl) findViewObject("Creator3");
    }

    /**
     * Container's getter for NotesToCreator2.
     * @return NotesToCreator2
     */
    public ViewLinkImpl getNotesToCreator2() {
        return (ViewLinkImpl) findViewLink("NotesToCreator2");
    }


    /**
     * Container's getter for ContactsUVO_arVO2.
     * @return ContactsUVO_arVO2
     */
    public ViewObjectImpl getPrimaryContact() {
        return (ViewObjectImpl) findViewObject("PrimaryContact");
    }

    /**
     * Container's getter for OppertunityToPrimaryContactsVL_ar1.
     * @return OppertunityToPrimaryContactsVL_ar1
     */
    public ViewLinkImpl getOppertunityToPrimaryContactsVL_ar1() {
        return (ViewLinkImpl) findViewLink("OppertunityToPrimaryContactsVL_ar1");
    }

    /**
     * Container's getter for FutureForecastViewObjVO_rs1.
     * @return FutureForecastViewObjVO_rs1
     */
    public ViewObjectImpl getFutureForecastViewObjVO_rs1() {
        return (ViewObjectImpl) findViewObject("FutureForecastViewObjVO_rs1");
    }

    /**
     * Container's getter for PastQuarterSalesViewObjVO_rs1.
     * @return PastQuarterSalesViewObjVO_rs1
     */
    public ViewObjectImpl getPastQuarterSalesViewObjVO_rs1() {
        return (ViewObjectImpl) findViewObject("PastQuarterSalesViewObjVO_rs1");
    }

    /**
     * Container's getter for ProductStatViewObjVO_rs1.
     * @return ProductStatViewObjVO_rs1
     */
    public ViewObjectImpl getProductStatViewObjVO_rs1() {
        return (ViewObjectImpl) findViewObject("ProductStatViewObjVO_rs1");
    }

    /**
     * Container's getter for SalesRepDashboardViewObjVO_rs1.
     * @return SalesRepDashboardViewObjVO_rs1
     */
    public ViewObjectImpl getSalesRepDashboardViewObjVO_rs1() {
        return (ViewObjectImpl) findViewObject("SalesRepDashboardViewObjVO_rs1");
    }

    /**
     * Container's getter for SalesRepGraphViewObjVO_rs1.
     * @return SalesRepGraphViewObjVO_rs1
     */
    public ViewObjectImpl getSalesRepGraphViewObjVO_rs1() {
        return (ViewObjectImpl) findViewObject("SalesRepGraphViewObjVO_rs1");
    }
    
    public void executeCriteria(Integer cId){
        ViewObjectImpl vo = getCustContact1();
        ViewCriteria vc = vo.getViewCriteria("CustContactCriteria");
        vo.applyViewCriteria(vc);
        vo.setNamedWhereClauseParam("AccountID",cId);
        vo.executeQuery();
    }

    /**
     * Container's getter for CustContact1.
     * @return CustContact1
     */
    public ViewObjectImpl getCustContact1() {
        return (ViewObjectImpl) findViewObject("CustContact1");
    }

    /**
     * Container's getter for AppointmentUVO2.
     * @return AppointmentUVO2
     */
    public ViewObjectImpl getAppointmentDisplay() {
        return (ViewObjectImpl) findViewObject("AppointmentDisplay");
    }

    /**
     * Container's getter for TaskUVO_arVO2.
     * @return TaskUVO_arVO2
     */
    public TaskUVO_arVOImpl getTaskForDisplay() {
        return (TaskUVO_arVOImpl) findViewObject("TaskForDisplay");
    }

    /**
     * Container's getter for InteractionsUVO2.
     * @return InteractionsUVO2
     */
    public ViewObjectImpl getOpportunityInteractions() {
        return (ViewObjectImpl) findViewObject("OpportunityInteractions");
    }

    /**
     * Container's getter for OpportunityInteractionVL1.
     * @return OpportunityInteractionVL1
     */
    public ViewLinkImpl getOpportunityInteractionVL1() {
        return (ViewLinkImpl) findViewLink("OpportunityInteractionVL1");
    }

    /**
     * Container's getter for AppointmentUVO2.
     * @return AppointmentUVO2
     */
    public ViewObjectImpl getOpportunityAppointments() {
        return (ViewObjectImpl) findViewObject("OpportunityAppointments");
    }

    /**
     * Container's getter for OpportunityAppointmentVL1.
     * @return OpportunityAppointmentVL1
     */
    public ViewLinkImpl getOpportunityAppointmentVL1() {
        return (ViewLinkImpl) findViewLink("OpportunityAppointmentVL1");
    }

    /**
     * Container's getter for TaskUVO_arVO2.
     * @return TaskUVO_arVO2
     */
    public TaskUVO_arVOImpl getOpportunityTask() {
        return (TaskUVO_arVOImpl) findViewObject("OpportunityTask");
    }

    /**
     * Container's getter for OpportunityToTaskVL1.
     * @return OpportunityToTaskVL1
     */
    public ViewLinkImpl getOpportunityToTaskVL1() {
        return (ViewLinkImpl) findViewLink("OpportunityToTaskVL1");
    }

    /**
     * Container's getter for ContactsUVO_arVO1.
     * @return ContactsUVO_arVO1
     */
    public ViewObjectImpl getContactsOfOpportunity() {
        return (ViewObjectImpl) findViewObject("ContactsOfOpportunity");
    }

    /**
     * Container's getter for OpportunityToContactVL1.
     * @return OpportunityToContactVL1
     */
    public ViewLinkImpl getOpportunityToContactVL1() {
        return (ViewLinkImpl) findViewLink("OpportunityToContactVL1");
    }

    /**
     * Container's getter for NotesUVO_arVO2.
     * @return NotesUVO_arVO2
     */
    public ViewObjectImpl getOpportunityNotes() {
        return (ViewObjectImpl) findViewObject("OpportunityNotes");
    }

    /**
     * Container's getter for OpportunityToNotesVL1.
     * @return OpportunityToNotesVL1
     */
    public ViewLinkImpl getOpportunityToNotesVL1() {
        return (ViewLinkImpl) findViewLink("OpportunityToNotesVL1");
    }


    /**
     * Container's getter for UserUVO_arVO1.
     * @return UserUVO_arVO1
     */
    public ViewObjectImpl getUserUVO_arVO1() {
        return (ViewObjectImpl) findViewObject("UserUVO_arVO1");
    }

    /**
     * Container's getter for NotesToCreator3.
     * @return NotesToCreator3
     */
    public ViewLinkImpl getNotesToCreator3() {
        return (ViewLinkImpl) findViewLink("NotesToCreator3");
    }

    /**
     * Container's getter for UserUVO_arVO2.
     * @return UserUVO_arVO2
     */
    public ViewObjectImpl getAssigned() {
        return (ViewObjectImpl) findViewObject("Assigned");
    }

    /**
     * Container's getter for TaskToAssigneeVL_ar1.
     * @return TaskToAssigneeVL_ar1
     */
    public ViewLinkImpl getTaskToAssigneeVL_ar1() {
        return (ViewLinkImpl) findViewLink("TaskToAssigneeVL_ar1");
    }

    /**
     * Container's getter for UserUVO_arVO3.
     * @return UserUVO_arVO3
     */
    public ViewObjectImpl getCreator() {
        return (ViewObjectImpl) findViewObject("Creator");
    }

    /**
     * Container's getter for TaskToCreator3.
     * @return TaskToCreator3
     */
    public ViewLinkImpl getTaskToCreator3() {
        return (ViewLinkImpl) findViewLink("TaskToCreator3");
    }


    /**
     * Container's getter for InteractionsUVO2.
     * @return InteractionsUVO2
     */
    public ViewObjectImpl getInteractionsDisplay() {
        return (ViewObjectImpl) findViewObject("InteractionsDisplay");
    }

    /**
     * Container's getter for OppertunityUVO_arVO2.
     * @return OppertunityUVO_arVO2
     */
    public ViewObjectImpl getOpportunityListForDisplay() {
        return (ViewObjectImpl) findViewObject("OpportunityListForDisplay");
    }


    /**
     * Container's getter for ContactsUVO_arVO1.
     * @return ContactsUVO_arVO1
     */
    public ViewObjectImpl getContactList() {
        return (ViewObjectImpl) findViewObject("ContactList");
    }


    /**
     * Container's getter for OppertunityUVO_arVO1.
     * @return OppertunityUVO_arVO1
     */
    public ViewObjectImpl getOpportunitiesOfContact() {
        return (ViewObjectImpl) findViewObject("OpportunitiesOfContact");
    }

    /**
     * Container's getter for ContactToOppertunityViewLink2.
     * @return ContactToOppertunityViewLink2
     */
    public ViewLinkImpl getContactToOppertunityViewLink2() {
        return (ViewLinkImpl) findViewLink("ContactToOppertunityViewLink2");
    }

    /**
     * Container's getter for ContactsUVO_arVO1.
     * @return ContactsUVO_arVO1
     */
    public ViewObjectImpl getPrimaryContact2() {
        return (ViewObjectImpl) findViewObject("PrimaryContact2");
    }

    /**
     * Container's getter for OppertunityToPrimaryContactsVL_ar3.
     * @return OppertunityToPrimaryContactsVL_ar3
     */
    public ViewLinkImpl getOppertunityToPrimaryContactsVL_ar3() {
        return (ViewLinkImpl) findViewLink("OppertunityToPrimaryContactsVL_ar3");
    }
}

