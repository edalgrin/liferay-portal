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

package com.liferay.frontend.taglib.clay.servlet.taglib.util;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeSupplier;

import java.util.List;

/**
 * @author Eduardo Allegrini
 */
public class VerticalNavItemListBuilder {

	public static VerticalNavItemListWrapper add(
		UnsafeConsumer<VerticalNavItem, Exception> unsafeConsumer) {

		VerticalNavItemListWrapper verticalNavItemListWrapper =
			new VerticalNavItemListWrapper();

		return verticalNavItemListWrapper.add(unsafeConsumer);
	}

	public static VerticalNavItemListWrapper add(
		UnsafeSupplier<Boolean, Exception> unsafeSupplier,
		UnsafeConsumer<VerticalNavItem, Exception> unsafeConsumer) {

		VerticalNavItemListWrapper verticalNavItemListWrapper =
			new VerticalNavItemListWrapper();

		return verticalNavItemListWrapper.add(unsafeSupplier, unsafeConsumer);
	}

	public static VerticalNavItemListWrapper add(
		UnsafeSupplier<Boolean, Exception> unsafeSupplier,
		VerticalNavItem verticalNavItem) {

		VerticalNavItemListWrapper verticalNavItemListWrapper =
			new VerticalNavItemListWrapper();

		return verticalNavItemListWrapper.add(unsafeSupplier, verticalNavItem);
	}

	public static VerticalNavItemListWrapper add(
		VerticalNavItem verticalNavItem) {

		VerticalNavItemListWrapper verticalNavItemListWrapper =
			new VerticalNavItemListWrapper();

		return verticalNavItemListWrapper.add(verticalNavItem);
	}

	public static VerticalNavItemListWrapper addAll(
		List<VerticalNavItem> verticalNavItems) {

		VerticalNavItemListWrapper verticalNavItemListWrapper =
			new VerticalNavItemListWrapper();

		return verticalNavItemListWrapper.addAll(verticalNavItems);
	}

	public static VerticalNavItemListWrapper addGroup(
		UnsafeConsumer<VerticalNavGroupItem, Exception> unsafeConsumer) {

		VerticalNavItemListWrapper verticalNavItemListWrapper =
			new VerticalNavItemListWrapper();

		return verticalNavItemListWrapper.addGroup(unsafeConsumer);
	}

	public static VerticalNavItemListWrapper addGroup(
		UnsafeSupplier<Boolean, Exception> unsafeSupplier,
		UnsafeConsumer<VerticalNavGroupItem, Exception> unsafeConsumer) {

		VerticalNavItemListWrapper verticalNavItemListWrapper =
			new VerticalNavItemListWrapper();

		return verticalNavItemListWrapper.addGroup(
			unsafeSupplier, unsafeConsumer);
	}

	public static final class VerticalNavItemListWrapper {

		public VerticalNavItemListWrapper add(
			UnsafeConsumer<VerticalNavItem, Exception> unsafeConsumer) {

			_verticalNavItemList.add(unsafeConsumer);

			return this;
		}

		public VerticalNavItemListWrapper add(
			UnsafeSupplier<Boolean, Exception> unsafeSupplier,
			UnsafeConsumer<VerticalNavItem, Exception> unsafeConsumer) {

			try {
				if (unsafeSupplier.get()) {
					_verticalNavItemList.add(unsafeConsumer);
				}
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}

			return this;
		}

		public VerticalNavItemListWrapper add(
			UnsafeSupplier<Boolean, Exception> unsafeSupplier,
			VerticalNavItem verticalNavItem) {

			try {
				if (unsafeSupplier.get()) {
					_verticalNavItemList.add(verticalNavItem);
				}
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}

			return this;
		}

		public VerticalNavItemListWrapper add(VerticalNavItem verticalNavItem) {
			_verticalNavItemList.add(verticalNavItem);

			return this;
		}

		public VerticalNavItemListWrapper addAll(
			List<VerticalNavItem> verticalNavItems) {

			for (VerticalNavItem verticalNavItem : verticalNavItems) {
				if (verticalNavItem != null) {
					_verticalNavItemList.add(verticalNavItem);
				}
			}

			return this;
		}

		public VerticalNavItemListWrapper addGroup(
			UnsafeConsumer<VerticalNavGroupItem, Exception> unsafeConsumer) {

			_verticalNavItemList.addGroup(unsafeConsumer);

			return this;
		}

		public VerticalNavItemListWrapper addGroup(
			UnsafeSupplier<Boolean, Exception> unsafeSupplier,
			UnsafeConsumer<VerticalNavGroupItem, Exception> unsafeConsumer) {

			try {
				if (unsafeSupplier.get()) {
					_verticalNavItemList.addGroup(unsafeConsumer);
				}
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}

			return this;
		}

		public VerticalNavItemList build() {
			return _verticalNavItemList;
		}

		private final VerticalNavItemList _verticalNavItemList =
			new VerticalNavItemList();

	}

}