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

package com.liferay.frontend.taglib.clay.sample.web.internal.display.context;

import com.liferay.frontend.taglib.clay.servlet.taglib.util.VerticalNavItem;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.VerticalNavItemListBuilder;
import com.liferay.portal.kernel.util.ListUtil;

import java.util.List;

/**
 * @author Eduardo Allegrini
 * @author Daniel Sanz
 */
public class VerticalNavDisplayContext {

	public List<String> getVerticalNavExpandedKeys() {
		return ListUtil.fromArray("1");
	}

	public List<VerticalNavItem> getVerticalNavItems() {
		if (_verticalNavGroupItems != null) {
			return _verticalNavGroupItems;
		}

		_verticalNavGroupItems = VerticalNavItemListBuilder.addGroup(
			verticalNavGroupItem -> {
				verticalNavGroupItem.setVerticalNavItems(
					VerticalNavItemListBuilder.add(
						verticalNavItem -> {
							verticalNavItem.setHref("#1.1");
							verticalNavItem.setId("1.1");
							verticalNavItem.setLabel("Item 1.1");
						}
					).add(
						verticalNavItem -> {
							verticalNavItem.setHref("#1.2");
							verticalNavItem.setId("1.2");
							verticalNavItem.setLabel("Item 1.2");
						}
					).build());

				verticalNavGroupItem.setId("1");
				verticalNavGroupItem.setLabel("Item 1");
			}
		).addGroup(
			verticalNavGroupItem -> {
				verticalNavGroupItem.setVerticalNavItems(
					VerticalNavItemListBuilder.add(
						verticalNavItem -> {
							verticalNavItem.setActive(true);
							verticalNavItem.setHref("#2.1");
							verticalNavItem.setId("2.1");
							verticalNavItem.setLabel("Item 2.1");
						}
					).add(
						verticalNavItem -> {
							verticalNavItem.setHref("#2.2");
							verticalNavItem.setId("2.2");
							verticalNavItem.setLabel("Item 2.2");
						}
					).build());

				verticalNavGroupItem.setExpanded(true);
				verticalNavGroupItem.setId("2");
				verticalNavGroupItem.setLabel("Item 2");
			}
		).build();

		return _verticalNavGroupItems;
	}

	private List<VerticalNavItem> _verticalNavGroupItems;

}