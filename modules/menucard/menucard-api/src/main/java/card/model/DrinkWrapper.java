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

package card.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Drink}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Drink
 * @generated
 */
@ProviderType
public class DrinkWrapper implements Drink, ModelWrapper<Drink> {

	public DrinkWrapper(Drink drink) {
		_drink = drink;
	}

	@Override
	public Class<?> getModelClass() {
		return Drink.class;
	}

	@Override
	public String getModelClassName() {
		return Drink.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("drinkId", getDrinkId());
		attributes.put("name", getName());
		attributes.put("price", getPrice());
		attributes.put("description", getDescription());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
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

		Long drinkId = (Long)attributes.get("drinkId");

		if (drinkId != null) {
			setDrinkId(drinkId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer price = (Integer)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
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
		return new DrinkWrapper((Drink)_drink.clone());
	}

	@Override
	public int compareTo(card.model.Drink drink) {
		return _drink.compareTo(drink);
	}

	/**
	 * Returns the company ID of this drink.
	 *
	 * @return the company ID of this drink
	 */
	@Override
	public long getCompanyId() {
		return _drink.getCompanyId();
	}

	/**
	 * Returns the create date of this drink.
	 *
	 * @return the create date of this drink
	 */
	@Override
	public Date getCreateDate() {
		return _drink.getCreateDate();
	}

	/**
	 * Returns the description of this drink.
	 *
	 * @return the description of this drink
	 */
	@Override
	public String getDescription() {
		return _drink.getDescription();
	}

	/**
	 * Returns the drink ID of this drink.
	 *
	 * @return the drink ID of this drink
	 */
	@Override
	public long getDrinkId() {
		return _drink.getDrinkId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _drink.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this drink.
	 *
	 * @return the group ID of this drink
	 */
	@Override
	public long getGroupId() {
		return _drink.getGroupId();
	}

	/**
	 * Returns the modified date of this drink.
	 *
	 * @return the modified date of this drink
	 */
	@Override
	public Date getModifiedDate() {
		return _drink.getModifiedDate();
	}

	/**
	 * Returns the name of this drink.
	 *
	 * @return the name of this drink
	 */
	@Override
	public String getName() {
		return _drink.getName();
	}

	/**
	 * Returns the price of this drink.
	 *
	 * @return the price of this drink
	 */
	@Override
	public int getPrice() {
		return _drink.getPrice();
	}

	/**
	 * Returns the primary key of this drink.
	 *
	 * @return the primary key of this drink
	 */
	@Override
	public long getPrimaryKey() {
		return _drink.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _drink.getPrimaryKeyObj();
	}

	/**
	 * Returns the user ID of this drink.
	 *
	 * @return the user ID of this drink
	 */
	@Override
	public long getUserId() {
		return _drink.getUserId();
	}

	/**
	 * Returns the user name of this drink.
	 *
	 * @return the user name of this drink
	 */
	@Override
	public String getUserName() {
		return _drink.getUserName();
	}

	/**
	 * Returns the user uuid of this drink.
	 *
	 * @return the user uuid of this drink
	 */
	@Override
	public String getUserUuid() {
		return _drink.getUserUuid();
	}

	/**
	 * Returns the uuid of this drink.
	 *
	 * @return the uuid of this drink
	 */
	@Override
	public String getUuid() {
		return _drink.getUuid();
	}

	@Override
	public int hashCode() {
		return _drink.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _drink.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _drink.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _drink.isNew();
	}

	@Override
	public void persist() {
		_drink.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_drink.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this drink.
	 *
	 * @param companyId the company ID of this drink
	 */
	@Override
	public void setCompanyId(long companyId) {
		_drink.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this drink.
	 *
	 * @param createDate the create date of this drink
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_drink.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this drink.
	 *
	 * @param description the description of this drink
	 */
	@Override
	public void setDescription(String description) {
		_drink.setDescription(description);
	}

	/**
	 * Sets the drink ID of this drink.
	 *
	 * @param drinkId the drink ID of this drink
	 */
	@Override
	public void setDrinkId(long drinkId) {
		_drink.setDrinkId(drinkId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_drink.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_drink.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_drink.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this drink.
	 *
	 * @param groupId the group ID of this drink
	 */
	@Override
	public void setGroupId(long groupId) {
		_drink.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this drink.
	 *
	 * @param modifiedDate the modified date of this drink
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_drink.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this drink.
	 *
	 * @param name the name of this drink
	 */
	@Override
	public void setName(String name) {
		_drink.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_drink.setNew(n);
	}

	/**
	 * Sets the price of this drink.
	 *
	 * @param price the price of this drink
	 */
	@Override
	public void setPrice(int price) {
		_drink.setPrice(price);
	}

	/**
	 * Sets the primary key of this drink.
	 *
	 * @param primaryKey the primary key of this drink
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_drink.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_drink.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the user ID of this drink.
	 *
	 * @param userId the user ID of this drink
	 */
	@Override
	public void setUserId(long userId) {
		_drink.setUserId(userId);
	}

	/**
	 * Sets the user name of this drink.
	 *
	 * @param userName the user name of this drink
	 */
	@Override
	public void setUserName(String userName) {
		_drink.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this drink.
	 *
	 * @param userUuid the user uuid of this drink
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_drink.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this drink.
	 *
	 * @param uuid the uuid of this drink
	 */
	@Override
	public void setUuid(String uuid) {
		_drink.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<card.model.Drink>
		toCacheModel() {

		return _drink.toCacheModel();
	}

	@Override
	public card.model.Drink toEscapedModel() {
		return new DrinkWrapper(_drink.toEscapedModel());
	}

	@Override
	public String toString() {
		return _drink.toString();
	}

	@Override
	public card.model.Drink toUnescapedModel() {
		return new DrinkWrapper(_drink.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _drink.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DrinkWrapper)) {
			return false;
		}

		DrinkWrapper drinkWrapper = (DrinkWrapper)obj;

		if (Objects.equals(_drink, drinkWrapper._drink)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _drink.getStagedModelType();
	}

	@Override
	public Drink getWrappedModel() {
		return _drink;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _drink.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _drink.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_drink.resetOriginalValues();
	}

	private final Drink _drink;

}