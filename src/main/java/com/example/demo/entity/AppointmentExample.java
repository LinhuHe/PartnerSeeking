package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class AppointmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppointmentExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("A_ID is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("A_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("A_ID =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("A_ID <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("A_ID >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("A_ID >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("A_ID <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("A_ID <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("A_ID in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("A_ID not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("A_ID between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("A_ID not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAInviteridIsNull() {
            addCriterion("A_InviterID is null");
            return (Criteria) this;
        }

        public Criteria andAInviteridIsNotNull() {
            addCriterion("A_InviterID is not null");
            return (Criteria) this;
        }

        public Criteria andAInviteridEqualTo(String value) {
            addCriterion("A_InviterID =", value, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridNotEqualTo(String value) {
            addCriterion("A_InviterID <>", value, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridGreaterThan(String value) {
            addCriterion("A_InviterID >", value, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridGreaterThanOrEqualTo(String value) {
            addCriterion("A_InviterID >=", value, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridLessThan(String value) {
            addCriterion("A_InviterID <", value, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridLessThanOrEqualTo(String value) {
            addCriterion("A_InviterID <=", value, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridLike(String value) {
            addCriterion("A_InviterID like", value, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridNotLike(String value) {
            addCriterion("A_InviterID not like", value, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridIn(List<String> values) {
            addCriterion("A_InviterID in", values, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridNotIn(List<String> values) {
            addCriterion("A_InviterID not in", values, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridBetween(String value1, String value2) {
            addCriterion("A_InviterID between", value1, value2, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInviteridNotBetween(String value1, String value2) {
            addCriterion("A_InviterID not between", value1, value2, "aInviterid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidIsNull() {
            addCriterion("A_InvitedID is null");
            return (Criteria) this;
        }

        public Criteria andAInvitedidIsNotNull() {
            addCriterion("A_InvitedID is not null");
            return (Criteria) this;
        }

        public Criteria andAInvitedidEqualTo(String value) {
            addCriterion("A_InvitedID =", value, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidNotEqualTo(String value) {
            addCriterion("A_InvitedID <>", value, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidGreaterThan(String value) {
            addCriterion("A_InvitedID >", value, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidGreaterThanOrEqualTo(String value) {
            addCriterion("A_InvitedID >=", value, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidLessThan(String value) {
            addCriterion("A_InvitedID <", value, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidLessThanOrEqualTo(String value) {
            addCriterion("A_InvitedID <=", value, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidLike(String value) {
            addCriterion("A_InvitedID like", value, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidNotLike(String value) {
            addCriterion("A_InvitedID not like", value, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidIn(List<String> values) {
            addCriterion("A_InvitedID in", values, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidNotIn(List<String> values) {
            addCriterion("A_InvitedID not in", values, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidBetween(String value1, String value2) {
            addCriterion("A_InvitedID between", value1, value2, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAInvitedidNotBetween(String value1, String value2) {
            addCriterion("A_InvitedID not between", value1, value2, "aInvitedid");
            return (Criteria) this;
        }

        public Criteria andAPidIsNull() {
            addCriterion("A_PID is null");
            return (Criteria) this;
        }

        public Criteria andAPidIsNotNull() {
            addCriterion("A_PID is not null");
            return (Criteria) this;
        }

        public Criteria andAPidEqualTo(Integer value) {
            addCriterion("A_PID =", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidNotEqualTo(Integer value) {
            addCriterion("A_PID <>", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidGreaterThan(Integer value) {
            addCriterion("A_PID >", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("A_PID >=", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidLessThan(Integer value) {
            addCriterion("A_PID <", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidLessThanOrEqualTo(Integer value) {
            addCriterion("A_PID <=", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidIn(List<Integer> values) {
            addCriterion("A_PID in", values, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidNotIn(List<Integer> values) {
            addCriterion("A_PID not in", values, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidBetween(Integer value1, Integer value2) {
            addCriterion("A_PID between", value1, value2, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidNotBetween(Integer value1, Integer value2) {
            addCriterion("A_PID not between", value1, value2, "aPid");
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