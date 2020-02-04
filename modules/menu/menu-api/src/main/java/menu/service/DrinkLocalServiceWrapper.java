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

package menu.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DrinkLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DrinkLocalService
 * @generated
 */
@ProviderType
public class DrinkLocalServiceWrapper
	implements DrinkLocalService, ServiceWrapper<DrinkLocalService> {

	public DrinkLocalServiceWrapper(DrinkLocalService drinkLocalService) {
		_drinkLocalService = drinkLocalService;
	}

	/**
	 * Adds the drink to the database. Also notifies the appropriate model listeners.
	 *
	 * @param drink the drink
	 * @return the drink that was added
	 */
	@Override
	public menu.model.Drink addDrink(menu.model.Drink drink) {
		return _drinkLocalService.addDrink(drink);
	}

	/**
	 * Creates a new drink with the primary key. Does not add the drink to the database.
	 *
	 * @param drinkId the primary key for the new drink
	 * @return the new drink
	 */
	@Override
	public menu.model.Drink createDrink(long drinkId) {
		return _drinkLocalService.createDrink(drinkId);
	}

	/**
	 * Deletes the drink from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drink the drink
	 * @return the drink that was removed
	 */
	@Override
	public menu.model.Drink deleteDrink(menu.model.Drink drink) {
		return _drinkLocalService.deleteDrink(drink);
	}

	/**
	 * Deletes the drink with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drinkId the primary key of the drink
	 * @return the drink that was removed
	 * @throws PortalException if a drink with the primary key could not be found
	 */
	@Override
	public menu.model.Drink deleteDrink(long drinkId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _drinkLocalService.deleteDrink(drinkId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _drinkLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _drinkLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _drinkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>menu.model.impl.DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _drinkLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>menu.model.impl.DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _drinkLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _drinkLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _drinkLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public menu.model.Drink fetchDrink(long drinkId) {
		return _drinkLocalService.fetchDrink(drinkId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _drinkLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the drink with the primary key.
	 *
	 * @param drinkId the primary key of the drink
	 * @return the drink
	 * @throws PortalException if a drink with the primary key could not be found
	 */
	@Override
	public menu.model.Drink getDrink(long drinkId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _drinkLocalService.getDrink(drinkId);
	}

	/**
	 * Returns a range of all the drinks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>menu.model.impl.DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @return the range of drinks
	 */
	@Override
	public java.util.List<menu.model.Drink> getDrinks(int start, int end) {
		return _drinkLocalService.getDrinks(start, end);
	}

	/**
	 * Returns the number of drinks.
	 *
	 * @return the number of drinks
	 */
	@Override
	public int getDrinksCount() {
		return _drinkLocalService.getDrinksCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _drinkLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _drinkLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _drinkLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the drink in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param drink the drink
	 * @return the drink that was updated
	 */
	@Override
	public menu.model.Drink updateDrink(menu.model.Drink drink) {
		return _drinkLocalService.updateDrink(drink);
	}

	@Override
	public DrinkLocalService getWrappedService() {
		return _drinkLocalService;
	}

	@Override
	public void setWrappedService(DrinkLocalService drinkLocalService) {
		_drinkLocalService = drinkLocalService;
	}

	private DrinkLocalService _drinkLocalService;

}