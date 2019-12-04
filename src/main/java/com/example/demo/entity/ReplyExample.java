package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("R_ID is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("R_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("R_ID =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("R_ID <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("R_ID >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_ID >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("R_ID <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("R_ID <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("R_ID in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("R_ID not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("R_ID between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("R_ID not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRUidIsNull() {
            addCriterion("R_UID is null");
            return (Criteria) this;
        }

        public Criteria andRUidIsNotNull() {
            addCriterion("R_UID is not null");
            return (Criteria) this;
        }

        public Criteria andRUidEqualTo(Integer value) {
            addCriterion("R_UID =", value, "rUid");
            return (Criteria) this;
        }

        public Criteria andRUidNotEqualTo(Integer value) {
            addCriterion("R_UID <>", value, "rUid");
            return (Criteria) this;
        }

        public Criteria andRUidGreaterThan(Integer value) {
            addCriterion("R_UID >", value, "rUid");
            return (Criteria) this;
        }

        public Criteria andRUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_UID >=", value, "rUid");
            return (Criteria) this;
        }

        public Criteria andRUidLessThan(Integer value) {
            addCriterion("R_UID <", value, "rUid");
            return (Criteria) this;
        }

        public Criteria andRUidLessThanOrEqualTo(Integer value) {
            addCriterion("R_UID <=", value, "rUid");
            return (Criteria) this;
        }

        public Criteria andRUidIn(List<Integer> values) {
            addCriterion("R_UID in", values, "rUid");
            return (Criteria) this;
        }

        public Criteria andRUidNotIn(List<Integer> values) {
            addCriterion("R_UID not in", values, "rUid");
            return (Criteria) this;
        }

        public Criteria andRUidBetween(Integer value1, Integer value2) {
            addCriterion("R_UID between", value1, value2, "rUid");
            return (Criteria) this;
        }

        public Criteria andRUidNotBetween(Integer value1, Integer value2) {
            addCriterion("R_UID not between", value1, value2, "rUid");
            return (Criteria) this;
        }

        public Criteria andRPidIsNull() {
            addCriterion("R_PID is null");
            return (Criteria) this;
        }

        public Criteria andRPidIsNotNull() {
            addCriterion("R_PID is not null");
            return (Criteria) this;
        }

        public Criteria andRPidEqualTo(Integer value) {
            addCriterion("R_PID =", value, "rPid");
            return (Criteria) this;
        }

        public Criteria andRPidNotEqualTo(Integer value) {
            addCriterion("R_PID <>", value, "rPid");
            return (Criteria) this;
        }

        public Criteria andRPidGreaterThan(Integer value) {
            addCriterion("R_PID >", value, "rPid");
            return (Criteria) this;
        }

        public Criteria andRPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_PID >=", value, "rPid");
            return (Criteria) this;
        }

        public Criteria andRPidLessThan(Integer value) {
            addCriterion("R_PID <", value, "rPid");
            return (Criteria) this;
        }

        public Criteria andRPidLessThanOrEqualTo(Integer value) {
            addCriterion("R_PID <=", value, "rPid");
            return (Criteria) this;
        }

        public Criteria andRPidIn(List<Integer> values) {
            addCriterion("R_PID in", values, "rPid");
            return (Criteria) this;
        }

        public Criteria andRPidNotIn(List<Integer> values) {
            addCriterion("R_PID not in", values, "rPid");
            return (Criteria) this;
        }

        public Criteria andRPidBetween(Integer value1, Integer value2) {
            addCriterion("R_PID between", value1, value2, "rPid");
            return (Criteria) this;
        }

        public Criteria andRPidNotBetween(Integer value1, Integer value2) {
            addCriterion("R_PID not between", value1, value2, "rPid");
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