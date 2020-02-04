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

package menu.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Food}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Food
 * @generated
 */
@ProviderType
public class FoodWrapper implements Food, ModelWrapper<Food> {

	public FoodWrapper(Food food) {
		_food = food;
	}

	@Override
	public Class<?> getModelClass() {
		return Food.class;
	}

	@Override
	public String getModelClassName() {
		return Food.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("foodId", getFoodId());
		attributes.put("name", getName());
		attributes.put("details", getDetails());
		attributes.put("spicy", isSpicy());
		attributes.put("price", getPrice());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long foodId = (Long)attributes.get("foodId");

		if (foodId != null) {
			setFoodId(foodId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String details = (String)attributes.get("details");

		if (details != null) {
			setDetails(details);
		}

		Boolean spicy = (Boolean)attributes.get("spicy");

		if (spicy != null) {
			setSpicy(spicy);
		}

		Integer price = (Integer)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public Object clone() {
		return new FoodWrapper((Food)_food.clone());
	}

	@Override
	public int compareTo(menu.model.Food food) {
		return _food.compareTo(food);
	}

	/**
	 * Returns the create date of this food.
	 *
	 * @return the create date of this food
	 */
	@Override
	public Date getCreateDate() {
		return _food.getCreateDate();
	}

	/**
	 * Returns the details of this food.
	 *
	 * @return the details of this food
	 */
	@Override
	public String getDetails() {
		return _food.getDetails();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _food.getExpandoBridge();
	}

	/**
	 * Returns the food ID of this food.
	 *
	 * @return the food ID of this food
	 */
	@Override
	public long getFoodId() {
		return _food.getFoodId();
	}

	/**
	 * Returns the modified date of this food.
	 *
	 * @return the modified date of this food
	 */
	@Override
	public Date getModifiedDate() {
		return _food.getModifiedDate();
	}

	/**
	 * Returns the name of this food.
	 *
	 * @return the name of this food
	 */
	@Override
	public String getName() {
		return _food.getName();
	}

	/**
	 * Returns the price of this food.
	 *
	 * @return the price of this food
	 */
	@Override
	public int getPrice() {
		return _food.getPrice();
	}

	/**
	 * Returns the primary key of this food.
	 *
	 * @return the primary key of this food
	 */
	@Override
	public long getPrimaryKey() {
		return _food.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _food.getPrimaryKeyObj();
	}

	/**
	 * Returns the spicy of this food.
	 *
	 * @return the spicy of this food
	 */
	@Override
	public boolean getSpicy() {
		return _food.getSpicy();
	}

	/**
	 * Returns the uuid of this food.
	 *
	 * @return the uuid of this food
	 */
	@Override
	public String getUuid() {
		return _food.getUuid();
	}

	@Override
	public int hashCode() {
		return _food.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _food.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _food.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _food.isNew();
	}

	/**
	 * Returns <code>true</code> if this food is spicy.
	 *
	 * @return <code>true</code> if this food is spicy; <code>false</code> otherwise
	 */
	@Override
	public boolean isSpicy() {
		return _food.isSpicy();
	}

	@Override
	public void persist() {
		_food.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_food.setCachedModel(cachedModel);
	}

	/**
	 * Sets the create date of this food.
	 *
	 * @param createDate the create date of this food
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_food.setCreateDate(createDate);
	}

	/**
	 * Sets the details of this food.
	 *
	 * @param details the details of this food
	 */
	@Override
	public void setDetails(String details) {
		_food.setDetails(details);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_food.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_food.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_food.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the food ID of this food.
	 *
	 * @param foodId the food ID of this food
	 */
	@Override
	public void setFoodId(long foodId) {
		_food.setFoodId(foodId);
	}

	/**
	 * Sets the modified date of this food.
	 *
	 * @param modifiedDate the modified date of this food
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_food.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this food.
	 *
	 * @param name the name of this food
	 */
	@Override
	public void setName(String name) {
		_food.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_food.setNew(n);
	}

	/**
	 * Sets the price of this food.
	 *
	 * @param price the price of this food
	 */
	@Override
	public void setPrice(int price) {
		_food.setPrice(price);
	}

	/**
	 * Sets the primary key of this food.
	 *
	 * @param primaryKey the primary key of this food
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_food.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_food.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets whether this food is spicy.
	 *
	 * @param spicy the spicy of this food
	 */
	@Override
	public void setSpicy(boolean spicy) {
		_food.setSpicy(spicy);
	}

	/**
	 * Sets the uuid of this food.
	 *
	 * @param uuid the uuid of this food
	 */
	@Override
	public void setUuid(String uuid) {
		_food.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<menu.model.Food>
		toCacheModel() {

		return _food.toCacheModel();
	}

	@Override
	public menu.model.Food toEscapedModel() {
		return new FoodWrapper(_food.toEscapedModel());
	}

	@Override
	public String toString() {
		return _food.toString();
	}

	@Override
	public menu.model.Food toUnescapedModel() {
		return new FoodWrapper(_food.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _food.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FoodWrapper)) {
			return false;
		}

		FoodWrapper foodWrapper = (FoodWrapper)obj;

		if (Objects.equals(_food, foodWrapper._food)) {
			return true;
		}

		return false;
	}

	@Override
	public Food getWrappedModel() {
		return _food;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _food.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _food.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_food.resetOriginalValues();
	}

	private final Food _food;

}