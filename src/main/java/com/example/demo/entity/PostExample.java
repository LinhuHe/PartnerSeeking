package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("P_ID is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("P_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("P_ID =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("P_ID <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("P_ID >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_ID >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("P_ID <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("P_ID <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("P_ID in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("P_ID not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("P_ID between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("P_ID not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPTittleIsNull() {
            addCriterion("P_Tittle is null");
            return (Criteria) this;
        }

        public Criteria andPTittleIsNotNull() {
            addCriterion("P_Tittle is not null");
            return (Criteria) this;
        }

        public Criteria andPTittleEqualTo(String value) {
            addCriterion("P_Tittle =", value, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleNotEqualTo(String value) {
            addCriterion("P_Tittle <>", value, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleGreaterThan(String value) {
            addCriterion("P_Tittle >", value, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleGreaterThanOrEqualTo(String value) {
            addCriterion("P_Tittle >=", value, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleLessThan(String value) {
            addCriterion("P_Tittle <", value, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleLessThanOrEqualTo(String value) {
            addCriterion("P_Tittle <=", value, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleLike(String value) {
            addCriterion("P_Tittle like", value, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleNotLike(String value) {
            addCriterion("P_Tittle not like", value, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleIn(List<String> values) {
            addCriterion("P_Tittle in", values, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleNotIn(List<String> values) {
            addCriterion("P_Tittle not in", values, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleBetween(String value1, String value2) {
            addCriterion("P_Tittle between", value1, value2, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPTittleNotBetween(String value1, String value2) {
            addCriterion("P_Tittle not between", value1, value2, "pTittle");
            return (Criteria) this;
        }

        public Criteria andPKeywordIsNull() {
            addCriterion("P_KeyWord is null");
            return (Criteria) this;
        }

        public Criteria andPKeywordIsNotNull() {
            addCriterion("P_KeyWord is not null");
            return (Criteria) this;
        }

        public Criteria andPKeywordEqualTo(String value) {
            addCriterion("P_KeyWord =", value, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordNotEqualTo(String value) {
            addCriterion("P_KeyWord <>", value, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordGreaterThan(String value) {
            addCriterion("P_KeyWord >", value, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("P_KeyWord >=", value, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordLessThan(String value) {
            addCriterion("P_KeyWord <", value, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordLessThanOrEqualTo(String value) {
            addCriterion("P_KeyWord <=", value, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordLike(String value) {
            addCriterion("P_KeyWord like", value, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordNotLike(String value) {
            addCriterion("P_KeyWord not like", value, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordIn(List<String> values) {
            addCriterion("P_KeyWord in", values, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordNotIn(List<String> values) {
            addCriterion("P_KeyWord not in", values, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordBetween(String value1, String value2) {
            addCriterion("P_KeyWord between", value1, value2, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPKeywordNotBetween(String value1, String value2) {
            addCriterion("P_KeyWord not between", value1, value2, "pKeyword");
            return (Criteria) this;
        }

        public Criteria andPContentIsNull() {
            addCriterion("P_Content is null");
            return (Criteria) this;
        }

        public Criteria andPContentIsNotNull() {
            addCriterion("P_Content is not null");
            return (Criteria) this;
        }

        public Criteria andPContentEqualTo(String value) {
            addCriterion("P_Content =", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotEqualTo(String value) {
            addCriterion("P_Content <>", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentGreaterThan(String value) {
            addCriterion("P_Content >", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentGreaterThanOrEqualTo(String value) {
            addCriterion("P_Content >=", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLessThan(String value) {
            addCriterion("P_Content <", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLessThanOrEqualTo(String value) {
            addCriterion("P_Content <=", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentLike(String value) {
            addCriterion("P_Content like", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotLike(String value) {
            addCriterion("P_Content not like", value, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentIn(List<String> values) {
            addCriterion("P_Content in", values, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotIn(List<String> values) {
            addCriterion("P_Content not in", values, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentBetween(String value1, String value2) {
            addCriterion("P_Content between", value1, value2, "pContent");
            return (Criteria) this;
        }

        public Criteria andPContentNotBetween(String value1, String value2) {
            addCriterion("P_Content not between", value1, value2, "pContent");
            return (Criteria) this;
        }

        public Criteria andPNumIsNull() {
            addCriterion("P_Num is null");
            return (Criteria) this;
        }

        public Criteria andPNumIsNotNull() {
            addCriterion("P_Num is not null");
            return (Criteria) this;
        }

        public Criteria andPNumEqualTo(Integer value) {
            addCriterion("P_Num =", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumNotEqualTo(Integer value) {
            addCriterion("P_Num <>", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumGreaterThan(Integer value) {
            addCriterion("P_Num >", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_Num >=", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumLessThan(Integer value) {
            addCriterion("P_Num <", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumLessThanOrEqualTo(Integer value) {
            addCriterion("P_Num <=", value, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumIn(List<Integer> values) {
            addCriterion("P_Num in", values, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumNotIn(List<Integer> values) {
            addCriterion("P_Num not in", values, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumBetween(Integer value1, Integer value2) {
            addCriterion("P_Num between", value1, value2, "pNum");
            return (Criteria) this;
        }

        public Criteria andPNumNotBetween(Integer value1, Integer value2) {
            addCriterion("P_Num not between", value1, value2, "pNum");
            return (Criteria) this;
        }

        public Criteria andPUidIsNull() {
            addCriterion("P_UID is null");
            return (Criteria) this;
        }

        public Criteria andPUidIsNotNull() {
            addCriterion("P_UID is not null");
            return (Criteria) this;
        }

        public Criteria andPUidEqualTo(String value) {
            addCriterion("P_UID =", value, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidNotEqualTo(String value) {
            addCriterion("P_UID <>", value, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidGreaterThan(String value) {
            addCriterion("P_UID >", value, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidGreaterThanOrEqualTo(String value) {
            addCriterion("P_UID >=", value, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidLessThan(String value) {
            addCriterion("P_UID <", value, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidLessThanOrEqualTo(String value) {
            addCriterion("P_UID <=", value, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidLike(String value) {
            addCriterion("P_UID like", value, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidNotLike(String value) {
            addCriterion("P_UID not like", value, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidIn(List<String> values) {
            addCriterion("P_UID in", values, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidNotIn(List<String> values) {
            addCriterion("P_UID not in", values, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidBetween(String value1, String value2) {
            addCriterion("P_UID between", value1, value2, "pUid");
            return (Criteria) this;
        }

        public Criteria andPUidNotBetween(String value1, String value2) {
            addCriterion("P_UID not between", value1, value2, "pUid");
            return (Criteria) this;
        }

        public Criteria andPPosttimeIsNull() {
            addCriterion("P_PostTime is null");
            return (Criteria) this;
        }

        public Criteria andPPosttimeIsNotNull() {
            addCriterion("P_PostTime is not null");
            return (Criteria) this;
        }

        public Criteria andPPosttimeEqualTo(Date value) {
            addCriterion("P_PostTime =", value, "pPosttime");
            return (Criteria) this;
        }

        public Criteria andPPosttimeNotEqualTo(Date value) {
            addCriterion("P_PostTime <>", value, "pPosttime");
            return (Criteria) this;
        }

        public Criteria andPPosttimeGreaterThan(Date value) {
            addCriterion("P_PostTime >", value, "pPosttime");
            return (Criteria) this;
        }

        public Criteria andPPosttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("P_PostTime >=", value, "pPosttime");
            return (Criteria) this;
        }

        public Criteria andPPosttimeLessThan(Date value) {
            addCriterion("P_PostTime <", value, "pPosttime");
            return (Criteria) this;
        }

        public Criteria andPPosttimeLessThanOrEqualTo(Date value) {
            addCriterion("P_PostTime <=", value, "pPosttime");
            return (Criteria) this;
        }

        public Criteria andPPosttimeIn(List<Date> values) {
            addCriterion("P_PostTime in", values, "pPosttime");
            return (Criteria) this;
        }

        public Criteria andPPosttimeNotIn(List<Date> values) {
            addCriterion("P_PostTime not in", values, "pPosttime");
            return (Criteria) this;
        }

        public Criteria andPPosttimeBetween(Date value1, Date value2) {
            addCriterion("P_PostTime between", value1, value2, "pPosttime");
            return (Criteria) this;
        }

        public Criteria andPPosttimeNotBetween(Date value1, Date value2) {
            addCriterion("P_PostTime not between", value1, value2, "pPosttime");
            return (Criteria) this;
        }

        public Criteria andPEndtimeIsNull() {
            addCriterion("P_EndTime is null");
            return (Criteria) this;
        }

        public Criteria andPEndtimeIsNotNull() {
            addCriterion("P_EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andPEndtimeEqualTo(Date value) {
            addCriterion("P_EndTime =", value, "pEndtime");
            return (Criteria) this;
        }

        public Criteria andPEndtimeNotEqualTo(Date value) {
            addCriterion("P_EndTime <>", value, "pEndtime");
            return (Criteria) this;
        }

        public Criteria andPEndtimeGreaterThan(Date value) {
            addCriterion("P_EndTime >", value, "pEndtime");
            return (Criteria) this;
        }

        public Criteria andPEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("P_EndTime >=", value, "pEndtime");
            return (Criteria) this;
        }

        public Criteria andPEndtimeLessThan(Date value) {
            addCriterion("P_EndTime <", value, "pEndtime");
            return (Criteria) this;
        }

        public Criteria andPEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("P_EndTime <=", value, "pEndtime");
            return (Criteria) this;
        }

        public Criteria andPEndtimeIn(List<Date> values) {
            addCriterion("P_EndTime in", values, "pEndtime");
            return (Criteria) this;
        }

        public Criteria andPEndtimeNotIn(List<Date> values) {
            addCriterion("P_EndTime not in", values, "pEndtime");
            return (Criteria) this;
        }

        public Criteria andPEndtimeBetween(Date value1, Date value2) {
            addCriterion("P_EndTime between", value1, value2, "pEndtime");
            return (Criteria) this;
        }

        public Criteria andPEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("P_EndTime not between", value1, value2, "pEndtime");
            return (Criteria) this;
        }

        public Criteria andPCollectnumIsNull() {
            addCriterion("P_CollectNum is null");
            return (Criteria) this;
        }

        public Criteria andPCollectnumIsNotNull() {
            addCriterion("P_CollectNum is not null");
            return (Criteria) this;
        }

        public Criteria andPCollectnumEqualTo(Integer value) {
            addCriterion("P_CollectNum =", value, "pCollectnum");
            return (Criteria) this;
        }

        public Criteria andPCollectnumNotEqualTo(Integer value) {
            addCriterion("P_CollectNum <>", value, "pCollectnum");
            return (Criteria) this;
        }

        public Criteria andPCollectnumGreaterThan(Integer value) {
            addCriterion("P_CollectNum >", value, "pCollectnum");
            return (Criteria) this;
        }

        public Criteria andPCollectnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_CollectNum >=", value, "pCollectnum");
            return (Criteria) this;
        }

        public Criteria andPCollectnumLessThan(Integer value) {
            addCriterion("P_CollectNum <", value, "pCollectnum");
            return (Criteria) this;
        }

        public Criteria andPCollectnumLessThanOrEqualTo(Integer value) {
            addCriterion("P_CollectNum <=", value, "pCollectnum");
            return (Criteria) this;
        }

        public Criteria andPCollectnumIn(List<Integer> values) {
            addCriterion("P_CollectNum in", values, "pCollectnum");
            return (Criteria) this;
        }

        public Criteria andPCollectnumNotIn(List<Integer> values) {
            addCriterion("P_CollectNum not in", values, "pCollectnum");
            return (Criteria) this;
        }

        public Criteria andPCollectnumBetween(Integer value1, Integer value2) {
            addCriterion("P_CollectNum between", value1, value2, "pCollectnum");
            return (Criteria) this;
        }

        public Criteria andPCollectnumNotBetween(Integer value1, Integer value2) {
            addCriterion("P_CollectNum not between", value1, value2, "pCollectnum");
            return (Criteria) this;
        }

        public Criteria andPBanIsNull() {
            addCriterion("P_Ban is null");
            return (Criteria) this;
        }

        public Criteria andPBanIsNotNull() {
            addCriterion("P_Ban is not null");
            return (Criteria) this;
        }

        public Criteria andPBanEqualTo(Byte value) {
            addCriterion("P_Ban =", value, "pBan");
            return (Criteria) this;
        }

        public Criteria andPBanNotEqualTo(Byte value) {
            addCriterion("P_Ban <>", value, "pBan");
            return (Criteria) this;
        }

        public Criteria andPBanGreaterThan(Byte value) {
            addCriterion("P_Ban >", value, "pBan");
            return (Criteria) this;
        }

        public Criteria andPBanGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Ban >=", value, "pBan");
            return (Criteria) this;
        }

        public Criteria andPBanLessThan(Byte value) {
            addCriterion("P_Ban <", value, "pBan");
            return (Criteria) this;
        }

        public Criteria andPBanLessThanOrEqualTo(Byte value) {
            addCriterion("P_Ban <=", value, "pBan");
            return (Criteria) this;
        }

        public Criteria andPBanIn(List<Byte> values) {
            addCriterion("P_Ban in", values, "pBan");
            return (Criteria) this;
        }

        public Criteria andPBanNotIn(List<Byte> values) {
            addCriterion("P_Ban not in", values, "pBan");
            return (Criteria) this;
        }

        public Criteria andPBanBetween(Byte value1, Byte value2) {
            addCriterion("P_Ban between", value1, value2, "pBan");
            return (Criteria) this;
        }

        public Criteria andPBanNotBetween(Byte value1, Byte value2) {
            addCriterion("P_Ban not between", value1, value2, "pBan");
            return (Criteria) this;
        }

        public Criteria andPProIsNull() {
            addCriterion("P_Pro is null");
            return (Criteria) this;
        }

        public Criteria andPProIsNotNull() {
            addCriterion("P_Pro is not null");
            return (Criteria) this;
        }

        public Criteria andPProEqualTo(Byte value) {
            addCriterion("P_Pro =", value, "pPro");
            return (Criteria) this;
        }

        public Criteria andPProNotEqualTo(Byte value) {
            addCriterion("P_Pro <>", value, "pPro");
            return (Criteria) this;
        }

        public Criteria andPProGreaterThan(Byte value) {
            addCriterion("P_Pro >", value, "pPro");
            return (Criteria) this;
        }

        public Criteria andPProGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Pro >=", value, "pPro");
            return (Criteria) this;
        }

        public Criteria andPProLessThan(Byte value) {
            addCriterion("P_Pro <", value, "pPro");
            return (Criteria) this;
        }

        public Criteria andPProLessThanOrEqualTo(Byte value) {
            addCriterion("P_Pro <=", value, "pPro");
            return (Criteria) this;
        }

        public Criteria andPProIn(List<Byte> values) {
            addCriterion("P_Pro in", values, "pPro");
            return (Criteria) this;
        }

        public Criteria andPProNotIn(List<Byte> values) {
            addCriterion("P_Pro not in", values, "pPro");
            return (Criteria) this;
        }

        public Criteria andPProBetween(Byte value1, Byte value2) {
            addCriterion("P_Pro between", value1, value2, "pPro");
            return (Criteria) this;
        }

        public Criteria andPProNotBetween(Byte value1, Byte value2) {
            addCriterion("P_Pro not between", value1, value2, "pPro");
            return (Criteria) this;
        }

        public Criteria andPExiIsNull() {
            addCriterion("P_Exi is null");
            return (Criteria) this;
        }

        public Criteria andPExiIsNotNull() {
            addCriterion("P_Exi is not null");
            return (Criteria) this;
        }

        public Criteria andPExiEqualTo(Byte value) {
            addCriterion("P_Exi =", value, "pExi");
            return (Criteria) this;
        }

        public Criteria andPExiNotEqualTo(Byte value) {
            addCriterion("P_Exi <>", value, "pExi");
            return (Criteria) this;
        }

        public Criteria andPExiGreaterThan(Byte value) {
            addCriterion("P_Exi >", value, "pExi");
            return (Criteria) this;
        }

        public Criteria andPExiGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Exi >=", value, "pExi");
            return (Criteria) this;
        }

        public Criteria andPExiLessThan(Byte value) {
            addCriterion("P_Exi <", value, "pExi");
            return (Criteria) this;
        }

        public Criteria andPExiLessThanOrEqualTo(Byte value) {
            addCriterion("P_Exi <=", value, "pExi");
            return (Criteria) this;
        }

        public Criteria andPExiIn(List<Byte> values) {
            addCriterion("P_Exi in", values, "pExi");
            return (Criteria) this;
        }

        public Criteria andPExiNotIn(List<Byte> values) {
            addCriterion("P_Exi not in", values, "pExi");
            return (Criteria) this;
        }

        public Criteria andPExiBetween(Byte value1, Byte value2) {
            addCriterion("P_Exi between", value1, value2, "pExi");
            return (Criteria) this;
        }

        public Criteria andPExiNotBetween(Byte value1, Byte value2) {
            addCriterion("P_Exi not between", value1, value2, "pExi");
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