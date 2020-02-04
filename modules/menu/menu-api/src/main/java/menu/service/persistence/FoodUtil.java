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

import menu.model.Food;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the food service. This utility wraps <code>menu.service.persistence.impl.FoodPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FoodPersistence
 * @generated
 */
@ProviderType
public class FoodUtil {

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
	public static void clearCache(Food food) {
		getPersistence().clearCache(food);
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
	public static Map<Serializable, Food> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Food> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Food> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Food> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Food> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Food update(Food food) {
		return getPersistence().update(food);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Food update(Food food, ServiceContext serviceContext) {
		return getPersistence().update(food, serviceContext);
	}

	/**
	 * Returns all the foods where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching foods
	 */
	public static List<Food> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the foods where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @return the range of matching foods
	 */
	public static List<Food> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the foods where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching foods
	 */
	@Deprecated
	public static List<Food> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Food> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the foods where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching foods
	 */
	public static List<Food> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Food> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns the first food in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public static Food findByUuid_First(
			String uuid, OrderByComparator<Food> orderByComparator)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first food in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food, or <code>null</code> if a matching food could not be found
	 */
	public static Food fetchByUuid_First(
		String uuid, OrderByComparator<Food> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last food in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public static Food findByUuid_Last(
			String uuid, OrderByComparator<Food> orderByComparator)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last food in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food, or <code>null</code> if a matching food could not be found
	 */
	public static Food fetchByUuid_Last(
		String uuid, OrderByComparator<Food> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the foods before and after the current food in the ordered set where uuid = &#63;.
	 *
	 * @param foodId the primary key of the current food
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next food
	 * @throws NoSuchFoodException if a food with the primary key could not be found
	 */
	public static Food[] findByUuid_PrevAndNext(
			long foodId, String uuid, OrderByComparator<Food> orderByComparator)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().findByUuid_PrevAndNext(
			foodId, uuid, orderByComparator);
	}

	/**
	 * Removes all the foods where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of foods where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching foods
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the foods where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching foods
	 */
	public static List<Food> findByName(String name) {
		return getPersistence().findByName(name);
	}

	/**
	 * Returns a range of all the foods where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @return the range of matching foods
	 */
	public static List<Food> findByName(String name, int start, int end) {
		return getPersistence().findByName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the foods where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByName(String, int, int, OrderByComparator)}
	 * @param name the name
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching foods
	 */
	@Deprecated
	public static List<Food> findByName(
		String name, int start, int end,
		OrderByComparator<Food> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the foods where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching foods
	 */
	public static List<Food> findByName(
		String name, int start, int end,
		OrderByComparator<Food> orderByComparator) {

		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	 * Returns the first food in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public static Food findByName_First(
			String name, OrderByComparator<Food> orderByComparator)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	 * Returns the first food in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food, or <code>null</code> if a matching food could not be found
	 */
	public static Food fetchByName_First(
		String name, OrderByComparator<Food> orderByComparator) {

		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	 * Returns the last food in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public static Food findByName_Last(
			String name, OrderByComparator<Food> orderByComparator)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last food in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food, or <code>null</code> if a matching food could not be found
	 */
	public static Food fetchByName_Last(
		String name, OrderByComparator<Food> orderByComparator) {

		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the foods before and after the current food in the ordered set where name = &#63;.
	 *
	 * @param foodId the primary key of the current food
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next food
	 * @throws NoSuchFoodException if a food with the primary key could not be found
	 */
	public static Food[] findByName_PrevAndNext(
			long foodId, String name, OrderByComparator<Food> orderByComparator)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().findByName_PrevAndNext(
			foodId, name, orderByComparator);
	}

	/**
	 * Removes all the foods where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByName(String name) {
		getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of foods where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching foods
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Returns all the foods where price &lt; &#63;.
	 *
	 * @param price the price
	 * @return the matching foods
	 */
	public static List<Food> findByCheaperThan(int price) {
		return getPersistence().findByCheaperThan(price);
	}

	/**
	 * Returns a range of all the foods where price &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param price the price
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @return the range of matching foods
	 */
	public static List<Food> findByCheaperThan(int price, int start, int end) {
		return getPersistence().findByCheaperThan(price, start, end);
	}

	/**
	 * Returns an ordered range of all the foods where price &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByCheaperThan(int, int, int, OrderByComparator)}
	 * @param price the price
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching foods
	 */
	@Deprecated
	public static List<Food> findByCheaperThan(
		int price, int start, int end,
		OrderByComparator<Food> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCheaperThan(
			price, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the foods where price &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param price the price
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching foods
	 */
	public static List<Food> findByCheaperThan(
		int price, int start, int end,
		OrderByComparator<Food> orderByComparator) {

		return getPersistence().findByCheaperThan(
			price, start, end, orderByComparator);
	}

	/**
	 * Returns the first food in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public static Food findByCheaperThan_First(
			int price, OrderByComparator<Food> orderByComparator)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().findByCheaperThan_First(
			price, orderByComparator);
	}

	/**
	 * Returns the first food in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food, or <code>null</code> if a matching food could not be found
	 */
	public static Food fetchByCheaperThan_First(
		int price, OrderByComparator<Food> orderByComparator) {

		return getPersistence().fetchByCheaperThan_First(
			price, orderByComparator);
	}

	/**
	 * Returns the last food in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public static Food findByCheaperThan_Last(
			int price, OrderByComparator<Food> orderByComparator)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().findByCheaperThan_Last(
			price, orderByComparator);
	}

	/**
	 * Returns the last food in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food, or <code>null</code> if a matching food could not be found
	 */
	public static Food fetchByCheaperThan_Last(
		int price, OrderByComparator<Food> orderByComparator) {

		return getPersistence().fetchByCheaperThan_Last(
			price, orderByComparator);
	}

	/**
	 * Returns the foods before and after the current food in the ordered set where price &lt; &#63;.
	 *
	 * @param foodId the primary key of the current food
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next food
	 * @throws NoSuchFoodException if a food with the primary key could not be found
	 */
	public static Food[] findByCheaperThan_PrevAndNext(
			long foodId, int price, OrderByComparator<Food> orderByComparator)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().findByCheaperThan_PrevAndNext(
			foodId, price, orderByComparator);
	}

	/**
	 * Removes all the foods where price &lt; &#63; from the database.
	 *
	 * @param price the price
	 */
	public static void removeByCheaperThan(int price) {
		getPersistence().removeByCheaperThan(price);
	}

	/**
	 * Returns the number of foods where price &lt; &#63;.
	 *
	 * @param price the price
	 * @return the number of matching foods
	 */
	public static int countByCheaperThan(int price) {
		return getPersistence().countByCheaperThan(price);
	}

	/**
	 * Caches the food in the entity cache if it is enabled.
	 *
	 * @param food the food
	 */
	public static void cacheResult(Food food) {
		getPersistence().cacheResult(food);
	}

	/**
	 * Caches the foods in the entity cache if it is enabled.
	 *
	 * @param foods the foods
	 */
	public static void cacheResult(List<Food> foods) {
		getPersistence().cacheResult(foods);
	}

	/**
	 * Creates a new food with the primary key. Does not add the food to the database.
	 *
	 * @param foodId the primary key for the new food
	 * @return the new food
	 */
	public static Food create(long foodId) {
		return getPersistence().create(foodId);
	}

	/**
	 * Removes the food with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param foodId the primary key of the food
	 * @return the food that was removed
	 * @throws NoSuchFoodException if a food with the primary key could not be found
	 */
	public static Food remove(long foodId)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().remove(foodId);
	}

	public static Food updateImpl(Food food) {
		return getPersistence().updateImpl(food);
	}

	/**
	 * Returns the food with the primary key or throws a <code>NoSuchFoodException</code> if it could not be found.
	 *
	 * @param foodId the primary key of the food
	 * @return the food
	 * @throws NoSuchFoodException if a food with the primary key could not be found
	 */
	public static Food findByPrimaryKey(long foodId)
		throws menu.exception.NoSuchFoodException {

		return getPersistence().findByPrimaryKey(foodId);
	}

	/**
	 * Returns the food with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param foodId the primary key of the food
	 * @return the food, or <code>null</code> if a food with the primary key could not be found
	 */
	public static Food fetchByPrimaryKey(long foodId) {
		return getPersistence().fetchByPrimaryKey(foodId);
	}

	/**
	 * Returns all the foods.
	 *
	 * @return the foods
	 */
	public static List<Food> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the foods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @return the range of foods
	 */
	public static List<Food> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the foods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of foods
	 */
	@Deprecated
	public static List<Food> findAll(
		int start, int end, OrderByComparator<Food> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the foods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FoodModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of foods
	 * @param end the upper bound of the range of foods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of foods
	 */
	public static List<Food> findAll(
		int start, int end, OrderByComparator<Food> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the foods from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of foods.
	 *
	 * @return the number of foods
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FoodPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FoodPersistence, FoodPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FoodPersistence.class);

		ServiceTracker<FoodPersistence, FoodPersistence> serviceTracker =
			new ServiceTracker<FoodPersistence, FoodPersistence>(
				bundle.getBundleContext(), FoodPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}