package org.humingk.movie.entity;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNull() {
            addCriterion("name_zh is null");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNotNull() {
            addCriterion("name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andNameZhEqualTo(String value) {
            addCriterion("name_zh =", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotEqualTo(String value) {
            addCriterion("name_zh <>", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThan(String value) {
            addCriterion("name_zh >", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("name_zh >=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThan(String value) {
            addCriterion("name_zh <", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThanOrEqualTo(String value) {
            addCriterion("name_zh <=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLike(String value) {
            addCriterion("name_zh like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotLike(String value) {
            addCriterion("name_zh not like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhIn(List<String> values) {
            addCriterion("name_zh in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotIn(List<String> values) {
            addCriterion("name_zh not in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhBetween(String value1, String value2) {
            addCriterion("name_zh between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotBetween(String value1, String value2) {
            addCriterion("name_zh not between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andPathSrcIsNull() {
            addCriterion("path_src is null");
            return (Criteria) this;
        }

        public Criteria andPathSrcIsNotNull() {
            addCriterion("path_src is not null");
            return (Criteria) this;
        }

        public Criteria andPathSrcEqualTo(String value) {
            addCriterion("path_src =", value, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcNotEqualTo(String value) {
            addCriterion("path_src <>", value, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcGreaterThan(String value) {
            addCriterion("path_src >", value, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcGreaterThanOrEqualTo(String value) {
            addCriterion("path_src >=", value, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcLessThan(String value) {
            addCriterion("path_src <", value, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcLessThanOrEqualTo(String value) {
            addCriterion("path_src <=", value, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcLike(String value) {
            addCriterion("path_src like", value, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcNotLike(String value) {
            addCriterion("path_src not like", value, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcIn(List<String> values) {
            addCriterion("path_src in", values, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcNotIn(List<String> values) {
            addCriterion("path_src not in", values, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcBetween(String value1, String value2) {
            addCriterion("path_src between", value1, value2, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andPathSrcNotBetween(String value1, String value2) {
            addCriterion("path_src not between", value1, value2, "pathSrc");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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