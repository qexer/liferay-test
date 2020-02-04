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

import menu.model.Drink;

/**
 * The cache model class for representing Drink in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class DrinkCacheModel implements CacheModel<Drink>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DrinkCacheModel)) {
			return false;
		}

		DrinkCacheModel drinkCacheModel = (DrinkCacheModel)obj;

		if (drinkId == drinkCacheModel.drinkId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, drinkId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", drinkId=");
		sb.append(drinkId);
		sb.append(", name=");
		sb.append(name);
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
	public Drink toEntityModel() {
		DrinkImpl drinkImpl = new DrinkImpl();

		if (uuid == null) {
			drinkImpl.setUuid("");
		}
		else {
			drinkImpl.setUuid(uuid);
		}

		drinkImpl.setDrinkId(drinkId);

		if (name == null) {
			drinkImpl.setName("");
		}
		else {
			drinkImpl.setName(name);
		}

		drinkImpl.setPrice(price);

		if (createDate == Long.MIN_VALUE) {
			drinkImpl.setCreateDate(null);
		}
		else {
			drinkImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			drinkImpl.setModifiedDate(null);
		}
		else {
			drinkImpl.setModifiedDate(new Date(modifiedDate));
		}

		drinkImpl.resetOriginalValues();

		return drinkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		drinkId = objectInput.readLong();
		name = objectInput.readUTF();

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

		objectOutput.writeLong(drinkId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(price);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long drinkId;
	public String name;
	public int price;
	public long createDate;
	public long modifiedDate;

}