/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.frontend.data.set.sample.web.internal.display.context;

import com.liferay.frontend.data.set.sample.web.internal.constants.FDSSampleFDSNames;
import com.liferay.frontend.data.set.sample.web.internal.view.util.FDSViewSerializerUtil;
import com.liferay.frontend.data.set.view.FDSViewSerializer;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Eduardo Allegrini
 */
public class EmptyStateFDSDisplayContext {

	public EmptyStateFDSDisplayContext(HttpServletRequest httpServletRequest) {
		_httpServletRequest = httpServletRequest;
	}

	public Object getViews() {
		FDSViewSerializer fdsViewSerializer =
			FDSViewSerializerUtil.getFDSViewSerializer();

		return fdsViewSerializer.serialize(
			FDSSampleFDSNames.EMPTYSTATE,
			PortalUtil.getLocale(_httpServletRequest));
	}

	private final HttpServletRequest _httpServletRequest;

}