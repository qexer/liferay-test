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

package menu.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import menu.exception.NoSuchFoodException;

import menu.model.Food;

import menu.service.FoodLocalServiceUtil;
import menu.service.persistence.FoodPersistence;
import menu.service.persistence.FoodUtil;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class FoodPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED, "menu.service"));

	@Before
	public void setUp() {
		_persistence = FoodUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Food> iterator = _foods.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Food food = _persistence.create(pk);

		Assert.assertNotNull(food);

		Assert.assertEquals(food.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Food newFood = addFood();

		_persistence.remove(newFood);

		Food existingFood = _persistence.fetchByPrimaryKey(
			newFood.getPrimaryKey());

		Assert.assertNull(existingFood);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addFood();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Food newFood = _persistence.create(pk);

		newFood.setUuid(RandomTestUtil.randomString());

		newFood.setName(RandomTestUtil.randomString());

		newFood.setDetails(RandomTestUtil.randomString());

		newFood.setSpicy(RandomTestUtil.randomBoolean());

		newFood.setPrice(RandomTestUtil.nextInt());

		newFood.setCreateDate(RandomTestUtil.nextDate());

		newFood.setModifiedDate(RandomTestUtil.nextDate());

		_foods.add(_persistence.update(newFood));

		Food existingFood = _persistence.findByPrimaryKey(
			newFood.getPrimaryKey());

		Assert.assertEquals(existingFood.getUuid(), newFood.getUuid());
		Assert.assertEquals(existingFood.getFoodId(), newFood.getFoodId());
		Assert.assertEquals(existingFood.getName(), newFood.getName());
		Assert.assertEquals(existingFood.getDetails(), newFood.getDetails());
		Assert.assertEquals(existingFood.isSpicy(), newFood.isSpicy());
		Assert.assertEquals(existingFood.getPrice(), newFood.getPrice());
		Assert.assertEquals(
			Time.getShortTimestamp(existingFood.getCreateDate()),
			Time.getShortTimestamp(newFood.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingFood.getModifiedDate()),
			Time.getShortTimestamp(newFood.getModifiedDate()));
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByName() throws Exception {
		_persistence.countByName("");

		_persistence.countByName("null");

		_persistence.countByName((String)null);
	}

	@Test
	public void testCountByCheaperThan() throws Exception {
		_persistence.countByCheaperThan(RandomTestUtil.nextInt());

		_persistence.countByCheaperThan(0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Food newFood = addFood();

		Food existingFood = _persistence.findByPrimaryKey(
			newFood.getPrimaryKey());

		Assert.assertEquals(existingFood, newFood);
	}

	@Test(expected = NoSuchFoodException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Food> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Menu_Food", "uuid", true, "foodId", true, "name", true, "details",
			true, "spicy", true, "price", true, "createDate", true,
			"modifiedDate", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Food newFood = addFood();

		Food existingFood = _persistence.fetchByPrimaryKey(
			newFood.getPrimaryKey());

		Assert.assertEquals(existingFood, newFood);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Food missingFood = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingFood);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Food newFood1 = addFood();
		Food newFood2 = addFood();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newFood1.getPrimaryKey());
		primaryKeys.add(newFood2.getPrimaryKey());

		Map<Serializable, Food> foods = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, foods.size());
		Assert.assertEquals(newFood1, foods.get(newFood1.getPrimaryKey()));
		Assert.assertEquals(newFood2, foods.get(newFood2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Food> foods = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(foods.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Food newFood = addFood();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newFood.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Food> foods = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, foods.size());
		Assert.assertEquals(newFood, foods.get(newFood.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Food> foods = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(foods.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Food newFood = addFood();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newFood.getPrimaryKey());

		Map<Serializable, Food> foods = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, foods.size());
		Assert.assertEquals(newFood, foods.get(newFood.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			FoodLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Food>() {

				@Override
				public void performAction(Food food) {
					Assert.assertNotNull(food);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Food newFood = addFood();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Food.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("foodId", newFood.getFoodId()));

		List<Food> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Food existingFood = result.get(0);

		Assert.assertEquals(existingFood, newFood);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Food.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("foodId", RandomTestUtil.nextLong()));

		List<Food> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Food newFood = addFood();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Food.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("foodId"));

		Object newFoodId = newFood.getFoodId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("foodId", new Object[] {newFoodId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingFoodId = result.get(0);

		Assert.assertEquals(existingFoodId, newFoodId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Food.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("foodId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"foodId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Food addFood() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Food food = _persistence.create(pk);

		food.setUuid(RandomTestUtil.randomString());

		food.setName(RandomTestUtil.randomString());

		food.setDetails(RandomTestUtil.randomString());

		food.setSpicy(RandomTestUtil.randomBoolean());

		food.setPrice(RandomTestUtil.nextInt());

		food.setCreateDate(RandomTestUtil.nextDate());

		food.setModifiedDate(RandomTestUtil.nextDate());

		_foods.add(_persistence.update(food));

		return food;
	}

	private List<Food> _foods = new ArrayList<Food>();
	private FoodPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}