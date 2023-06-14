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

import java.util.List;

// import com.liferay.portal.kernel.util.HashMapBuilder;
// import java.util.ArrayList;
// import java.util.Map;

/**
 * @author Eduardo Allegrini
 */
public class VerticalNavDisplayContext {

	public List<VerticalNavItem> getDefaultVerticalNavItems() {
		if (_defaultVerticalNavItems != null) {
			return _defaultVerticalNavItems;
		}

		_defaultVerticalNavItems = VerticalNavItemListBuilder.add(
			verticalNavItem -> {
				verticalNavItem.setHref("#1");
				verticalNavItem.setLabel("Option 1");
			}
		).add(
			verticalNavItem -> {
				verticalNavItem.setHref("#2");
				verticalNavItem.setLabel("Option 2");
			}
		).add(
			verticalNavItem -> {
				verticalNavItem.setHref("#3");
				verticalNavItem.setLabel("Option 3");
			}
		).add(
			verticalNavItem -> {
				verticalNavItem.setHref("#4");
				verticalNavItem.setLabel("Option 4");
			}
		).build();

		return _defaultVerticalNavItems;
	}

	private List<VerticalNavItem> _defaultVerticalNavItems;

	// public List<Map<String, Object>> getDefaultVerticalNavItems() {

	// 	List<Map<String, Object>> _results = new ArrayList<>();

	// 	_results.add(
	// 		HashMapBuilder.<String, Object>put(
	// 			"href", "#page-1"
	// 		).put(
	// 			"label", "Page 1"
	// 		).put(
	// 			"items",
	// 			HashMapBuilder.<String, Object>put(
	// 				"href", "#page-1-a"
	// 			).put(
	// 				"label", "Page 1A"
	// 			).build()
	// 		).build();
	// 	);

	// 	return _results
	// }

}