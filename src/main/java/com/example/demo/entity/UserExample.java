package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("U_ID like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("U_ID not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNull() {
            addCriterion("U_NickName is null");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNotNull() {
            addCriterion("U_NickName is not null");
            return (Criteria) this;
        }

        public Criteria andUNicknameEqualTo(String value) {
            addCriterion("U_NickName =", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotEqualTo(String value) {
            addCriterion("U_NickName <>", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThan(String value) {
            addCriterion("U_NickName >", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NickName >=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThan(String value) {
            addCriterion("U_NickName <", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThanOrEqualTo(String value) {
            addCriterion("U_NickName <=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLike(String value) {
            addCriterion("U_NickName like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotLike(String value) {
            addCriterion("U_NickName not like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameIn(List<String> values) {
            addCriterion("U_NickName in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotIn(List<String> values) {
            addCriterion("U_NickName not in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameBetween(String value1, String value2) {
            addCriterion("U_NickName between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotBetween(String value1, String value2) {
            addCriterion("U_NickName not between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("U_Sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("U_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(Byte value) {
            addCriterion("U_Sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(Byte value) {
            addCriterion("U_Sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(Byte value) {
            addCriterion("U_Sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("U_Sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(Byte value) {
            addCriterion("U_Sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(Byte value) {
            addCriterion("U_Sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<Byte> values) {
            addCriterion("U_Sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<Byte> values) {
            addCriterion("U_Sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(Byte value1, Byte value2) {
            addCriterion("U_Sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(Byte value1, Byte value2) {
            addCriterion("U_Sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUWechatIsNull() {
            addCriterion("U_WeChat is null");
            return (Criteria) this;
        }

        public Criteria andUWechatIsNotNull() {
            addCriterion("U_WeChat is not null");
            return (Criteria) this;
        }

        public Criteria andUWechatEqualTo(String value) {
            addCriterion("U_WeChat =", value, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatNotEqualTo(String value) {
            addCriterion("U_WeChat <>", value, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatGreaterThan(String value) {
            addCriterion("U_WeChat >", value, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatGreaterThanOrEqualTo(String value) {
            addCriterion("U_WeChat >=", value, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatLessThan(String value) {
            addCriterion("U_WeChat <", value, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatLessThanOrEqualTo(String value) {
            addCriterion("U_WeChat <=", value, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatLike(String value) {
            addCriterion("U_WeChat like", value, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatNotLike(String value) {
            addCriterion("U_WeChat not like", value, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatIn(List<String> values) {
            addCriterion("U_WeChat in", values, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatNotIn(List<String> values) {
            addCriterion("U_WeChat not in", values, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatBetween(String value1, String value2) {
            addCriterion("U_WeChat between", value1, value2, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUWechatNotBetween(String value1, String value2) {
            addCriterion("U_WeChat not between", value1, value2, "uWechat");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitIsNull() {
            addCriterion("U_Headortrait is null");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitIsNotNull() {
            addCriterion("U_Headortrait is not null");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitEqualTo(String value) {
            addCriterion("U_Headortrait =", value, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitNotEqualTo(String value) {
            addCriterion("U_Headortrait <>", value, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitGreaterThan(String value) {
            addCriterion("U_Headortrait >", value, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitGreaterThanOrEqualTo(String value) {
            addCriterion("U_Headortrait >=", value, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitLessThan(String value) {
            addCriterion("U_Headortrait <", value, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitLessThanOrEqualTo(String value) {
            addCriterion("U_Headortrait <=", value, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitLike(String value) {
            addCriterion("U_Headortrait like", value, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitNotLike(String value) {
            addCriterion("U_Headortrait not like", value, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitIn(List<String> values) {
            addCriterion("U_Headortrait in", values, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitNotIn(List<String> values) {
            addCriterion("U_Headortrait not in", values, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitBetween(String value1, String value2) {
            addCriterion("U_Headortrait between", value1, value2, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadortraitNotBetween(String value1, String value2) {
            addCriterion("U_Headortrait not between", value1, value2, "uHeadortrait");
            return (Criteria) this;
        }

        public Criteria andUProvinceidIsNull() {
            addCriterion("U_ProvinceID is null");
            return (Criteria) this;
        }

        public Criteria andUProvinceidIsNotNull() {
            addCriterion("U_ProvinceID is not null");
            return (Criteria) this;
        }

        public Criteria andUProvinceidEqualTo(Integer value) {
            addCriterion("U_ProvinceID =", value, "uProvinceid");
            return (Criteria) this;
        }

        public Criteria andUProvinceidNotEqualTo(Integer value) {
            addCriterion("U_ProvinceID <>", value, "uProvinceid");
            return (Criteria) this;
        }

        public Criteria andUProvinceidGreaterThan(Integer value) {
            addCriterion("U_ProvinceID >", value, "uProvinceid");
            return (Criteria) this;
        }

        public Criteria andUProvinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ProvinceID >=", value, "uProvinceid");
            return (Criteria) this;
        }

        public Criteria andUProvinceidLessThan(Integer value) {
            addCriterion("U_ProvinceID <", value, "uProvinceid");
            return (Criteria) this;
        }

        public Criteria andUProvinceidLessThanOrEqualTo(Integer value) {
            addCriterion("U_ProvinceID <=", value, "uProvinceid");
            return (Criteria) this;
        }

        public Criteria andUProvinceidIn(List<Integer> values) {
            addCriterion("U_ProvinceID in", values, "uProvinceid");
            return (Criteria) this;
        }

        public Criteria andUProvinceidNotIn(List<Integer> values) {
            addCriterion("U_ProvinceID not in", values, "uProvinceid");
            return (Criteria) this;
        }

        public Criteria andUProvinceidBetween(Integer value1, Integer value2) {
            addCriterion("U_ProvinceID between", value1, value2, "uProvinceid");
            return (Criteria) this;
        }

        public Criteria andUProvinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("U_ProvinceID not between", value1, value2, "uProvinceid");
            return (Criteria) this;
        }

        public Criteria andUCityidIsNull() {
            addCriterion("U_CityID is null");
            return (Criteria) this;
        }

        public Criteria andUCityidIsNotNull() {
            addCriterion("U_CityID is not null");
            return (Criteria) this;
        }

        public Criteria andUCityidEqualTo(Integer value) {
            addCriterion("U_CityID =", value, "uCityid");
            return (Criteria) this;
        }

        public Criteria andUCityidNotEqualTo(Integer value) {
            addCriterion("U_CityID <>", value, "uCityid");
            return (Criteria) this;
        }

        public Criteria andUCityidGreaterThan(Integer value) {
            addCriterion("U_CityID >", value, "uCityid");
            return (Criteria) this;
        }

        public Criteria andUCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_CityID >=", value, "uCityid");
            return (Criteria) this;
        }

        public Criteria andUCityidLessThan(Integer value) {
            addCriterion("U_CityID <", value, "uCityid");
            return (Criteria) this;
        }

        public Criteria andUCityidLessThanOrEqualTo(Integer value) {
            addCriterion("U_CityID <=", value, "uCityid");
            return (Criteria) this;
        }

        public Criteria andUCityidIn(List<Integer> values) {
            addCriterion("U_CityID in", values, "uCityid");
            return (Criteria) this;
        }

        public Criteria andUCityidNotIn(List<Integer> values) {
            addCriterion("U_CityID not in", values, "uCityid");
            return (Criteria) this;
        }

        public Criteria andUCityidBetween(Integer value1, Integer value2) {
            addCriterion("U_CityID between", value1, value2, "uCityid");
            return (Criteria) this;
        }

        public Criteria andUCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("U_CityID not between", value1, value2, "uCityid");
            return (Criteria) this;
        }

        public Criteria andUIdentityIsNull() {
            addCriterion("U_Identity is null");
            return (Criteria) this;
        }

        public Criteria andUIdentityIsNotNull() {
            addCriterion("U_Identity is not null");
            return (Criteria) this;
        }

        public Criteria andUIdentityEqualTo(Byte value) {
            addCriterion("U_Identity =", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityNotEqualTo(Byte value) {
            addCriterion("U_Identity <>", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityGreaterThan(Byte value) {
            addCriterion("U_Identity >", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityGreaterThanOrEqualTo(Byte value) {
            addCriterion("U_Identity >=", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityLessThan(Byte value) {
            addCriterion("U_Identity <", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityLessThanOrEqualTo(Byte value) {
            addCriterion("U_Identity <=", value, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityIn(List<Byte> values) {
            addCriterion("U_Identity in", values, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityNotIn(List<Byte> values) {
            addCriterion("U_Identity not in", values, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityBetween(Byte value1, Byte value2) {
            addCriterion("U_Identity between", value1, value2, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUIdentityNotBetween(Byte value1, Byte value2) {
            addCriterion("U_Identity not between", value1, value2, "uIdentity");
            return (Criteria) this;
        }

        public Criteria andUMerrecIsNull() {
            addCriterion("U_Merrec is null");
            return (Criteria) this;
        }

        public Criteria andUMerrecIsNotNull() {
            addCriterion("U_Merrec is not null");
            return (Criteria) this;
        }

        public Criteria andUMerrecEqualTo(Byte value) {
            addCriterion("U_Merrec =", value, "uMerrec");
            return (Criteria) this;
        }

        public Criteria andUMerrecNotEqualTo(Byte value) {
            addCriterion("U_Merrec <>", value, "uMerrec");
            return (Criteria) this;
        }

        public Criteria andUMerrecGreaterThan(Byte value) {
            addCriterion("U_Merrec >", value, "uMerrec");
            return (Criteria) this;
        }

        public Criteria andUMerrecGreaterThanOrEqualTo(Byte value) {
            addCriterion("U_Merrec >=", value, "uMerrec");
            return (Criteria) this;
        }

        public Criteria andUMerrecLessThan(Byte value) {
            addCriterion("U_Merrec <", value, "uMerrec");
            return (Criteria) this;
        }

        public Criteria andUMerrecLessThanOrEqualTo(Byte value) {
            addCriterion("U_Merrec <=", value, "uMerrec");
            return (Criteria) this;
        }

        public Criteria andUMerrecIn(List<Byte> values) {
            addCriterion("U_Merrec in", values, "uMerrec");
            return (Criteria) this;
        }

        public Criteria andUMerrecNotIn(List<Byte> values) {
            addCriterion("U_Merrec not in", values, "uMerrec");
            return (Criteria) this;
        }

        public Criteria andUMerrecBetween(Byte value1, Byte value2) {
            addCriterion("U_Merrec between", value1, value2, "uMerrec");
            return (Criteria) this;
        }

        public Criteria andUMerrecNotBetween(Byte value1, Byte value2) {
            addCriterion("U_Merrec not between", value1, value2, "uMerrec");
            return (Criteria) this;
        }

        public Criteria andUBanIsNull() {
            addCriterion("U_Ban is null");
            return (Criteria) this;
        }

        public Criteria andUBanIsNotNull() {
            addCriterion("U_Ban is not null");
            return (Criteria) this;
        }

        public Criteria andUBanEqualTo(Byte value) {
            addCriterion("U_Ban =", value, "uBan");
            return (Criteria) this;
        }

        public Criteria andUBanNotEqualTo(Byte value) {
            addCriterion("U_Ban <>", value, "uBan");
            return (Criteria) this;
        }

        public Criteria andUBanGreaterThan(Byte value) {
            addCriterion("U_Ban >", value, "uBan");
            return (Criteria) this;
        }

        public Criteria andUBanGreaterThanOrEqualTo(Byte value) {
            addCriterion("U_Ban >=", value, "uBan");
            return (Criteria) this;
        }

        public Criteria andUBanLessThan(Byte value) {
            addCriterion("U_Ban <", value, "uBan");
            return (Criteria) this;
        }

        public Criteria andUBanLessThanOrEqualTo(Byte value) {
            addCriterion("U_Ban <=", value, "uBan");
            return (Criteria) this;
        }

        public Criteria andUBanIn(List<Byte> values) {
            addCriterion("U_Ban in", values, "uBan");
            return (Criteria) this;
        }

        public Criteria andUBanNotIn(List<Byte> values) {
            addCriterion("U_Ban not in", values, "uBan");
            return (Criteria) this;
        }

        public Criteria andUBanBetween(Byte value1, Byte value2) {
            addCriterion("U_Ban between", value1, value2, "uBan");
            return (Criteria) this;
        }

        public Criteria andUBanNotBetween(Byte value1, Byte value2) {
            addCriterion("U_Ban not between", value1, value2, "uBan");
            return (Criteria) this;
        }

        public Criteria andUExiIsNull() {
            addCriterion("U_Exi is null");
            return (Criteria) this;
        }

        public Criteria andUExiIsNotNull() {
            addCriterion("U_Exi is not null");
            return (Criteria) this;
        }

        public Criteria andUExiEqualTo(Byte value) {
            addCriterion("U_Exi =", value, "uExi");
            return (Criteria) this;
        }

        public Criteria andUExiNotEqualTo(Byte value) {
            addCriterion("U_Exi <>", value, "uExi");
            return (Criteria) this;
        }

        public Criteria andUExiGreaterThan(Byte value) {
            addCriterion("U_Exi >", value, "uExi");
            return (Criteria) this;
        }

        public Criteria andUExiGreaterThanOrEqualTo(Byte value) {
            addCriterion("U_Exi >=", value, "uExi");
            return (Criteria) this;
        }

        public Criteria andUExiLessThan(Byte value) {
            addCriterion("U_Exi <", value, "uExi");
            return (Criteria) this;
        }

        public Criteria andUExiLessThanOrEqualTo(Byte value) {
            addCriterion("U_Exi <=", value, "uExi");
            return (Criteria) this;
        }

        public Criteria andUExiIn(List<Byte> values) {
            addCriterion("U_Exi in", values, "uExi");
            return (Criteria) this;
        }

        public Criteria andUExiNotIn(List<Byte> values) {
            addCriterion("U_Exi not in", values, "uExi");
            return (Criteria) this;
        }

        public Criteria andUExiBetween(Byte value1, Byte value2) {
            addCriterion("U_Exi between", value1, value2, "uExi");
            return (Criteria) this;
        }

        public Criteria andUExiNotBetween(Byte value1, Byte value2) {
            addCriterion("U_Exi not between", value1, value2, "uExi");
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