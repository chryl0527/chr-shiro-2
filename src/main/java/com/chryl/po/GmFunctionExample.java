package com.chryl.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GmFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GmFunctionExample() {
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

        public Criteria andFunIdIsNull() {
            addCriterion("fun_id is null");
            return (Criteria) this;
        }

        public Criteria andFunIdIsNotNull() {
            addCriterion("fun_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunIdEqualTo(String value) {
            addCriterion("fun_id =", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdNotEqualTo(String value) {
            addCriterion("fun_id <>", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdGreaterThan(String value) {
            addCriterion("fun_id >", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdGreaterThanOrEqualTo(String value) {
            addCriterion("fun_id >=", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdLessThan(String value) {
            addCriterion("fun_id <", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdLessThanOrEqualTo(String value) {
            addCriterion("fun_id <=", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdLike(String value) {
            addCriterion("fun_id like", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdNotLike(String value) {
            addCriterion("fun_id not like", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdIn(List<String> values) {
            addCriterion("fun_id in", values, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdNotIn(List<String> values) {
            addCriterion("fun_id not in", values, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdBetween(String value1, String value2) {
            addCriterion("fun_id between", value1, value2, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdNotBetween(String value1, String value2) {
            addCriterion("fun_id not between", value1, value2, "funId");
            return (Criteria) this;
        }

        public Criteria andFunNameIsNull() {
            addCriterion("fun_name is null");
            return (Criteria) this;
        }

        public Criteria andFunNameIsNotNull() {
            addCriterion("fun_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunNameEqualTo(String value) {
            addCriterion("fun_name =", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameNotEqualTo(String value) {
            addCriterion("fun_name <>", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameGreaterThan(String value) {
            addCriterion("fun_name >", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameGreaterThanOrEqualTo(String value) {
            addCriterion("fun_name >=", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameLessThan(String value) {
            addCriterion("fun_name <", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameLessThanOrEqualTo(String value) {
            addCriterion("fun_name <=", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameLike(String value) {
            addCriterion("fun_name like", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameNotLike(String value) {
            addCriterion("fun_name not like", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameIn(List<String> values) {
            addCriterion("fun_name in", values, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameNotIn(List<String> values) {
            addCriterion("fun_name not in", values, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameBetween(String value1, String value2) {
            addCriterion("fun_name between", value1, value2, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameNotBetween(String value1, String value2) {
            addCriterion("fun_name not between", value1, value2, "funName");
            return (Criteria) this;
        }

        public Criteria andFunUrlIsNull() {
            addCriterion("fun_url is null");
            return (Criteria) this;
        }

        public Criteria andFunUrlIsNotNull() {
            addCriterion("fun_url is not null");
            return (Criteria) this;
        }

        public Criteria andFunUrlEqualTo(String value) {
            addCriterion("fun_url =", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlNotEqualTo(String value) {
            addCriterion("fun_url <>", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlGreaterThan(String value) {
            addCriterion("fun_url >", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fun_url >=", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlLessThan(String value) {
            addCriterion("fun_url <", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlLessThanOrEqualTo(String value) {
            addCriterion("fun_url <=", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlLike(String value) {
            addCriterion("fun_url like", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlNotLike(String value) {
            addCriterion("fun_url not like", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlIn(List<String> values) {
            addCriterion("fun_url in", values, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlNotIn(List<String> values) {
            addCriterion("fun_url not in", values, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlBetween(String value1, String value2) {
            addCriterion("fun_url between", value1, value2, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlNotBetween(String value1, String value2) {
            addCriterion("fun_url not between", value1, value2, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunCodeIsNull() {
            addCriterion("fun_code is null");
            return (Criteria) this;
        }

        public Criteria andFunCodeIsNotNull() {
            addCriterion("fun_code is not null");
            return (Criteria) this;
        }

        public Criteria andFunCodeEqualTo(String value) {
            addCriterion("fun_code =", value, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeNotEqualTo(String value) {
            addCriterion("fun_code <>", value, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeGreaterThan(String value) {
            addCriterion("fun_code >", value, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fun_code >=", value, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeLessThan(String value) {
            addCriterion("fun_code <", value, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeLessThanOrEqualTo(String value) {
            addCriterion("fun_code <=", value, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeLike(String value) {
            addCriterion("fun_code like", value, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeNotLike(String value) {
            addCriterion("fun_code not like", value, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeIn(List<String> values) {
            addCriterion("fun_code in", values, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeNotIn(List<String> values) {
            addCriterion("fun_code not in", values, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeBetween(String value1, String value2) {
            addCriterion("fun_code between", value1, value2, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunCodeNotBetween(String value1, String value2) {
            addCriterion("fun_code not between", value1, value2, "funCode");
            return (Criteria) this;
        }

        public Criteria andFunStatusIsNull() {
            addCriterion("fun_status is null");
            return (Criteria) this;
        }

        public Criteria andFunStatusIsNotNull() {
            addCriterion("fun_status is not null");
            return (Criteria) this;
        }

        public Criteria andFunStatusEqualTo(Integer value) {
            addCriterion("fun_status =", value, "funStatus");
            return (Criteria) this;
        }

        public Criteria andFunStatusNotEqualTo(Integer value) {
            addCriterion("fun_status <>", value, "funStatus");
            return (Criteria) this;
        }

        public Criteria andFunStatusGreaterThan(Integer value) {
            addCriterion("fun_status >", value, "funStatus");
            return (Criteria) this;
        }

        public Criteria andFunStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("fun_status >=", value, "funStatus");
            return (Criteria) this;
        }

        public Criteria andFunStatusLessThan(Integer value) {
            addCriterion("fun_status <", value, "funStatus");
            return (Criteria) this;
        }

        public Criteria andFunStatusLessThanOrEqualTo(Integer value) {
            addCriterion("fun_status <=", value, "funStatus");
            return (Criteria) this;
        }

        public Criteria andFunStatusIn(List<Integer> values) {
            addCriterion("fun_status in", values, "funStatus");
            return (Criteria) this;
        }

        public Criteria andFunStatusNotIn(List<Integer> values) {
            addCriterion("fun_status not in", values, "funStatus");
            return (Criteria) this;
        }

        public Criteria andFunStatusBetween(Integer value1, Integer value2) {
            addCriterion("fun_status between", value1, value2, "funStatus");
            return (Criteria) this;
        }

        public Criteria andFunStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("fun_status not between", value1, value2, "funStatus");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeIsNull() {
            addCriterion("fun_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeIsNotNull() {
            addCriterion("fun_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeEqualTo(Date value) {
            addCriterion("fun_create_time =", value, "funCreateTime");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeNotEqualTo(Date value) {
            addCriterion("fun_create_time <>", value, "funCreateTime");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeGreaterThan(Date value) {
            addCriterion("fun_create_time >", value, "funCreateTime");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fun_create_time >=", value, "funCreateTime");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeLessThan(Date value) {
            addCriterion("fun_create_time <", value, "funCreateTime");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("fun_create_time <=", value, "funCreateTime");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeIn(List<Date> values) {
            addCriterion("fun_create_time in", values, "funCreateTime");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeNotIn(List<Date> values) {
            addCriterion("fun_create_time not in", values, "funCreateTime");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeBetween(Date value1, Date value2) {
            addCriterion("fun_create_time between", value1, value2, "funCreateTime");
            return (Criteria) this;
        }

        public Criteria andFunCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("fun_create_time not between", value1, value2, "funCreateTime");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeIsNull() {
            addCriterion("fun_update_time is null");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeIsNotNull() {
            addCriterion("fun_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeEqualTo(Date value) {
            addCriterion("fun_update_time =", value, "funUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeNotEqualTo(Date value) {
            addCriterion("fun_update_time <>", value, "funUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeGreaterThan(Date value) {
            addCriterion("fun_update_time >", value, "funUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fun_update_time >=", value, "funUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeLessThan(Date value) {
            addCriterion("fun_update_time <", value, "funUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("fun_update_time <=", value, "funUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeIn(List<Date> values) {
            addCriterion("fun_update_time in", values, "funUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeNotIn(List<Date> values) {
            addCriterion("fun_update_time not in", values, "funUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("fun_update_time between", value1, value2, "funUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFunUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("fun_update_time not between", value1, value2, "funUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdIsNull() {
            addCriterion("fun_g_role_id is null");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdIsNotNull() {
            addCriterion("fun_g_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdEqualTo(String value) {
            addCriterion("fun_g_role_id =", value, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdNotEqualTo(String value) {
            addCriterion("fun_g_role_id <>", value, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdGreaterThan(String value) {
            addCriterion("fun_g_role_id >", value, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("fun_g_role_id >=", value, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdLessThan(String value) {
            addCriterion("fun_g_role_id <", value, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdLessThanOrEqualTo(String value) {
            addCriterion("fun_g_role_id <=", value, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdLike(String value) {
            addCriterion("fun_g_role_id like", value, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdNotLike(String value) {
            addCriterion("fun_g_role_id not like", value, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdIn(List<String> values) {
            addCriterion("fun_g_role_id in", values, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdNotIn(List<String> values) {
            addCriterion("fun_g_role_id not in", values, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdBetween(String value1, String value2) {
            addCriterion("fun_g_role_id between", value1, value2, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunGRoleIdNotBetween(String value1, String value2) {
            addCriterion("fun_g_role_id not between", value1, value2, "funGRoleId");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionIsNull() {
            addCriterion("fun_description is null");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionIsNotNull() {
            addCriterion("fun_description is not null");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionEqualTo(String value) {
            addCriterion("fun_description =", value, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionNotEqualTo(String value) {
            addCriterion("fun_description <>", value, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionGreaterThan(String value) {
            addCriterion("fun_description >", value, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("fun_description >=", value, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionLessThan(String value) {
            addCriterion("fun_description <", value, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionLessThanOrEqualTo(String value) {
            addCriterion("fun_description <=", value, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionLike(String value) {
            addCriterion("fun_description like", value, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionNotLike(String value) {
            addCriterion("fun_description not like", value, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionIn(List<String> values) {
            addCriterion("fun_description in", values, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionNotIn(List<String> values) {
            addCriterion("fun_description not in", values, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionBetween(String value1, String value2) {
            addCriterion("fun_description between", value1, value2, "funDescription");
            return (Criteria) this;
        }

        public Criteria andFunDescriptionNotBetween(String value1, String value2) {
            addCriterion("fun_description not between", value1, value2, "funDescription");
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