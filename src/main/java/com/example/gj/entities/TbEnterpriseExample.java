package com.example.gj.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbEnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbEnterpriseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCbecodeinspIsNull() {
            addCriterion("cbecodeinsp is null");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspIsNotNull() {
            addCriterion("cbecodeinsp is not null");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspEqualTo(String value) {
            addCriterion("cbecodeinsp =", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspNotEqualTo(String value) {
            addCriterion("cbecodeinsp <>", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspGreaterThan(String value) {
            addCriterion("cbecodeinsp >", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspGreaterThanOrEqualTo(String value) {
            addCriterion("cbecodeinsp >=", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspLessThan(String value) {
            addCriterion("cbecodeinsp <", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspLessThanOrEqualTo(String value) {
            addCriterion("cbecodeinsp <=", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspLike(String value) {
            addCriterion("cbecodeinsp like", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspNotLike(String value) {
            addCriterion("cbecodeinsp not like", value, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspIn(List<String> values) {
            addCriterion("cbecodeinsp in", values, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspNotIn(List<String> values) {
            addCriterion("cbecodeinsp not in", values, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspBetween(String value1, String value2) {
            addCriterion("cbecodeinsp between", value1, value2, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbecodeinspNotBetween(String value1, String value2) {
            addCriterion("cbecodeinsp not between", value1, value2, "cbecodeinsp");
            return (Criteria) this;
        }

        public Criteria andCbenameIsNull() {
            addCriterion("Cbename is null");
            return (Criteria) this;
        }

        public Criteria andCbenameIsNotNull() {
            addCriterion("Cbename is not null");
            return (Criteria) this;
        }

        public Criteria andCbenameEqualTo(String value) {
            addCriterion("Cbename =", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameNotEqualTo(String value) {
            addCriterion("Cbename <>", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameGreaterThan(String value) {
            addCriterion("Cbename >", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameGreaterThanOrEqualTo(String value) {
            addCriterion("Cbename >=", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameLessThan(String value) {
            addCriterion("Cbename <", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameLessThanOrEqualTo(String value) {
            addCriterion("Cbename <=", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameLike(String value) {
            addCriterion("Cbename like", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameNotLike(String value) {
            addCriterion("Cbename not like", value, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameIn(List<String> values) {
            addCriterion("Cbename in", values, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameNotIn(List<String> values) {
            addCriterion("Cbename not in", values, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameBetween(String value1, String value2) {
            addCriterion("Cbename between", value1, value2, "cbename");
            return (Criteria) this;
        }

        public Criteria andCbenameNotBetween(String value1, String value2) {
            addCriterion("Cbename not between", value1, value2, "cbename");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNull() {
            addCriterion("Audit_type is null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNotNull() {
            addCriterion("Audit_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeEqualTo(String value) {
            addCriterion("Audit_type =", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotEqualTo(String value) {
            addCriterion("Audit_type <>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThan(String value) {
            addCriterion("Audit_type >", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Audit_type >=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThan(String value) {
            addCriterion("Audit_type <", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThanOrEqualTo(String value) {
            addCriterion("Audit_type <=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLike(String value) {
            addCriterion("Audit_type like", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotLike(String value) {
            addCriterion("Audit_type not like", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIn(List<String> values) {
            addCriterion("Audit_type in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotIn(List<String> values) {
            addCriterion("Audit_type not in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeBetween(String value1, String value2) {
            addCriterion("Audit_type between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotBetween(String value1, String value2) {
            addCriterion("Audit_type not between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andStautsIsNull() {
            addCriterion("stauts is null");
            return (Criteria) this;
        }

        public Criteria andStautsIsNotNull() {
            addCriterion("stauts is not null");
            return (Criteria) this;
        }

        public Criteria andStautsEqualTo(String value) {
            addCriterion("stauts =", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotEqualTo(String value) {
            addCriterion("stauts <>", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsGreaterThan(String value) {
            addCriterion("stauts >", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsGreaterThanOrEqualTo(String value) {
            addCriterion("stauts >=", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLessThan(String value) {
            addCriterion("stauts <", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLessThanOrEqualTo(String value) {
            addCriterion("stauts <=", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLike(String value) {
            addCriterion("stauts like", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotLike(String value) {
            addCriterion("stauts not like", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsIn(List<String> values) {
            addCriterion("stauts in", values, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotIn(List<String> values) {
            addCriterion("stauts not in", values, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsBetween(String value1, String value2) {
            addCriterion("stauts between", value1, value2, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotBetween(String value1, String value2) {
            addCriterion("stauts not between", value1, value2, "stauts");
            return (Criteria) this;
        }

        public Criteria andPersonIsNull() {
            addCriterion("Person is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsNotNull() {
            addCriterion("Person is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEqualTo(String value) {
            addCriterion("Person =", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotEqualTo(String value) {
            addCriterion("Person <>", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThan(String value) {
            addCriterion("Person >", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThanOrEqualTo(String value) {
            addCriterion("Person >=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThan(String value) {
            addCriterion("Person <", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThanOrEqualTo(String value) {
            addCriterion("Person <=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLike(String value) {
            addCriterion("Person like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotLike(String value) {
            addCriterion("Person not like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonIn(List<String> values) {
            addCriterion("Person in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotIn(List<String> values) {
            addCriterion("Person not in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonBetween(String value1, String value2) {
            addCriterion("Person between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotBetween(String value1, String value2) {
            addCriterion("Person not between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("Create_Time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("Create_Time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("Create_Time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_Time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("Create_Time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Create_Time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("Create_Time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("Create_Time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("Create_Time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Create_Time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}