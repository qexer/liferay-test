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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

import menu.exception.NoSuchFoodException;

import menu.model.Food;

/**
 * The persistence interface for the food service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FoodUtil
 * @generated
 */
@ProviderType
public interface FoodPersistence extends BasePersistence<Food> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FoodUtil} to access the food persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Food> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the foods where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching foods
	 */
	public java.util.List<Food> findByUuid(String uuid);

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
	public java.util.List<Food> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Food> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Food> orderByComparator, boolean useFinderCache);

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
	public java.util.List<Food> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Food> orderByComparator);

	/**
	 * Returns the first food in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public Food findByUuid_First(
			String uuid, OrderByComparator<Food> orderByComparator)
		throws NoSuchFoodException;

	/**
	 * Returns the first food in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food, or <code>null</code> if a matching food could not be found
	 */
	public Food fetchByUuid_First(
		String uuid, OrderByComparator<Food> orderByComparator);

	/**
	 * Returns the last food in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public Food findByUuid_Last(
			String uuid, OrderByComparator<Food> orderByComparator)
		throws NoSuchFoodException;

	/**
	 * Returns the last food in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food, or <code>null</code> if a matching food could not be found
	 */
	public Food fetchByUuid_Last(
		String uuid, OrderByComparator<Food> orderByComparator);

	/**
	 * Returns the foods before and after the current food in the ordered set where uuid = &#63;.
	 *
	 * @param foodId the primary key of the current food
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next food
	 * @throws NoSuchFoodException if a food with the primary key could not be found
	 */
	public Food[] findByUuid_PrevAndNext(
			long foodId, String uuid, OrderByComparator<Food> orderByComparator)
		throws NoSuchFoodException;

	/**
	 * Removes all the foods where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of foods where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching foods
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the foods where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching foods
	 */
	public java.util.List<Food> findByName(String name);

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
	public java.util.List<Food> findByName(String name, int start, int end);

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
	public java.util.List<Food> findByName(
		String name, int start, int end,
		OrderByComparator<Food> orderByComparator, boolean useFinderCache);

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
	public java.util.List<Food> findByName(
		String name, int start, int end,
		OrderByComparator<Food> orderByComparator);

	/**
	 * Returns the first food in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public Food findByName_First(
			String name, OrderByComparator<Food> orderByComparator)
		throws NoSuchFoodException;

	/**
	 * Returns the first food in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food, or <code>null</code> if a matching food could not be found
	 */
	public Food fetchByName_First(
		String name, OrderByComparator<Food> orderByComparator);

	/**
	 * Returns the last food in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public Food findByName_Last(
			String name, OrderByComparator<Food> orderByComparator)
		throws NoSuchFoodException;

	/**
	 * Returns the last food in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food, or <code>null</code> if a matching food could not be found
	 */
	public Food fetchByName_Last(
		String name, OrderByComparator<Food> orderByComparator);

	/**
	 * Returns the foods before and after the current food in the ordered set where name = &#63;.
	 *
	 * @param foodId the primary key of the current food
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next food
	 * @throws NoSuchFoodException if a food with the primary key could not be found
	 */
	public Food[] findByName_PrevAndNext(
			long foodId, String name, OrderByComparator<Food> orderByComparator)
		throws NoSuchFoodException;

	/**
	 * Removes all the foods where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of foods where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching foods
	 */
	public int countByName(String name);

	/**
	 * Returns all the foods where price &lt; &#63;.
	 *
	 * @param price the price
	 * @return the matching foods
	 */
	public java.util.List<Food> findByCheaperThan(int price);

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
	public java.util.List<Food> findByCheaperThan(
		int price, int start, int end);

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
	public java.util.List<Food> findByCheaperThan(
		int price, int start, int end,
		OrderByComparator<Food> orderByComparator, boolean useFinderCache);

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
	public java.util.List<Food> findByCheaperThan(
		int price, int start, int end,
		OrderByComparator<Food> orderByComparator);

	/**
	 * Returns the first food in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public Food findByCheaperThan_First(
			int price, OrderByComparator<Food> orderByComparator)
		throws NoSuchFoodException;

	/**
	 * Returns the first food in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food, or <code>null</code> if a matching food could not be found
	 */
	public Food fetchByCheaperThan_First(
		int price, OrderByComparator<Food> orderByComparator);

	/**
	 * Returns the last food in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food
	 * @throws NoSuchFoodException if a matching food could not be found
	 */
	public Food findByCheaperThan_Last(
			int price, OrderByComparator<Food> orderByComparator)
		throws NoSuchFoodException;

	/**
	 * Returns the last food in the ordered set where price &lt; &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food, or <code>null</code> if a matching food could not be found
	 */
	public Food fetchByCheaperThan_Last(
		int price, OrderByComparator<Food> orderByComparator);

	/**
	 * Returns the foods before and after the current food in the ordered set where price &lt; &#63;.
	 *
	 * @param foodId the primary key of the current food
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next food
	 * @throws NoSuchFoodException if a food with the primary key could not be found
	 */
	public Food[] findByCheaperThan_PrevAndNext(
			long foodId, int price, OrderByComparator<Food> orderByComparator)
		throws NoSuchFoodException;

	/**
	 * Removes all the foods where price &lt; &#63; from the database.
	 *
	 * @param price the price
	 */
	public void removeByCheaperThan(int price);

	/**
	 * Returns the number of foods where price &lt; &#63;.
	 *
	 * @param price the price
	 * @return the number of matching foods
	 */
	public int countByCheaperThan(int price);

	/**
	 * Caches the food in the entity cache if it is enabled.
	 *
	 * @param food the food
	 */
	public void cacheResult(Food food);

	/**
	 * Caches the foods in the entity cache if it is enabled.
	 *
	 * @param foods the foods
	 */
	public void cacheResult(java.util.List<Food> foods);

	/**
	 * Creates a new food with the primary key. Does not add the food to the database.
	 *
	 * @param foodId the primary key for the new food
	 * @return the new food
	 */
	public Food create(long foodId);

	/**
	 * Removes the food with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param foodId the primary key of the food
	 * @return the food that was removed
	 * @throws NoSuchFoodException if a food with the primary key could not be found
	 */
	public Food remove(long foodId) throws NoSuchFoodException;

	public Food updateImpl(Food food);

	/**
	 * Returns the food with the primary key or throws a <code>NoSuchFoodException</code> if it could not be found.
	 *
	 * @param foodId the primary key of the food
	 * @return the food
	 * @throws NoSuchFoodException if a food with the primary key could not be found
	 */
	public Food findByPrimaryKey(long foodId) throws NoSuchFoodException;

	/**
	 * Returns the food with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param foodId the primary key of the food
	 * @return the food, or <code>null</code> if a food with the primary key could not be found
	 */
	public Food fetchByPrimaryKey(long foodId);

	/**
	 * Returns all the foods.
	 *
	 * @return the foods
	 */
	public java.util.List<Food> findAll();

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
	public java.util.List<Food> findAll(int start, int end);

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
	public java.util.List<Food> findAll(
		int start, int end, OrderByComparator<Food> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<Food> findAll(
		int start, int end, OrderByComparator<Food> orderByComparator);

	/**
	 * Removes all the foods from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of foods.
	 *
	 * @return the number of foods
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}