package com.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayuserExample() {
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

        public Criteria andPlayidIsNull() {
            addCriterion("playid is null");
            return (Criteria) this;
        }

        public Criteria andPlayidIsNotNull() {
            addCriterion("playid is not null");
            return (Criteria) this;
        }

        public Criteria andPlayidEqualTo(Integer value) {
            addCriterion("playid =", value, "playid");
            return (Criteria) this;
        }

        public Criteria andPlayidNotEqualTo(Integer value) {
            addCriterion("playid <>", value, "playid");
            return (Criteria) this;
        }

        public Criteria andPlayidGreaterThan(Integer value) {
            addCriterion("playid >", value, "playid");
            return (Criteria) this;
        }

        public Criteria andPlayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("playid >=", value, "playid");
            return (Criteria) this;
        }

        public Criteria andPlayidLessThan(Integer value) {
            addCriterion("playid <", value, "playid");
            return (Criteria) this;
        }

        public Criteria andPlayidLessThanOrEqualTo(Integer value) {
            addCriterion("playid <=", value, "playid");
            return (Criteria) this;
        }

        public Criteria andPlayidIn(List<Integer> values) {
            addCriterion("playid in", values, "playid");
            return (Criteria) this;
        }

        public Criteria andPlayidNotIn(List<Integer> values) {
            addCriterion("playid not in", values, "playid");
            return (Criteria) this;
        }

        public Criteria andPlayidBetween(Integer value1, Integer value2) {
            addCriterion("playid between", value1, value2, "playid");
            return (Criteria) this;
        }

        public Criteria andPlayidNotBetween(Integer value1, Integer value2) {
            addCriterion("playid not between", value1, value2, "playid");
            return (Criteria) this;
        }

        public Criteria andPlaynameIsNull() {
            addCriterion("playname is null");
            return (Criteria) this;
        }

        public Criteria andPlaynameIsNotNull() {
            addCriterion("playname is not null");
            return (Criteria) this;
        }

        public Criteria andPlaynameEqualTo(String value) {
            addCriterion("playname =", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameNotEqualTo(String value) {
            addCriterion("playname <>", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameGreaterThan(String value) {
            addCriterion("playname >", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameGreaterThanOrEqualTo(String value) {
            addCriterion("playname >=", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameLessThan(String value) {
            addCriterion("playname <", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameLessThanOrEqualTo(String value) {
            addCriterion("playname <=", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameLike(String value) {
            addCriterion("playname like", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameNotLike(String value) {
            addCriterion("playname not like", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameIn(List<String> values) {
            addCriterion("playname in", values, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameNotIn(List<String> values) {
            addCriterion("playname not in", values, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameBetween(String value1, String value2) {
            addCriterion("playname between", value1, value2, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameNotBetween(String value1, String value2) {
            addCriterion("playname not between", value1, value2, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaypwdIsNull() {
            addCriterion("playpwd is null");
            return (Criteria) this;
        }

        public Criteria andPlaypwdIsNotNull() {
            addCriterion("playpwd is not null");
            return (Criteria) this;
        }

        public Criteria andPlaypwdEqualTo(String value) {
            addCriterion("playpwd =", value, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdNotEqualTo(String value) {
            addCriterion("playpwd <>", value, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdGreaterThan(String value) {
            addCriterion("playpwd >", value, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdGreaterThanOrEqualTo(String value) {
            addCriterion("playpwd >=", value, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdLessThan(String value) {
            addCriterion("playpwd <", value, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdLessThanOrEqualTo(String value) {
            addCriterion("playpwd <=", value, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdLike(String value) {
            addCriterion("playpwd like", value, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdNotLike(String value) {
            addCriterion("playpwd not like", value, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdIn(List<String> values) {
            addCriterion("playpwd in", values, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdNotIn(List<String> values) {
            addCriterion("playpwd not in", values, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdBetween(String value1, String value2) {
            addCriterion("playpwd between", value1, value2, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlaypwdNotBetween(String value1, String value2) {
            addCriterion("playpwd not between", value1, value2, "playpwd");
            return (Criteria) this;
        }

        public Criteria andPlayphoneIsNull() {
            addCriterion("playphone is null");
            return (Criteria) this;
        }

        public Criteria andPlayphoneIsNotNull() {
            addCriterion("playphone is not null");
            return (Criteria) this;
        }

        public Criteria andPlayphoneEqualTo(String value) {
            addCriterion("playphone =", value, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneNotEqualTo(String value) {
            addCriterion("playphone <>", value, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneGreaterThan(String value) {
            addCriterion("playphone >", value, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneGreaterThanOrEqualTo(String value) {
            addCriterion("playphone >=", value, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneLessThan(String value) {
            addCriterion("playphone <", value, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneLessThanOrEqualTo(String value) {
            addCriterion("playphone <=", value, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneLike(String value) {
            addCriterion("playphone like", value, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneNotLike(String value) {
            addCriterion("playphone not like", value, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneIn(List<String> values) {
            addCriterion("playphone in", values, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneNotIn(List<String> values) {
            addCriterion("playphone not in", values, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneBetween(String value1, String value2) {
            addCriterion("playphone between", value1, value2, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlayphoneNotBetween(String value1, String value2) {
            addCriterion("playphone not between", value1, value2, "playphone");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeIsNull() {
            addCriterion("playstartime is null");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeIsNotNull() {
            addCriterion("playstartime is not null");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeEqualTo(Date value) {
            addCriterion("playstartime =", value, "playstartime");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeNotEqualTo(Date value) {
            addCriterion("playstartime <>", value, "playstartime");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeGreaterThan(Date value) {
            addCriterion("playstartime >", value, "playstartime");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeGreaterThanOrEqualTo(Date value) {
            addCriterion("playstartime >=", value, "playstartime");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeLessThan(Date value) {
            addCriterion("playstartime <", value, "playstartime");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeLessThanOrEqualTo(Date value) {
            addCriterion("playstartime <=", value, "playstartime");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeIn(List<Date> values) {
            addCriterion("playstartime in", values, "playstartime");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeNotIn(List<Date> values) {
            addCriterion("playstartime not in", values, "playstartime");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeBetween(Date value1, Date value2) {
            addCriterion("playstartime between", value1, value2, "playstartime");
            return (Criteria) this;
        }

        public Criteria andPlaystartimeNotBetween(Date value1, Date value2) {
            addCriterion("playstartime not between", value1, value2, "playstartime");
            return (Criteria) this;
        }

        public Criteria andPlaystateIsNull() {
            addCriterion("playstate is null");
            return (Criteria) this;
        }

        public Criteria andPlaystateIsNotNull() {
            addCriterion("playstate is not null");
            return (Criteria) this;
        }

        public Criteria andPlaystateEqualTo(Integer value) {
            addCriterion("playstate =", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateNotEqualTo(Integer value) {
            addCriterion("playstate <>", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateGreaterThan(Integer value) {
            addCriterion("playstate >", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("playstate >=", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateLessThan(Integer value) {
            addCriterion("playstate <", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateLessThanOrEqualTo(Integer value) {
            addCriterion("playstate <=", value, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateIn(List<Integer> values) {
            addCriterion("playstate in", values, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateNotIn(List<Integer> values) {
            addCriterion("playstate not in", values, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateBetween(Integer value1, Integer value2) {
            addCriterion("playstate between", value1, value2, "playstate");
            return (Criteria) this;
        }

        public Criteria andPlaystateNotBetween(Integer value1, Integer value2) {
            addCriterion("playstate not between", value1, value2, "playstate");
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