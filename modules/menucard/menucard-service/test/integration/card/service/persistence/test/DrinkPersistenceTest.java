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

package card.service.persistence.test;

import card.exception.NoSuchDrinkException;

import card.model.Drink;

import card.service.DrinkLocalServiceUtil;
import card.service.persistence.DrinkPersistence;
import card.service.persistence.DrinkUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
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
import java.util.Objects;
import java.util.Set;

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
public class DrinkPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED, "card.service"));

	@Before
	public void setUp() {
		_persistence = DrinkUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Drink> iterator = _drinks.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Drink drink = _persistence.create(pk);

		Assert.assertNotNull(drink);

		Assert.assertEquals(drink.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Drink newDrink = addDrink();

		_persistence.remove(newDrink);

		Drink existingDrink = _persistence.fetchByPrimaryKey(
			newDrink.getPrimaryKey());

		Assert.assertNull(existingDrink);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addDrink();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Drink newDrink = _persistence.create(pk);

		newDrink.setUuid(RandomTestUtil.randomString());

		newDrink.setName(RandomTestUtil.randomString());

		newDrink.setPrice(RandomTestUtil.nextInt());

		newDrink.setDescription(RandomTestUtil.randomString());

		newDrink.setGroupId(RandomTestUtil.nextLong());

		newDrink.setCompanyId(RandomTestUtil.nextLong());

		newDrink.setUserId(RandomTestUtil.nextLong());

		newDrink.setUserName(RandomTestUtil.randomString());

		newDrink.setCreateDate(RandomTestUtil.nextDate());

		newDrink.setModifiedDate(RandomTestUtil.nextDate());

		_drinks.add(_persistence.update(newDrink));

		Drink existingDrink = _persistence.findByPrimaryKey(
			newDrink.getPrimaryKey());

		Assert.assertEquals(existingDrink.getUuid(), newDrink.getUuid());
		Assert.assertEquals(existingDrink.getDrinkId(), newDrink.getDrinkId());
		Assert.assertEquals(existingDrink.getName(), newDrink.getName());
		Assert.assertEquals(existingDrink.getPrice(), newDrink.getPrice());
		Assert.assertEquals(
			existingDrink.getDescription(), newDrink.getDescription());
		Assert.assertEquals(existingDrink.getGroupId(), newDrink.getGroupId());
		Assert.assertEquals(
			existingDrink.getCompanyId(), newDrink.getCompanyId());
		Assert.assertEquals(existingDrink.getUserId(), newDrink.getUserId());
		Assert.assertEquals(
			existingDrink.getUserName(), newDrink.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingDrink.getCreateDate()),
			Time.getShortTimestamp(newDrink.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingDrink.getModifiedDate()),
			Time.getShortTimestamp(newDrink.getModifiedDate()));
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
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
		Drink newDrink = addDrink();

		Drink existingDrink = _persistence.findByPrimaryKey(
			newDrink.getPrimaryKey());

		Assert.assertEquals(existingDrink, newDrink);
	}

	@Test(expected = NoSuchDrinkException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Drink> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"MenuCard_Drink", "uuid", true, "drinkId", true, "name", true,
			"price", true, "description", true, "groupId", true, "companyId",
			true, "userId", true, "userName", true, "createDate", true,
			"modifiedDate", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Drink newDrink = addDrink();

		Drink existingDrink = _persistence.fetchByPrimaryKey(
			newDrink.getPrimaryKey());

		Assert.assertEquals(existingDrink, newDrink);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Drink missingDrink = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingDrink);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Drink newDrink1 = addDrink();
		Drink newDrink2 = addDrink();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDrink1.getPrimaryKey());
		primaryKeys.add(newDrink2.getPrimaryKey());

		Map<Serializable, Drink> drinks = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, drinks.size());
		Assert.assertEquals(newDrink1, drinks.get(newDrink1.getPrimaryKey()));
		Assert.assertEquals(newDrink2, drinks.get(newDrink2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Drink> drinks = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(drinks.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Drink newDrink = addDrink();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDrink.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Drink> drinks = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, drinks.size());
		Assert.assertEquals(newDrink, drinks.get(newDrink.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Drink> drinks = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(drinks.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Drink newDrink = addDrink();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDrink.getPrimaryKey());

		Map<Serializable, Drink> drinks = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, drinks.size());
		Assert.assertEquals(newDrink, drinks.get(newDrink.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			DrinkLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Drink>() {

				@Override
				public void performAction(Drink drink) {
					Assert.assertNotNull(drink);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Drink newDrink = addDrink();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Drink.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("drinkId", newDrink.getDrinkId()));

		List<Drink> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Drink existingDrink = result.get(0);

		Assert.assertEquals(existingDrink, newDrink);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Drink.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("drinkId", RandomTestUtil.nextLong()));

		List<Drink> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Drink newDrink = addDrink();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Drink.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("drinkId"));

		Object newDrinkId = newDrink.getDrinkId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("drinkId", new Object[] {newDrinkId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingDrinkId = result.get(0);

		Assert.assertEquals(existingDrinkId, newDrinkId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Drink.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("drinkId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"drinkId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		Drink newDrink = addDrink();

		_persistence.clearCache();

		Drink existingDrink = _persistence.findByPrimaryKey(
			newDrink.getPrimaryKey());

		Assert.assertTrue(
			Objects.equals(
				existingDrink.getUuid(),
				ReflectionTestUtil.invoke(
					existingDrink, "getOriginalUuid", new Class<?>[0])));
		Assert.assertEquals(
			Long.valueOf(existingDrink.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				existingDrink, "getOriginalGroupId", new Class<?>[0]));
	}

	protected Drink addDrink() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Drink drink = _persistence.create(pk);

		drink.setUuid(RandomTestUtil.randomString());

		drink.setName(RandomTestUtil.randomString());

		drink.setPrice(RandomTestUtil.nextInt());

		drink.setDescription(RandomTestUtil.randomString());

		drink.setGroupId(RandomTestUtil.nextLong());

		drink.setCompanyId(RandomTestUtil.nextLong());

		drink.setUserId(RandomTestUtil.nextLong());

		drink.setUserName(RandomTestUtil.randomString());

		drink.setCreateDate(RandomTestUtil.nextDate());

		drink.setModifiedDate(RandomTestUtil.nextDate());

		_drinks.add(_persistence.update(drink));

		return drink;
	}

	private List<Drink> _drinks = new ArrayList<Drink>();
	private DrinkPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}