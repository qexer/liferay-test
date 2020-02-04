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

package menu.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import menu.model.Food;

/**
 * The cache model class for representing Food in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class FoodCacheModel implements CacheModel<Food>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FoodCacheModel)) {
			return false;
		}

		FoodCacheModel foodCacheModel = (FoodCacheModel)obj;

		if (foodId == foodCacheModel.foodId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, foodId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", foodId=");
		sb.append(foodId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", details=");
		sb.append(details);
		sb.append(", spicy=");
		sb.append(spicy);
		sb.append(", price=");
		sb.append(price);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Food toEntityModel() {
		FoodImpl foodImpl = new FoodImpl();

		if (uuid == null) {
			foodImpl.setUuid("");
		}
		else {
			foodImpl.setUuid(uuid);
		}

		foodImpl.setFoodId(foodId);

		if (name == null) {
			foodImpl.setName("");
		}
		else {
			foodImpl.setName(name);
		}

		if (details == null) {
			foodImpl.setDetails("");
		}
		else {
			foodImpl.setDetails(details);
		}

		foodImpl.setSpicy(spicy);
		foodImpl.setPrice(price);

		if (createDate == Long.MIN_VALUE) {
			foodImpl.setCreateDate(null);
		}
		else {
			foodImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			foodImpl.setModifiedDate(null);
		}
		else {
			foodImpl.setModifiedDate(new Date(modifiedDate));
		}

		foodImpl.resetOriginalValues();

		return foodImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		foodId = objectInput.readLong();
		name = objectInput.readUTF();
		details = objectInput.readUTF();

		spicy = objectInput.readBoolean();

		price = objectInput.readInt();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(foodId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (details == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(details);
		}

		objectOutput.writeBoolean(spicy);

		objectOutput.writeInt(price);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long foodId;
	public String name;
	public String details;
	public boolean spicy;
	public int price;
	public long createDate;
	public long modifiedDate;

}