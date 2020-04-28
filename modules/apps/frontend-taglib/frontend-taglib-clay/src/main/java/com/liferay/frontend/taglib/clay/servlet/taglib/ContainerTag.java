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

import com.liferay.frontend.taglib.clay.internal.servlet.ServletContextUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

/**
 * @author Chema Balsas
 */
public class ContainerTag extends IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public String getCssClass() {
		return _cssClass;
	}

	public boolean getFluid() {
		return _fluid;
	}

	public String getId() {
		return _id;
	}

	public boolean getPadding() {
		return _padding;
	}

	public void setCssClass(String cssClass) {
		_cssClass = cssClass;
	}

	public void setFluid(boolean fluid) {
		_fluid = fluid;
	}

	public void setId(String id) {
		_id = id;
	}

	public void setPadding(boolean padding) {
		_padding = padding;
	}

	@Override
	public void setPageContext(PageContext pageContext) {
		super.setPageContext(pageContext);

		servletContext = ServletContextUtil.getServletContext();
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_cssClass = null;
		_fluid = false;
		_id = null;
		_padding = true;
	}

	@Override
	protected String getEndPage() {
		return _END_PAGE;
	}

	@Override
	protected String getStartPage() {
		return _START_PAGE;
	}

	@Override
	protected boolean isCleanUpSetAttributes() {
		return _CLEAN_UP_SET_ATTRIBUTES;
	}

	@Override
	protected int processEndTag() throws Exception {
		JspWriter jspWriter = pageContext.getOut();

		jspWriter.write("</div>");

		return EVAL_BODY_INCLUDE;
	}

	@Override
	protected int processStartTag() throws Exception {
		JspWriter jspWriter = pageContext.getOut();

		jspWriter.write("<div");

		String cssClass = "container";

		if (_fluid) {
			cssClass += "-fluid container-fluid-max-xl";
		}

		if (Validator.isNotNull(_cssClass)) {
			cssClass += " " + _cssClass;
		}

		jspWriter.write(" class=\"");
		jspWriter.write(cssClass);
		jspWriter.write("\"");

		if (Validator.isNotNull(_id)) {
			jspWriter.write(" id=\"");
			jspWriter.write(_id);
			jspWriter.write("\"");
		}

		jspWriter.write(">");

		return EVAL_BODY_INCLUDE;
	}

	@Override
	protected void setAttributes(HttpServletRequest httpServletRequest) {
		httpServletRequest.setAttribute("clay:container:cssClass", _cssClass);
		httpServletRequest.setAttribute("clay:container:fluid", _fluid);
		httpServletRequest.setAttribute("clay:container:id", _id);
		httpServletRequest.setAttribute("clay:container:padding", _padding);
	}

	private static final String _ATTRIBUTE_NAMESPACE = "clay:container:";

	private static final boolean _CLEAN_UP_SET_ATTRIBUTES = true;

	private static final String _END_PAGE = "/container/end.jsp";

	private static final String _START_PAGE = "/container/start.jsp";

	private String _cssClass;
	private boolean _fluid = true;
	private String _id;
	private boolean _padding = true;

}