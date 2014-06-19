package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for LFCertificateTincanStatement. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see LFCertificateTincanStatementLocalServiceUtil
 * @see com.arcusys.learn.persistence.liferay.service.base.LFCertificateTincanStatementLocalServiceBaseImpl
 * @see com.arcusys.learn.persistence.liferay.service.impl.LFCertificateTincanStatementLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface LFCertificateTincanStatementLocalService
    extends BaseLocalService, InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LFCertificateTincanStatementLocalServiceUtil} to access the l f certificate tincan statement local service. Add custom service methods to {@link com.arcusys.learn.persistence.liferay.service.impl.LFCertificateTincanStatementLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the l f certificate tincan statement to the database. Also notifies the appropriate model listeners.
    *
    * @param lfCertificateTincanStatement the l f certificate tincan statement
    * @return the l f certificate tincan statement that was added
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement addLFCertificateTincanStatement(
        com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement lfCertificateTincanStatement)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new l f certificate tincan statement with the primary key. Does not add the l f certificate tincan statement to the database.
    *
    * @param lfCertificateTincanStatementPK the primary key for the new l f certificate tincan statement
    * @return the new l f certificate tincan statement
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement createLFCertificateTincanStatement(
        com.arcusys.learn.persistence.liferay.service.persistence.LFCertificateTincanStatementPK lfCertificateTincanStatementPK);

    /**
    * Deletes the l f certificate tincan statement with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param lfCertificateTincanStatementPK the primary key of the l f certificate tincan statement
    * @return the l f certificate tincan statement that was removed
    * @throws PortalException if a l f certificate tincan statement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement deleteLFCertificateTincanStatement(
        com.arcusys.learn.persistence.liferay.service.persistence.LFCertificateTincanStatementPK lfCertificateTincanStatementPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the l f certificate tincan statement from the database. Also notifies the appropriate model listeners.
    *
    * @param lfCertificateTincanStatement the l f certificate tincan statement
    * @return the l f certificate tincan statement that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement deleteLFCertificateTincanStatement(
        com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement lfCertificateTincanStatement)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateTincanStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateTincanStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement fetchLFCertificateTincanStatement(
        com.arcusys.learn.persistence.liferay.service.persistence.LFCertificateTincanStatementPK lfCertificateTincanStatementPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f certificate tincan statement with the primary key.
    *
    * @param lfCertificateTincanStatementPK the primary key of the l f certificate tincan statement
    * @return the l f certificate tincan statement
    * @throws PortalException if a l f certificate tincan statement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement getLFCertificateTincanStatement(
        com.arcusys.learn.persistence.liferay.service.persistence.LFCertificateTincanStatementPK lfCertificateTincanStatementPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f certificate tincan statements.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateTincanStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f certificate tincan statements
    * @param end the upper bound of the range of l f certificate tincan statements (not inclusive)
    * @return the range of l f certificate tincan statements
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement> getLFCertificateTincanStatements(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f certificate tincan statements.
    *
    * @return the number of l f certificate tincan statements
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getLFCertificateTincanStatementsCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the l f certificate tincan statement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfCertificateTincanStatement the l f certificate tincan statement
    * @return the l f certificate tincan statement that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement updateLFCertificateTincanStatement(
        com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement lfCertificateTincanStatement)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement> findByCertificateID(
        java.lang.Long certificateID)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement> findByVerb(
        java.lang.String verb)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement> findByStatementObject(
        java.lang.String obj)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement> findByVerbAndObject(
        java.lang.String verb, java.lang.String obj)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateTincanStatementException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.arcusys.learn.persistence.liferay.model.LFCertificateTincanStatement findByCertificateIDAndVerbAndObject(
        java.lang.Long certificateID, java.lang.String verb,
        java.lang.String obj)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateTincanStatementException,
            com.liferay.portal.kernel.exception.SystemException;

    public void removeByUserIDAndCertificateID(java.lang.Long certificateID,
        java.lang.String verb, java.lang.String obj)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateTincanStatementException,
            com.liferay.portal.kernel.exception.SystemException;

    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
