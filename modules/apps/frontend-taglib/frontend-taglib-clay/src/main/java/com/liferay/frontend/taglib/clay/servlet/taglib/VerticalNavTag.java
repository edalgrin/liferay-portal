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

package com.liferay.frontend.taglib.clay.servlet.taglib;

import com.liferay.frontend.taglib.clay.internal.servlet.taglib.BaseContainerTag;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.VerticalNavItem;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

/**
 * @author Eduardo Allegrini
 */
public class VerticalNavTag extends BaseContainerTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		setContainerElement("nav");

		return super.doStartTag();
	}

	public String getActivation() {
		return _activation;
	}

	public String getActive() {
		return _active;
	}

	public boolean getDecorated() {
		return _decorated;
	}

	public List<VerticalNavItem> getItems() {
		return _items;
	}

	public boolean getLarge() {
		return _large;
	}

	public String getTriggerLabel() {
		return _triggerLabel;
	}

	public void setActivation(String activation) {
		_activation = activation;
	}

	public void setActive(String active) {
		_active = active;
	}

	public void setDecorated(boolean decorated) {
		_decorated = decorated;
	}

	public void setItems(List<VerticalNavItem> items) {
		_items = items;
	}

	public void setLarge(boolean large) {
		_large = large;
	}

	public void setTriggerLabel(String triggerLabel) {
		_triggerLabel = triggerLabel;
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_activation = "manual";
		_active = null;
		_decorated = false;
		_items = null;
		_large = false;
		_triggerLabel = null;
	}

	@Override
	protected String getHydratedModuleName() {
		return "{VerticalNav} from frontend-taglib-clay";
	}

	@Override
	protected Map<String, Object> prepareProps(Map<String, Object> props) {
		props.put("active", _active);
		props.put("activation", _activation);
		props.put("decorated", _decorated);
		props.put("large", _large);
		props.put("items", _items);
		props.put("triggerLabel", _triggerLabel);

		return super.prepareProps(props);
	}

	@Override
	protected String processCssClasses(Set<String> cssClasses) {
		cssClasses.add("menubar menubar-transparent");

		if (_decorated) {
			cssClasses.add("menubar-decorated");
		}

		cssClasses.add(
			_large ? "menubar-vertical-expand-lg" :
				"menubar-vertical-expand-md");

		return super.processCssClasses(cssClasses);
	}

	@Override
	protected int processStartTag() throws Exception {
		super.processStartTag();

		JspWriter jspWriter = pageContext.getOut();

		jspWriter.write(
			"<button class=\"menubar-toggler btn btn-unstyled\" type=\"button\">");
		jspWriter.write(
			"<span class=\"inline-item inline-item-before\">Menu</span>");
		jspWriter.write("ICON");
		jspWriter.write("</button>");

		jspWriter.write("<div class=\"collapse menubar-collapse\">");

		jspWriter.write(
			"<ul aria-orientation=\"vertical\" role=\"menubar\" class=\"nav nav-nested\">");

		IconTag iconTag = new IconTag();

		for (VerticalNavItem item : _items) {
			String itemLabel = (String)item.get("label");
			String itemHref = (String)item.get("href");
			List<VerticalNavItem> itemChildren = (List<VerticalNavItem>)item.get("items");

			jspWriter.write("<li role=\"none\" class=\"nav-item\">");
			// if (itemChildren) {tag = button} else {
			jspWriter.write(
				"<a class=\"nav-link collapse-icon collapsed btn btn-unstyled\" type=\"button\" aria-expanded=\"false\" aria-haspopup=\"true\" role=\"button\" tabindex=\"-1\" href=\"");
			jspWriter.write(itemHref);
			jspWriter.write("\">");
			jspWriter.write(itemLabel);

			jspWriter.write("<span class=\"collapse-icon-closed\">");
			iconTag.setSymbol("angle-right");
			iconTag.doTag(pageContext);
			jspWriter.write("</span>");

			jspWriter.write("<span class=\"collapse-icon-open\">");
			iconTag.setSymbol("angle-down");
			iconTag.doTag(pageContext);
			jspWriter.write("</span></a>");

			if (Validator.isNotNull(itemChildren)) {
				jspWriter.write("<ul role=\"menu\" class=\"nav nav-stacked\">");
				for (VerticalNavItem itemChild : itemChildren) {
					String itemChildLabel = (String)itemChild.get("label");
					String itemChildHref = (String)itemChild.get("href");

					jspWriter.write("<li role=\"none\" class=\"nav-item\">");
					jspWriter.write("<a class=\"nav-link active collapsed\" role=\"menuitem\" href=\"");
					jspWriter.write(itemChildHref);
					jspWriter.write("\" aria-current=\"page\">");
					jspWriter.write(itemChildLabel);
					jspWriter.write("</a></li>");
				}
				jspWriter.write("</ul>");
			}

			jspWriter.write("</li>");
		}

		jspWriter.write("</ul>");

		jspWriter.write("</div>");

		return SKIP_BODY;
	}

	private static final String _ATTRIBUTE_NAMESPACE = "clay:vertical-nav:";

	private String _activation = "manual";
	private String _active;
	private boolean _decorated;
	private List<VerticalNavItem> _items;
	private boolean _large;
	private String _triggerLabel;

}