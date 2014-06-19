package com.arcusys.learn.persistence.liferay.service.base;

import com.arcusys.learn.persistence.liferay.service.LFTincanLrsDocumentLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LFTincanLrsDocumentLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName296;
    private String[] _methodParameterTypes296;
    private String _methodName297;
    private String[] _methodParameterTypes297;
    private String _methodName302;
    private String[] _methodParameterTypes302;
    private String _methodName303;
    private String[] _methodParameterTypes303;
    private String _methodName304;
    private String[] _methodParameterTypes304;
    private String _methodName305;
    private String[] _methodParameterTypes305;
    private String _methodName306;
    private String[] _methodParameterTypes306;

    public LFTincanLrsDocumentLocalServiceClpInvoker() {
        _methodName0 = "addLFTincanLrsDocument";

        _methodParameterTypes0 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFTincanLrsDocument"
            };

        _methodName1 = "createLFTincanLrsDocument";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteLFTincanLrsDocument";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteLFTincanLrsDocument";

        _methodParameterTypes3 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFTincanLrsDocument"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchLFTincanLrsDocument";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getLFTincanLrsDocument";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getLFTincanLrsDocuments";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getLFTincanLrsDocumentsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateLFTincanLrsDocument";

        _methodParameterTypes15 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFTincanLrsDocument"
            };

        _methodName296 = "getBeanIdentifier";

        _methodParameterTypes296 = new String[] {  };

        _methodName297 = "setBeanIdentifier";

        _methodParameterTypes297 = new String[] { "java.lang.String" };

        _methodName302 = "createLFTincanLrsDocument";

        _methodParameterTypes302 = new String[] {  };

        _methodName303 = "createLFTincanLrsDocument";

        _methodParameterTypes303 = new String[] {
                "java.lang.String", "java.util.Date", "java.lang.String",
                "java.lang.String"
            };

        _methodName304 = "deleteLFTincanLrsDocument";

        _methodParameterTypes304 = new String[] { "java.lang.String" };

        _methodName305 = "findByDocumentId";

        _methodParameterTypes305 = new String[] { "java.lang.String" };

        _methodName306 = "removeAll";

        _methodParameterTypes306 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.addLFTincanLrsDocument((com.arcusys.learn.persistence.liferay.model.LFTincanLrsDocument) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.createLFTincanLrsDocument(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.deleteLFTincanLrsDocument(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.deleteLFTincanLrsDocument((com.arcusys.learn.persistence.liferay.model.LFTincanLrsDocument) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.fetchLFTincanLrsDocument(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.getLFTincanLrsDocument(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.getLFTincanLrsDocuments(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.getLFTincanLrsDocumentsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.updateLFTincanLrsDocument((com.arcusys.learn.persistence.liferay.model.LFTincanLrsDocument) arguments[0]);
        }

        if (_methodName296.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes296, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName297.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes297, parameterTypes)) {
            LFTincanLrsDocumentLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName302.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes302, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.createLFTincanLrsDocument();
        }

        if (_methodName303.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes303, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.createLFTincanLrsDocument((java.lang.String) arguments[0],
                (java.util.Date) arguments[1], (java.lang.String) arguments[2],
                (java.lang.String) arguments[3]);
        }

        if (_methodName304.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes304, parameterTypes)) {
            LFTincanLrsDocumentLocalServiceUtil.deleteLFTincanLrsDocument((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName305.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes305, parameterTypes)) {
            return LFTincanLrsDocumentLocalServiceUtil.findByDocumentId((java.lang.String) arguments[0]);
        }

        if (_methodName306.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes306, parameterTypes)) {
            LFTincanLrsDocumentLocalServiceUtil.removeAll();

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
