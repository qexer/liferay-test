/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package card.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Drink. This utility wraps
 * <code>card.service.impl.DrinkLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DrinkLocalService
 * @generated
 */
@ProviderType
public class DrinkLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>card.service.impl.DrinkLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the drink to the database. Also notifies the appropriate model listeners.
	 *
	 * @param drink the drink
	 * @return the drink that was added
	 */
	public static card.model.Drink addDrink(card.model.Drink drink) {
		return getService().addDrink(drink);
	}

	public static card.model.Drink addDrink(
			String name, Integer price, String description)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addDrink(name, price, description);
	}

	/**
	 * Creates a new drink with the primary key. Does not add the drink to the database.
	 *
	 * @param drinkId the primary key for the new drink
	 * @return the new drink
	 */
	public static card.model.Drink createDrink(long drinkId) {
		return getService().createDrink(drinkId);
	}

	/**
	 * Deletes the drink from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drink the drink
	 * @return the drink that was removed
	 */
	public static card.model.Drink deleteDrink(card.model.Drink drink) {
		return getService().deleteDrink(drink);
	}

	/**
	 * Deletes the drink with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drinkId the primary key of the drink
	 * @return the drink that was removed
	 * @throws PortalException if a drink with the primary key could not be found
	 */
	public static card.model.Drink deleteDrink(long drinkId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteDrink(drinkId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>card.model.impl.DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>card.model.impl.DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static card.model.Drink fetchDrink(long drinkId) {
		return getService().fetchDrink(drinkId);
	}

	/**
	 * Returns the drink matching the UUID and group.
	 *
	 * @param uuid the drink's UUID
	 * @param groupId the primary key of the group
	 * @return the matching drink, or <code>null</code> if a matching drink could not be found
	 */
	public static card.model.Drink fetchDrinkByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchDrinkByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the drink with the primary key.
	 *
	 * @param drinkId the primary key of the drink
	 * @return the drink
	 * @throws PortalException if a drink with the primary key could not be found
	 */
	public static card.model.Drink getDrink(long drinkId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getDrink(drinkId);
	}

	/**
	 * Returns the drink matching the UUID and group.
	 *
	 * @param uuid the drink's UUID
	 * @param groupId the primary key of the group
	 * @return the matching drink
	 * @throws PortalException if a matching drink could not be found
	 */
	public static card.model.Drink getDrinkByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getDrinkByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the drinks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>card.model.impl.DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @return the range of drinks
	 */
	public static java.util.List<card.model.Drink> getDrinks(
		int start, int end) {

		return getService().getDrinks(start, end);
	}

	/**
	 * Returns all the drinks matching the UUID and company.
	 *
	 * @param uuid the UUID of the drinks
	 * @param companyId the primary key of the company
	 * @return the matching drinks, or an empty list if no matches were found
	 */
	public static java.util.List<card.model.Drink> getDrinksByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getDrinksByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of drinks matching the UUID and company.
	 *
	 * @param uuid the UUID of the drinks
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching drinks, or an empty list if no matches were found
	 */
	public static java.util.List<card.model.Drink> getDrinksByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<card.model.Drink>
			orderByComparator) {

		return getService().getDrinksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of drinks.
	 *
	 * @return the number of drinks
	 */
	public static int getDrinksCount() {
		return getService().getDrinksCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the drink in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param drink the drink
	 * @return the drink that was updated
	 */
	public static card.model.Drink updateDrink(card.model.Drink drink) {
		return getService().updateDrink(drink);
	}

	public static card.model.Drink updateDrink(
			long drinkId, String name, Integer price, String description)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateDrink(drinkId, name, price, description);
	}

	public static DrinkLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DrinkLocalService, DrinkLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DrinkLocalService.class);

		ServiceTracker<DrinkLocalService, DrinkLocalService> serviceTracker =
			new ServiceTracker<DrinkLocalService, DrinkLocalService>(
				bundle.getBundleContext(), DrinkLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}