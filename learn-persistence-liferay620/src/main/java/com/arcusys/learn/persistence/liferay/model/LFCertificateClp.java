package com.arcusys.learn.persistence.liferay.model;

import com.arcusys.learn.persistence.liferay.service.ClpSerializer;
import com.arcusys.learn.persistence.liferay.service.LFCertificateLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class LFCertificateClp extends BaseModelImpl<LFCertificate>
    implements LFCertificate {
    private long _id;
    private String _title;
    private String _description;
    private String _logo;
    private Boolean _isPermanent;
    private Boolean _publishBadge;
    private String _shortDescription;
    private Integer _companyID;
    private String _state;
    private String _emails;
    private String _validPeriodType;
    private Integer _validPeriod;
    private Date _createdDate;
    private Boolean _isPublished;
    private Long _scope;
    private BaseModel<?> _lfCertificateRemoteModel;

    public LFCertificateClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return LFCertificate.class;
    }

    @Override
    public String getModelClassName() {
        return LFCertificate.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("title", getTitle());
        attributes.put("description", getDescription());
        attributes.put("logo", getLogo());
        attributes.put("isPermanent", getIsPermanent());
        attributes.put("publishBadge", getPublishBadge());
        attributes.put("shortDescription", getShortDescription());
        attributes.put("companyID", getCompanyID());
        attributes.put("state", getState());
        attributes.put("emails", getEmails());
        attributes.put("validPeriodType", getValidPeriodType());
        attributes.put("validPeriod", getValidPeriod());
        attributes.put("createdDate", getCreatedDate());
        attributes.put("isPublished", getIsPublished());
        attributes.put("scope", getScope());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String logo = (String) attributes.get("logo");

        if (logo != null) {
            setLogo(logo);
        }

        Boolean isPermanent = (Boolean) attributes.get("isPermanent");

        if (isPermanent != null) {
            setIsPermanent(isPermanent);
        }

        Boolean publishBadge = (Boolean) attributes.get("publishBadge");

        if (publishBadge != null) {
            setPublishBadge(publishBadge);
        }

        String shortDescription = (String) attributes.get("shortDescription");

        if (shortDescription != null) {
            setShortDescription(shortDescription);
        }

        Integer companyID = (Integer) attributes.get("companyID");

        if (companyID != null) {
            setCompanyID(companyID);
        }

        String state = (String) attributes.get("state");

        if (state != null) {
            setState(state);
        }

        String emails = (String) attributes.get("emails");

        if (emails != null) {
            setEmails(emails);
        }

        String validPeriodType = (String) attributes.get("validPeriodType");

        if (validPeriodType != null) {
            setValidPeriodType(validPeriodType);
        }

        Integer validPeriod = (Integer) attributes.get("validPeriod");

        if (validPeriod != null) {
            setValidPeriod(validPeriod);
        }

        Date createdDate = (Date) attributes.get("createdDate");

        if (createdDate != null) {
            setCreatedDate(createdDate);
        }

        Boolean isPublished = (Boolean) attributes.get("isPublished");

        if (isPublished != null) {
            setIsPublished(isPublished);
        }

        Long scope = (Long) attributes.get("scope");

        if (scope != null) {
            setScope(scope);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_lfCertificateRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_lfCertificateRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_lfCertificateRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLogo() {
        return _logo;
    }

    @Override
    public void setLogo(String logo) {
        _logo = logo;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setLogo", String.class);

                method.invoke(_lfCertificateRemoteModel, logo);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Boolean getIsPermanent() {
        return _isPermanent;
    }

    @Override
    public void setIsPermanent(Boolean isPermanent) {
        _isPermanent = isPermanent;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setIsPermanent", Boolean.class);

                method.invoke(_lfCertificateRemoteModel, isPermanent);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Boolean getPublishBadge() {
        return _publishBadge;
    }

    @Override
    public void setPublishBadge(Boolean publishBadge) {
        _publishBadge = publishBadge;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setPublishBadge", Boolean.class);

                method.invoke(_lfCertificateRemoteModel, publishBadge);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getShortDescription() {
        return _shortDescription;
    }

    @Override
    public void setShortDescription(String shortDescription) {
        _shortDescription = shortDescription;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setShortDescription",
                        String.class);

                method.invoke(_lfCertificateRemoteModel, shortDescription);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Integer getCompanyID() {
        return _companyID;
    }

    @Override
    public void setCompanyID(Integer companyID) {
        _companyID = companyID;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyID", Integer.class);

                method.invoke(_lfCertificateRemoteModel, companyID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getState() {
        return _state;
    }

    @Override
    public void setState(String state) {
        _state = state;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setState", String.class);

                method.invoke(_lfCertificateRemoteModel, state);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmails() {
        return _emails;
    }

    @Override
    public void setEmails(String emails) {
        _emails = emails;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setEmails", String.class);

                method.invoke(_lfCertificateRemoteModel, emails);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getValidPeriodType() {
        return _validPeriodType;
    }

    @Override
    public void setValidPeriodType(String validPeriodType) {
        _validPeriodType = validPeriodType;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setValidPeriodType",
                        String.class);

                method.invoke(_lfCertificateRemoteModel, validPeriodType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Integer getValidPeriod() {
        return _validPeriod;
    }

    @Override
    public void setValidPeriod(Integer validPeriod) {
        _validPeriod = validPeriod;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setValidPeriod", Integer.class);

                method.invoke(_lfCertificateRemoteModel, validPeriod);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreatedDate() {
        return _createdDate;
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        _createdDate = createdDate;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedDate", Date.class);

                method.invoke(_lfCertificateRemoteModel, createdDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Boolean getIsPublished() {
        return _isPublished;
    }

    @Override
    public void setIsPublished(Boolean isPublished) {
        _isPublished = isPublished;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setIsPublished", Boolean.class);

                method.invoke(_lfCertificateRemoteModel, isPublished);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getScope() {
        return _scope;
    }

    @Override
    public void setScope(Long scope) {
        _scope = scope;

        if (_lfCertificateRemoteModel != null) {
            try {
                Class<?> clazz = _lfCertificateRemoteModel.getClass();

                Method method = clazz.getMethod("setScope", Long.class);

                method.invoke(_lfCertificateRemoteModel, scope);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLFCertificateRemoteModel() {
        return _lfCertificateRemoteModel;
    }

    public void setLFCertificateRemoteModel(
        BaseModel<?> lfCertificateRemoteModel) {
        _lfCertificateRemoteModel = lfCertificateRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _lfCertificateRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_lfCertificateRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFCertificateLocalServiceUtil.addLFCertificate(this);
        } else {
            LFCertificateLocalServiceUtil.updateLFCertificate(this);
        }
    }

    @Override
    public LFCertificate toEscapedModel() {
        return (LFCertificate) ProxyUtil.newProxyInstance(LFCertificate.class.getClassLoader(),
            new Class[] { LFCertificate.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LFCertificateClp clone = new LFCertificateClp();

        clone.setId(getId());
        clone.setTitle(getTitle());
        clone.setDescription(getDescription());
        clone.setLogo(getLogo());
        clone.setIsPermanent(getIsPermanent());
        clone.setPublishBadge(getPublishBadge());
        clone.setShortDescription(getShortDescription());
        clone.setCompanyID(getCompanyID());
        clone.setState(getState());
        clone.setEmails(getEmails());
        clone.setValidPeriodType(getValidPeriodType());
        clone.setValidPeriod(getValidPeriod());
        clone.setCreatedDate(getCreatedDate());
        clone.setIsPublished(getIsPublished());
        clone.setScope(getScope());

        return clone;
    }

    @Override
    public int compareTo(LFCertificate lfCertificate) {
        long primaryKey = lfCertificate.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LFCertificateClp)) {
            return false;
        }

        LFCertificateClp lfCertificate = (LFCertificateClp) obj;

        long primaryKey = lfCertificate.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", logo=");
        sb.append(getLogo());
        sb.append(", isPermanent=");
        sb.append(getIsPermanent());
        sb.append(", publishBadge=");
        sb.append(getPublishBadge());
        sb.append(", shortDescription=");
        sb.append(getShortDescription());
        sb.append(", companyID=");
        sb.append(getCompanyID());
        sb.append(", state=");
        sb.append(getState());
        sb.append(", emails=");
        sb.append(getEmails());
        sb.append(", validPeriodType=");
        sb.append(getValidPeriodType());
        sb.append(", validPeriod=");
        sb.append(getValidPeriod());
        sb.append(", createdDate=");
        sb.append(getCreatedDate());
        sb.append(", isPublished=");
        sb.append(getIsPublished());
        sb.append(", scope=");
        sb.append(getScope());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFCertificate");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>logo</column-name><column-value><![CDATA[");
        sb.append(getLogo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isPermanent</column-name><column-value><![CDATA[");
        sb.append(getIsPermanent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>publishBadge</column-name><column-value><![CDATA[");
        sb.append(getPublishBadge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>shortDescription</column-name><column-value><![CDATA[");
        sb.append(getShortDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyID</column-name><column-value><![CDATA[");
        sb.append(getCompanyID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>state</column-name><column-value><![CDATA[");
        sb.append(getState());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>emails</column-name><column-value><![CDATA[");
        sb.append(getEmails());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>validPeriodType</column-name><column-value><![CDATA[");
        sb.append(getValidPeriodType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>validPeriod</column-name><column-value><![CDATA[");
        sb.append(getValidPeriod());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createdDate</column-name><column-value><![CDATA[");
        sb.append(getCreatedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isPublished</column-name><column-value><![CDATA[");
        sb.append(getIsPublished());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>scope</column-name><column-value><![CDATA[");
        sb.append(getScope());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
