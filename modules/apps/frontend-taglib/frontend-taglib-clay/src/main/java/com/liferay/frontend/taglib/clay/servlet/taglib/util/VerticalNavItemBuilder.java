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

import com.liferay.petra.function.UnsafeSupplier;

import java.util.Map;

import javax.portlet.PortletURL;

/**
 * @author Carlos Lancha
 */
public class VerticalNavItemBuilder {

	public static AfterPutDataStep putData(String key, String value) {
		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.putData(key, value);
	}

	public static AfterPutDataStep putData(
		String key, UnsafeSupplier<String, Exception> valueUnsafeSupplier) {

		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.putData(key, valueUnsafeSupplier);
	}

	public static AfterActiveStep setActive(boolean active) {
		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.setActive(active);
	}

	public static AfterActiveStep setActive(
		UnsafeSupplier<Boolean, Exception> activeUnsafeSupplier) {

		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.setActive(activeUnsafeSupplier);
	}

	public static AfterSetDataStep setData(Map<String, Object> data) {
		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.setData(data);
	}

	public static AfterDisabledStep setDisabled(boolean disabled) {
		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.setDisabled(disabled);
	}

	public static AfterDisabledStep setDisabled(
		UnsafeSupplier<Boolean, Exception> disabledUnsafeSupplier) {

		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.setDisabled(disabledUnsafeSupplier);
	}

	public static AfterHrefStep setHref(Object href) {
		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.setHref(href);
	}

	public static AfterHrefStep setHref(
		PortletURL portletURL, Object... parameters) {

		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.setHref(parameters);
	}

	public static AfterHrefStep setHref(
		UnsafeSupplier<Object, Exception> hrefUnsafeSupplier) {

		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.setHref(hrefUnsafeSupplier);
	}

	public static AfterLabelStep setLabel(String label) {
		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.setLabel(label);
	}

	public static AfterLabelStep setLabel(
		UnsafeSupplier<String, Exception> labelUnsafeSupplier) {

		VerticalNavItemStep verticalNavItemStep = new VerticalNavItemStep();

		return verticalNavItemStep.setLabel(labelUnsafeSupplier);
	}

	public static class VerticalNavItemStep
		implements ActiveStep, AfterActiveStep, AfterDisabledStep,
				   AfterHrefStep, AfterLabelStep, AfterPutDataStep,
				   AfterSetDataStep, BuildStep, DisabledStep, HrefStep,
				   LabelStep, PutDataStep, SetDataStep {

		@Override
		public VerticalNavItem build() {
			return _verticalNavItem;
		}

		@Override
		public AfterPutDataStep putData(String key, String value) {
			_verticalNavItem.putData(key, value);

			return this;
		}

		@Override
		public AfterPutDataStep putData(
			String key, UnsafeSupplier<String, Exception> valueUnsafeSupplier) {

			try {
				String value = valueUnsafeSupplier.get();

				if (value != null) {
					_verticalNavItem.putData(key, value);
				}

				return this;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		}

		@Override
		public AfterActiveStep setActive(boolean active) {
			_verticalNavItem.setActive(active);

			return this;
		}

		@Override
		public AfterActiveStep setActive(
			UnsafeSupplier<Boolean, Exception> activeUnsafeSupplier) {

			try {
				Boolean active = activeUnsafeSupplier.get();

				if (active != null) {
					_verticalNavItem.setActive(active.booleanValue());
				}

				return this;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		}

		@Override
		public AfterSetDataStep setData(Map<String, Object> data) {
			_verticalNavItem.setData(data);

			return this;
		}

		@Override
		public AfterDisabledStep setDisabled(boolean disabled) {
			_verticalNavItem.setDisabled(disabled);

			return this;
		}

		@Override
		public AfterDisabledStep setDisabled(
			UnsafeSupplier<Boolean, Exception> disabledUnsafeSupplier) {

			try {
				Boolean disabled = disabledUnsafeSupplier.get();

				if (disabled != null) {
					_verticalNavItem.setDisabled(disabled.booleanValue());
				}

				return this;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		}

		@Override
		public AfterHrefStep setHref(Object href) {
			_verticalNavItem.setHref(href);

			return this;
		}

		@Override
		public AfterHrefStep setHref(
			PortletURL portletURL, Object... parameters) {

			_verticalNavItem.setHref(portletURL, parameters);

			return this;
		}

		@Override
		public AfterHrefStep setHref(
			UnsafeSupplier<Object, Exception> hrefUnsafeSupplier) {

			try {
				Object href = hrefUnsafeSupplier.get();

				if (href != null) {
					_verticalNavItem.setHref(href);
				}

				return this;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		}

		@Override
		public AfterLabelStep setLabel(String label) {
			_verticalNavItem.setLabel(label);

			return this;
		}

		@Override
		public AfterLabelStep setLabel(
			UnsafeSupplier<String, Exception> labelUnsafeSupplier) {

			try {
				String label = labelUnsafeSupplier.get();

				if (label != null) {
					_verticalNavItem.setLabel(label);
				}

				return this;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		}

		private final VerticalNavItem _verticalNavItem = new VerticalNavItem();

	}

	public interface ActiveStep {

		public AfterActiveStep setActive(boolean active);

		public AfterActiveStep setActive(
			UnsafeSupplier<Boolean, Exception> activeUnsafeSupplier);

	}

	public interface AfterActiveStep
		extends BuildStep, DisabledStep, HrefStep, LabelStep, SetDataStep {
	}

	public interface AfterDisabledStep extends BuildStep, HrefStep, LabelStep {
	}

	public interface AfterHrefStep extends BuildStep, LabelStep {
	}

	public interface AfterLabelStep extends BuildStep {
	}

	public interface AfterPutDataStep
		extends ActiveStep, BuildStep, DisabledStep, HrefStep, LabelStep,
				PutDataStep, SetDataStep {
	}

	public interface AfterSetDataStep
		extends BuildStep, DisabledStep, HrefStep, LabelStep {
	}

	public interface BuildStep {

		public VerticalNavItem build();

	}

	public interface DisabledStep {

		public AfterDisabledStep setDisabled(boolean disabled);

		public AfterDisabledStep setDisabled(
			UnsafeSupplier<Boolean, Exception> disabledUnsafeSupplier);

	}

	public interface HrefStep {

		public AfterHrefStep setHref(Object href);

		public AfterHrefStep setHref(
			PortletURL portletURL, Object... parameters);

		public AfterHrefStep setHref(
			UnsafeSupplier<Object, Exception> hrefUnsafeSupplier);

	}

	public interface LabelStep {

		public AfterLabelStep setLabel(String label);

		public AfterLabelStep setLabel(
			UnsafeSupplier<String, Exception> labelUnsafeSupplier);

	}

	public interface PutDataStep {

		public AfterPutDataStep putData(String key, String value);

		public AfterPutDataStep putData(
			String key, UnsafeSupplier<String, Exception> valueUnsafeSupplier);

	}

	public interface SetDataStep {

		public AfterSetDataStep setData(Map<String, Object> data);

	}

}