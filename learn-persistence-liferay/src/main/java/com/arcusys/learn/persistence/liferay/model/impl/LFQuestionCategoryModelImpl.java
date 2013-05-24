package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFQuestionCategory;
import com.arcusys.learn.persistence.liferay.model.LFQuestionCategoryModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
* The base model implementation for the LFQuestionCategory service. Represents a row in the &quot;Learn_LFQuestionCategory&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFQuestionCategoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFQuestionCategoryImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFQuestionCategoryImpl
* @see com.arcusys.learn.persistence.liferay.model.LFQuestionCategory
* @see com.arcusys.learn.persistence.liferay.model.LFQuestionCategoryModel
* @generated
*/
public class LFQuestionCategoryModelImpl extends BaseModelImpl<LFQuestionCategory>
    implements LFQuestionCategoryModel {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this class directly. All methods that expect a l f question category model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFQuestionCategory} interface instead.
    */
    public static final String TABLE_NAME = "Learn_LFQuestionCategory";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "title", Types.CLOB },
            { "description", Types.CLOB },
            { "parentId", Types.INTEGER },
            { "courseId", Types.INTEGER },
            { "arrangementIndex", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFQuestionCategory (id_ LONG not null primary key,title TEXT null,description TEXT null,parentId INTEGER null,courseId INTEGER null,arrangementIndex INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFQuestionCategory";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFQuestionCategory"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFQuestionCategory"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFQuestionCategory"),
            true);
    public static long COURSEID_COLUMN_BITMASK = 1L;
    public static long PARENTID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFQuestionCategory"));
    private static ClassLoader _classLoader = LFQuestionCategory.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            LFQuestionCategory.class
        };
    private long _id;
    private String _title;
    private String _description;
    private Integer _parentId;
    private Integer _originalParentId;
    private boolean _setOriginalParentId;
    private Integer _courseId;
    private Integer _originalCourseId;
    private boolean _setOriginalCourseId;
    private Integer _arrangementIndex;
    private long _columnBitmask;
    private LFQuestionCategory _escapedModelProxy;

    public LFQuestionCategoryModelImpl() {
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return LFQuestionCategory.class;
    }

    public String getModelClassName() {
        return LFQuestionCategory.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("title", getTitle());
        attributes.put("description", getDescription());
        attributes.put("parentId", getParentId());
        attributes.put("courseId", getCourseId());
        attributes.put("arrangementIndex", getArrangementIndex());

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

        Integer parentId = (Integer) attributes.get("parentId");

        if (parentId != null) {
            setParentId(parentId);
        }

        Integer courseId = (Integer) attributes.get("courseId");

        if (courseId != null) {
            setCourseId(courseId);
        }

        Integer arrangementIndex = (Integer) attributes.get("arrangementIndex");

        if (arrangementIndex != null) {
            setArrangementIndex(arrangementIndex);
        }
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getTitle() {
        if (_title == null) {
            return StringPool.BLANK;
        } else {
            return _title;
        }
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    public void setDescription(String description) {
        _description = description;
    }

    public Integer getParentId() {
        return _parentId;
    }

    public void setParentId(Integer parentId) {
        _columnBitmask |= PARENTID_COLUMN_BITMASK;

        if (!_setOriginalParentId) {
            _setOriginalParentId = true;

            _originalParentId = _parentId;
        }

        _parentId = parentId;
    }

    public Integer getOriginalParentId() {
        return _originalParentId;
    }

    public Integer getCourseId() {
        return _courseId;
    }

    public void setCourseId(Integer courseId) {
        _columnBitmask |= COURSEID_COLUMN_BITMASK;

        if (!_setOriginalCourseId) {
            _setOriginalCourseId = true;

            _originalCourseId = _courseId;
        }

        _courseId = courseId;
    }

    public Integer getOriginalCourseId() {
        return _originalCourseId;
    }

    public Integer getArrangementIndex() {
        return _arrangementIndex;
    }

    public void setArrangementIndex(Integer arrangementIndex) {
        _arrangementIndex = arrangementIndex;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFQuestionCategory.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFQuestionCategory toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (LFQuestionCategory) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        LFQuestionCategoryImpl lfQuestionCategoryImpl = new LFQuestionCategoryImpl();

        lfQuestionCategoryImpl.setId(getId());
        lfQuestionCategoryImpl.setTitle(getTitle());
        lfQuestionCategoryImpl.setDescription(getDescription());
        lfQuestionCategoryImpl.setParentId(getParentId());
        lfQuestionCategoryImpl.setCourseId(getCourseId());
        lfQuestionCategoryImpl.setArrangementIndex(getArrangementIndex());

        lfQuestionCategoryImpl.resetOriginalValues();

        return lfQuestionCategoryImpl;
    }

    public int compareTo(LFQuestionCategory lfQuestionCategory) {
        long primaryKey = lfQuestionCategory.getPrimaryKey();

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
        if (obj == null) {
            return false;
        }

        LFQuestionCategory lfQuestionCategory = null;

        try {
            lfQuestionCategory = (LFQuestionCategory) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = lfQuestionCategory.getPrimaryKey();

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
    public void resetOriginalValues() {
        LFQuestionCategoryModelImpl lfQuestionCategoryModelImpl = this;

        lfQuestionCategoryModelImpl._originalParentId = lfQuestionCategoryModelImpl._parentId;

        lfQuestionCategoryModelImpl._setOriginalParentId = false;

        lfQuestionCategoryModelImpl._originalCourseId = lfQuestionCategoryModelImpl._courseId;

        lfQuestionCategoryModelImpl._setOriginalCourseId = false;

        lfQuestionCategoryModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFQuestionCategory> toCacheModel() {
        LFQuestionCategoryCacheModel lfQuestionCategoryCacheModel = new LFQuestionCategoryCacheModel();

        lfQuestionCategoryCacheModel.id = getId();

        lfQuestionCategoryCacheModel.title = getTitle();

        String title = lfQuestionCategoryCacheModel.title;

        if ((title != null) && (title.length() == 0)) {
            lfQuestionCategoryCacheModel.title = null;
        }

        lfQuestionCategoryCacheModel.description = getDescription();

        String description = lfQuestionCategoryCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            lfQuestionCategoryCacheModel.description = null;
        }

        lfQuestionCategoryCacheModel.parentId = getParentId();

        lfQuestionCategoryCacheModel.courseId = getCourseId();

        lfQuestionCategoryCacheModel.arrangementIndex = getArrangementIndex();

        return lfQuestionCategoryCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", parentId=");
        sb.append(getParentId());
        sb.append(", courseId=");
        sb.append(getCourseId());
        sb.append(", arrangementIndex=");
        sb.append(getArrangementIndex());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append(
            "com.arcusys.learn.persistence.liferay.model.LFQuestionCategory");
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
            "<column><column-name>parentId</column-name><column-value><![CDATA[");
        sb.append(getParentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>courseId</column-name><column-value><![CDATA[");
        sb.append(getCourseId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>arrangementIndex</column-name><column-value><![CDATA[");
        sb.append(getArrangementIndex());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}