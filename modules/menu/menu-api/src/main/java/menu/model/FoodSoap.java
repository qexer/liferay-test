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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link menu.service.http.FoodServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class FoodSoap implements Serializable {

	public static FoodSoap toSoapModel(Food model) {
		FoodSoap soapModel = new FoodSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFoodId(model.getFoodId());
		soapModel.setName(model.getName());
		soapModel.setDetails(model.getDetails());
		soapModel.setSpicy(model.isSpicy());
		soapModel.setPrice(model.getPrice());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static FoodSoap[] toSoapModels(Food[] models) {
		FoodSoap[] soapModels = new FoodSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FoodSoap[][] toSoapModels(Food[][] models) {
		FoodSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FoodSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FoodSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FoodSoap[] toSoapModels(List<Food> models) {
		List<FoodSoap> soapModels = new ArrayList<FoodSoap>(models.size());

		for (Food model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FoodSoap[soapModels.size()]);
	}

	public FoodSoap() {
	}

	public long getPrimaryKey() {
		return _foodId;
	}

	public void setPrimaryKey(long pk) {
		setFoodId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFoodId() {
		return _foodId;
	}

	public void setFoodId(long foodId) {
		_foodId = foodId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDetails() {
		return _details;
	}

	public void setDetails(String details) {
		_details = details;
	}

	public boolean getSpicy() {
		return _spicy;
	}

	public boolean isSpicy() {
		return _spicy;
	}

	public void setSpicy(boolean spicy) {
		_spicy = spicy;
	}

	public int getPrice() {
		return _price;
	}

	public void setPrice(int price) {
		_price = price;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _foodId;
	private String _name;
	private String _details;
	private boolean _spicy;
	private int _price;
	private Date _createDate;
	private Date _modifiedDate;

}