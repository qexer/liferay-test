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

package card.service.impl;

import card.model.Drink;
import card.service.base.DrinkLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.Date;

/**
 * The implementation of the drink local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>card.service.DrinkLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DrinkLocalServiceBaseImpl
 */
public class DrinkLocalServiceImpl extends DrinkLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>card.service.DrinkLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>card.service.DrinkLocalServiceUtil</code>.
	 */

	public Drink addDrink(String name,
						  Integer price,
						  String description) throws PortalException {

		Date now = new Date();
		long drinkID = counterLocalService.increment(Drink.class.getName());
				Drink drink = drinkPersistence.create(drinkID);

		drink.setName(name);
		drink.setPrice(price);
		drink.setDescription(description);
		drink.setCreateDate(now);
		drink.setModifiedDate(now);

		drinkPersistence.update(drink);

		return drink;
	}

	public Drink updateDrink(long drinkId,
							 String name,
							 Integer price,
							 String description) throws PortalException {

		Date now = new Date();
		Drink drink = drinkPersistence.findByPrimaryKey(drinkId);

		drink.setName(name);
		drink.setPrice(price);
		drink.setDescription(description);
		drink.setModifiedDate(now);

		drinkPersistence.update(drink);

		return drink;
	}
}