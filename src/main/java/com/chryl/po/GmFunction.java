package com.chryl.po;

import java.io.Serializable;
import java.util.Date;

public class GmFunction implements Serializable {
    private String funId;

    private String funName;

    private String funUrl;

    private String funCode;

    private Integer funStatus;

    private Date funCreateTime;

    private Date funUpdateTime;

    private String funGRoleId;

    private String funDescription;

    private static final long serialVersionUID = 1L;

    public String getFunId() {
        return funId;
    }

    public void setFunId(String funId) {
        this.funId = funId == null ? null : funId.trim();
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName == null ? null : funName.trim();
    }

    public String getFunUrl() {
        return funUrl;
    }

    public void setFunUrl(String funUrl) {
        this.funUrl = funUrl == null ? null : funUrl.trim();
    }

    public String getFunCode() {
        return funCode;
    }

    public void setFunCode(String funCode) {
        this.funCode = funCode == null ? null : funCode.trim();
    }

    public Integer getFunStatus() {
        return funStatus;
    }

    public void setFunStatus(Integer funStatus) {
        this.funStatus = funStatus;
    }

    public Date getFunCreateTime() {
        return funCreateTime;
    }

    public void setFunCreateTime(Date funCreateTime) {
        this.funCreateTime = funCreateTime;
    }

    public Date getFunUpdateTime() {
        return funUpdateTime;
    }

    public void setFunUpdateTime(Date funUpdateTime) {
        this.funUpdateTime = funUpdateTime;
    }

    public String getFunGRoleId() {
        return funGRoleId;
    }

    public void setFunGRoleId(String funGRoleId) {
        this.funGRoleId = funGRoleId == null ? null : funGRoleId.trim();
    }

    public String getFunDescription() {
        return funDescription;
    }

    public void setFunDescription(String funDescription) {
        this.funDescription = funDescription == null ? null : funDescription.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", funId=").append(funId);
        sb.append(", funName=").append(funName);
        sb.append(", funUrl=").append(funUrl);
        sb.append(", funCode=").append(funCode);
        sb.append(", funStatus=").append(funStatus);
        sb.append(", funCreateTime=").append(funCreateTime);
        sb.append(", funUpdateTime=").append(funUpdateTime);
        sb.append(", funGRoleId=").append(funGRoleId);
        sb.append(", funDescription=").append(funDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}