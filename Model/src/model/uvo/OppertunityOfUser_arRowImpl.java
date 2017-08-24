package model.rvo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 22 22:44:11 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OppertunityOfUser_arRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        OpportunityId,
        AccId,
        OpportunityWinProb,
        OpportunityCloseDate,
        PrimaryContactId,
        SalesStage,
        SalesMethod,
        Channel,
        Revenue,
        BestCaseRevenue,
        WorstCaseRevenue,
        BudgetAmount,
        EstimatedDuration,
        RiskLevel,
        DecisionLevel,
        CreatorId,
        OpportunityName;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int OPPORTUNITYID = AttributesEnum.OpportunityId.index();
    public static final int ACCID = AttributesEnum.AccId.index();
    public static final int OPPORTUNITYWINPROB = AttributesEnum.OpportunityWinProb.index();
    public static final int OPPORTUNITYCLOSEDATE = AttributesEnum.OpportunityCloseDate.index();
    public static final int PRIMARYCONTACTID = AttributesEnum.PrimaryContactId.index();
    public static final int SALESSTAGE = AttributesEnum.SalesStage.index();
    public static final int SALESMETHOD = AttributesEnum.SalesMethod.index();
    public static final int CHANNEL = AttributesEnum.Channel.index();
    public static final int REVENUE = AttributesEnum.Revenue.index();
    public static final int BESTCASEREVENUE = AttributesEnum.BestCaseRevenue.index();
    public static final int WORSTCASEREVENUE = AttributesEnum.WorstCaseRevenue.index();
    public static final int BUDGETAMOUNT = AttributesEnum.BudgetAmount.index();
    public static final int ESTIMATEDDURATION = AttributesEnum.EstimatedDuration.index();
    public static final int RISKLEVEL = AttributesEnum.RiskLevel.index();
    public static final int DECISIONLEVEL = AttributesEnum.DecisionLevel.index();
    public static final int CREATORID = AttributesEnum.CreatorId.index();
    public static final int OPPORTUNITYNAME = AttributesEnum.OpportunityName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OppertunityOfUser_arRowImpl() {
    }
}
