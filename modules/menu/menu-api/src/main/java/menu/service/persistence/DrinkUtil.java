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

package menu.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import menu.model.Drink;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the drink service. This utility wraps <code>menu.service.persistence.impl.DrinkPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DrinkPersistence
 * @generated
 */
@ProviderType
public class DrinkUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Drink drink) {
		getPersistence().clearCache(drink);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Drink> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Drink> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Drink> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Drink> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Drink> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Drink update(Drink drink) {
		return getPersistence().update(drink);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Drink update(Drink drink, ServiceContext serviceContext) {
		return getPersistence().update(drink, serviceContext);
	}

	/**
	 * Returns all the drinks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching drinks
	 */
	public static List<Drink> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the drinks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @return the range of matching drinks
	 */
	public static List<Drink> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the drinks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching drinks
	 */
	@Deprecated
	public static List<Drink> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Drink> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the drinks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching drinks
	 */
	public static List<Drink> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Drink> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns the first drink in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching drink
	 * @throws NoSuchDrinkException if a matching drink could not be found
	 */
	public static Drink findByUuid_First(
			String uuid, OrderByComparator<Drink> orderByComparator)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first drink in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching drink, or <code>null</code> if a matching drink could not be found
	 */
	public static Drink fetchByUuid_First(
		String uuid, OrderByComparator<Drink> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last drink in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching drink
	 * @throws NoSuchDrinkException if a matching drink could not be found
	 */
	public static Drink findByUuid_Last(
			String uuid, OrderByComparator<Drink> orderByComparator)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last drink in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching drink, or <code>null</code> if a matching drink could not be found
	 */
	public static Drink fetchByUuid_Last(
		String uuid, OrderByComparator<Drink> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the drinks before and after the current drink in the ordered set where uuid = &#63;.
	 *
	 * @param drinkId the primary key of the current drink
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next drink
	 * @throws NoSuchDrinkException if a drink with the primary key could not be found
	 */
	public static Drink[] findByUuid_PrevAndNext(
			long drinkId, String uuid,
			OrderByComparator<Drink> orderByComparator)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().findByUuid_PrevAndNext(
			drinkId, uuid, orderByComparator);
	}

	/**
	 * Removes all the drinks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of drinks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching drinks
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the drinks where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching drinks
	 */
	public static List<Drink> findByName(String name) {
		return getPersistence().findByName(name);
	}

	/**
	 * Returns a range of all the drinks where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @return the range of matching drinks
	 */
	public static List<Drink> findByName(String name, int start, int end) {
		return getPersistence().findByName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the drinks where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByName(String, int, int, OrderByComparator)}
	 * @param name the name
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching drinks
	 */
	@Deprecated
	public static List<Drink> findByName(
		String name, int start, int end,
		OrderByComparator<Drink> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the drinks where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching drinks
	 */
	public static List<Drink> findByName(
		String name, int start, int end,
		OrderByComparator<Drink> orderByComparator) {

		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	 * Returns the first drink in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching drink
	 * @throws NoSuchDrinkException if a matching drink could not be found
	 */
	public static Drink findByName_First(
			String name, OrderByComparator<Drink> orderByComparator)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	 * Returns the first drink in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching drink, or <code>null</code> if a matching drink could not be found
	 */
	public static Drink fetchByName_First(
		String name, OrderByComparator<Drink> orderByComparator) {

		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	 * Returns the last drink in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching drink
	 * @throws NoSuchDrinkException if a matching drink could not be found
	 */
	public static Drink findByName_Last(
			String name, OrderByComparator<Drink> orderByComparator)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last drink in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching drink, or <code>null</code> if a matching drink could not be found
	 */
	public static Drink fetchByName_Last(
		String name, OrderByComparator<Drink> orderByComparator) {

		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the drinks before and after the current drink in the ordered set where name = &#63;.
	 *
	 * @param drinkId the primary key of the current drink
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next drink
	 * @throws NoSuchDrinkException if a drink with the primary key could not be found
	 */
	public static Drink[] findByName_PrevAndNext(
			long drinkId, String name,
			OrderByComparator<Drink> orderByComparator)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().findByName_PrevAndNext(
			drinkId, name, orderByComparator);
	}

	/**
	 * Removes all the drinks where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByName(String name) {
		getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of drinks where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching drinks
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Returns all the drinks where price &lt; &#63;.
	 *
	 * @param price the price
	 * @return the matching drinks
	 */
	public static List<Drink> findByCheaperThan(int price) {
		return getPersistence().findByCheaperThan(price);
	}

	/**
	 * Returns a range of all the drinks where price &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param price the price
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @return the range of matching drinks
	 */
	public static List<Drink> findByCheaperThan(int price, int start, int end) {
		return getPersistence().findByCheaperThan(price, start, end);
	}

	/**
	 * Returns an ordered range of all the drinks where price &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByCheaperThan(int, int, int, OrderByComparator)}
	 * @param price the price
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching drinks
	 */
	@Deprecated
	public static List<Drink> findByCheaperThan(
		int price, int start, int end,
		OrderByComparator<Drink> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCheaperThan(
			price, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the drinks where price &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param price the price
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching drinks
	 */
	public static List<Drink> findByCheaperThan(
		int price, int start, int end,
		OrderByComparator<Drink> orderByComparator) {

		return getPersistence().findByCheaperThan(
			price, start, end, orderByComparator);
	}

	/**
	 * Returns the first drink in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching drink
	 * @throws NoSuchDrinkException if a matching drink could not be found
	 */
	public static Drink findByCheaperThan_First(
			int price, OrderByComparator<Drink> orderByComparator)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().findByCheaperThan_First(
			price, orderByComparator);
	}

	/**
	 * Returns the first drink in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching drink, or <code>null</code> if a matching drink could not be found
	 */
	public static Drink fetchByCheaperThan_First(
		int price, OrderByComparator<Drink> orderByComparator) {

		return getPersistence().fetchByCheaperThan_First(
			price, orderByComparator);
	}

	/**
	 * Returns the last drink in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching drink
	 * @throws NoSuchDrinkException if a matching drink could not be found
	 */
	public static Drink findByCheaperThan_Last(
			int price, OrderByComparator<Drink> orderByComparator)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().findByCheaperThan_Last(
			price, orderByComparator);
	}

	/**
	 * Returns the last drink in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching drink, or <code>null</code> if a matching drink could not be found
	 */
	public static Drink fetchByCheaperThan_Last(
		int price, OrderByComparator<Drink> orderByComparator) {

		return getPersistence().fetchByCheaperThan_Last(
			price, orderByComparator);
	}

	/**
	 * Returns the drinks before and after the current drink in the ordered set where price &lt; &#63;.
	 *
	 * @param drinkId the primary key of the current drink
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next drink
	 * @throws NoSuchDrinkException if a drink with the primary key could not be found
	 */
	public static Drink[] findByCheaperThan_PrevAndNext(
			long drinkId, int price, OrderByComparator<Drink> orderByComparator)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().findByCheaperThan_PrevAndNext(
			drinkId, price, orderByComparator);
	}

	/**
	 * Removes all the drinks where price &lt; &#63; from the database.
	 *
	 * @param price the price
	 */
	public static void removeByCheaperThan(int price) {
		getPersistence().removeByCheaperThan(price);
	}

	/**
	 * Returns the number of drinks where price &lt; &#63;.
	 *
	 * @param price the price
	 * @return the number of matching drinks
	 */
	public static int countByCheaperThan(int price) {
		return getPersistence().countByCheaperThan(price);
	}

	/**
	 * Caches the drink in the entity cache if it is enabled.
	 *
	 * @param drink the drink
	 */
	public static void cacheResult(Drink drink) {
		getPersistence().cacheResult(drink);
	}

	/**
	 * Caches the drinks in the entity cache if it is enabled.
	 *
	 * @param drinks the drinks
	 */
	public static void cacheResult(List<Drink> drinks) {
		getPersistence().cacheResult(drinks);
	}

	/**
	 * Creates a new drink with the primary key. Does not add the drink to the database.
	 *
	 * @param drinkId the primary key for the new drink
	 * @return the new drink
	 */
	public static Drink create(long drinkId) {
		return getPersistence().create(drinkId);
	}

	/**
	 * Removes the drink with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drinkId the primary key of the drink
	 * @return the drink that was removed
	 * @throws NoSuchDrinkException if a drink with the primary key could not be found
	 */
	public static Drink remove(long drinkId)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().remove(drinkId);
	}

	public static Drink updateImpl(Drink drink) {
		return getPersistence().updateImpl(drink);
	}

	/**
	 * Returns the drink with the primary key or throws a <code>NoSuchDrinkException</code> if it could not be found.
	 *
	 * @param drinkId the primary key of the drink
	 * @return the drink
	 * @throws NoSuchDrinkException if a drink with the primary key could not be found
	 */
	public static Drink findByPrimaryKey(long drinkId)
		throws menu.exception.NoSuchDrinkException {

		return getPersistence().findByPrimaryKey(drinkId);
	}

	/**
	 * Returns the drink with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param drinkId the primary key of the drink
	 * @return the drink, or <code>null</code> if a drink with the primary key could not be found
	 */
	public static Drink fetchByPrimaryKey(long drinkId) {
		return getPersistence().fetchByPrimaryKey(drinkId);
	}

	/**
	 * Returns all the drinks.
	 *
	 * @return the drinks
	 */
	public static List<Drink> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the drinks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @return the range of drinks
	 */
	public static List<Drink> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the drinks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of drinks
	 */
	@Deprecated
	public static List<Drink> findAll(
		int start, int end, OrderByComparator<Drink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the drinks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>DrinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of drinks
	 * @param end the upper bound of the range of drinks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of drinks
	 */
	public static List<Drink> findAll(
		int start, int end, OrderByComparator<Drink> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the drinks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of drinks.
	 *
	 * @return the number of drinks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static DrinkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DrinkPersistence, DrinkPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DrinkPersistence.class);

		ServiceTracker<DrinkPersistence, DrinkPersistence> serviceTracker =
			new ServiceTracker<DrinkPersistence, DrinkPersistence>(
				bundle.getBundleContext(), DrinkPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}