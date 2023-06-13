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
import com.liferay.frontend.taglib.clay.servlet.taglib.util.NavigationItem;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.util.TagResourceBundleUtil;

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

	@Override
	protected String processCssClasses(Set<String> cssClasses) {
		cssClasses.add("menubar menubar-transparent");

		if (_decorated) {
			cssClasses.add("menubar-decorated");
		}

		cssClasses.add(
			_large ? "menubar-vertical-expand-lg" : "menubar-vertical-expand-md");

		return super.processCssClasses(cssClasses);
	}

	@Override
	protected int processStartTag() throws Exception {
		super.processStartTag();

		JspWriter jspWriter = pageContext.getOut();

		jspWriter.write("<button class=\"menubar-toggler btn btn-unstyled\" type=\"button\">");
		jspWriter.write("<span class=\"inline-item inline-item-before\">Menu</span>");
		jspWriter.write("ICON");
		jspWriter.write("</button>");

		jspWriter.write("<div class=\"collapse menubar-collapse\">");

		jspWriter.write("<ul aria-orientation=\"vertical\" role=\"menubar\" class=\"nav nav-nested\">");


		for (int i = 0; i < _items.size(); i++) {
				NavigationItem navigationItem = _items.get(i);

				jspWriter.write("<li class=\"nav-item\"");
				jspWriter.write(" data-nav-item-index=\"");
				jspWriter.write(String.valueOf(i));
				jspWriter.write("\"><a class=\"nav-link");

				if ((navigationItem.get("active") != null) &&
					(Boolean)navigationItem.get("active")) {

					jspWriter.write(" active");
				}

				jspWriter.write("\"");

				if (Validator.isNotNull((String)navigationItem.get("href"))) {
					jspWriter.write(" href=\"");
					jspWriter.write((String)navigationItem.get("href"));
					jspWriter.write("\"");
				}

				jspWriter.write("><span class=\"navbar-text-truncate\">");
				jspWriter.write((String)navigationItem.get("label"));
				jspWriter.write("</span></a></li>");
			}

		// jspWriter.write("<li role=\"none\" class=\"nav-item\">");
		// jspWriter.write("<button class=\"nav-link collapse-icon collapsed btn btn-unstyled\" type=\"button\" aria-expanded=\"false\" aria-haspopup=\"true\" role=\"button\" tabindex=\"-1\">");
		// jspWriter.write("Home");
		// jspWriter.write("<span class=\"collapse-icon-closed\">");
		// jspWriter.write("ICON");
		// jspWriter.write("</span>");
		// jspWriter.write("<span class=\"collapse-icon-open\">");
		// jspWriter.write("ICON");
		// jspWriter.write("</span>");
		// jspWriter.write("</button>");
		// jspWriter.write("</li>");

		// jspWriter.write("<li role=\"none\" class=\"nav-item\">");
		// jspWriter.write("<button class=\"nav-link collapse-icon collapsed btn btn-unstyled\" type=\"button\" aria-expanded=\"false\" aria-haspopup=\"true\" role=\"button\" tabindex=\"-1\">");
		// jspWriter.write("Second");
		// jspWriter.write("<span class=\"collapse-icon-closed\">");
		// jspWriter.write("ICON");
		// jspWriter.write("</span>");
		// jspWriter.write("<span class=\"collapse-icon-open\">");
		// jspWriter.write("ICON");
		// jspWriter.write("</span>");
		// jspWriter.write("</button>");
		// jspWriter.write("</li>");

		jspWriter.write("</ul>");

		jspWriter.write("</div>");

		return EVAL_BODY_INCLUDE;
	}

	private static final String _ATTRIBUTE_NAMESPACE = "clay:vertical-nav:";

	private String _active;
	private boolean _decorated;
	private boolean _large;
	private List<NavigationItem> _items;

}