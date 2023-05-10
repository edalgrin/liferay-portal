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
import com.liferay.frontend.taglib.clay.servlet.taglib.util.TabsItem;
import com.liferay.petra.string.StringPool;
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
public class PanelTag extends BaseContainerTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);
		setDynamicAttribute(StringPool.BLANK, "role", "tablist");

		return super.doStartTag();
	}

	@Override
	protected String processBodyCssClasses(Set<String> cssClasses) {
		cssClasses.add("panel");

		return super.processBodyCssClasses(cssClasses);
	}

	@Override
	protected int processStartTag() throws Exception {
		super.processStartTag();
		JspWriter jspWriter = pageContext.getOut();

		/*
		jspWriter.write("<button");
				jspWriter.write(" aria-controls=\"collapsePanel\"");
				jspWriter.write(" aria-expanded=\"false\"");
				jspWriter.write(" class=\"btn btn-unstyled panel-header panel-header-link collapse-icon collapse-icon-middle collapsed\"");
				jspWriter.write(" data-target=\"#collapsablePanel\"");
				jspWriter.write(" data-toggle=\"liferay-collapse\"");
				jspWriter.write(" role=\"tab\"");
			jspWriter.write(">");
				jspWriter.write("<span class=\"panel-title\">Toggle me for expanding!</span>");

			IconTag iconTag = new IconTag();
			jspWriter.write("<span class=\"collapse-icon-closed\">");
				iconTag.setSymbol("angle-right");
				iconTag.doTag(pageContext);
			jspWriter.write("</span>");

			jspWriter.write("<span class=\"collapse-icon-open\">");
				iconTag.setSymbol("angle-down");
				iconTag.doTag(pageContext);
			jspWriter.write("</span>");
		jspWriter.write("</button>");
		*/

		ButtonTag buttonTag = new ButtonTag();

		buttonTag.setCssClass("panel-header");
		buttonTag.setCssClass("panel-header-link"); //review
		buttonTag.setCssClass("collapse-icon"); //review
		buttonTag.setCssClass("collapse-icon-middle"); //review
		buttonTag.setCssClass("collapsed"); //auto
		buttonTag.setDisplayType("unstyled");
		//buttonTag.setIcon("angle-right");
		buttonTag.setDynamicAttribute(StringPool.BLANK, "aria-controls", "collapsePanel"); //auto
		buttonTag.setDynamicAttribute(StringPool.BLANK, "data-target", "#collapsablePanel"); //auto
		buttonTag.setDynamicAttribute(StringPool.BLANK, "data-toggle", "liferay-collapse");
		buttonTag.setDynamicAttribute(StringPool.BLANK, "role", "tab");
		buttonTag.setLabel("<span class=\"panel-title\">Toggle me for expanding!</span>"); //dynamic

		buttonTag.doTag(pageContext);

		PanelBodyTag panelBodyTag = new PanelBodyTag();
		panelBodyTag.doTag(pageContext);

		return SKIP_BODY;
	}

	private static final String _ATTRIBUTE_NAMESPACE = "clay:panel:";

	private String _activation = "manual";
	private String _displayType;
	private boolean _fade;
	private boolean _justified;
	private int _panelsCount;
	private List<TabsItem> _tabsItems;

}