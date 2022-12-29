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

import ClayButton from '@clayui/button';
import {openCookieConfigurationModal} from '@liferay/cookies-banner-web';
import {getCookie, openToast} from 'frontend-js-web';
import React from 'react';

const CompareButtonClick = (openModal) => {
	const requiredCookies = getCookie('CONSENT_TYPE_FUNCTIONAL');

	if (requiredCookies === 'true') {
		openToast({
			message: Liferay.Language.get(
				'cookies-accepted-it-s-now-possibile-to-use-the-compare-function'
			),
			type: 'success',
		});
	} else if (openModal) {
		openCookieConfigurationModal({
			alertDisplayType: 'info',
			alertMessage:
				'the-compare-function-requires-acceptance-of-functional-cookies',
			customTitle: Liferay.Language.get(
				'product-comparison-uses-non-essential-cookies'
			),
			onCloseFunction: () => {
				CompareButtonClick();
			},
		});
	} else {
		openToast({
			message: Liferay.Language.get(
				'cookies-rejected-without-cookies-acceptance-it-s-not-possibile-to-use-compare-function'
			),
			type: 'warning',
		});
	}
};

const Cookie = () => {
	return (
		<>
			<ClayButton
				displayType="secondary"
				onClick={() => {
					openCookieConfigurationModal({});
				}}
			>
				Default Modal
			</ClayButton>

			<ClayButton
				onClick={() => {
					CompareButtonClick(true);
				}}
			>
				Compare Button
			</ClayButton>
		</>
	);
};

export default Cookie;
