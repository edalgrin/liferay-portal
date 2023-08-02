/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {FrontendDataSet} from '@liferay/frontend-data-set-web';
import React from 'react';

const SampleEmptyStateFrontendDataSet = ({items, ...otherProps}) => {
	return (
		<FrontendDataSet
			creationMenu={{
				primaryItems: [
					{
						label: Liferay.Language.get('new-data-set'),
						onClick: () => {
							alert('New Data Set Modal');
						},
					},
				],
			}}
			emptyState={{
				description: Liferay.Language.get(
					'start-creating-one-to-show-your-data'
				),
				image: '/states/empty_state.gif',
				title: Liferay.Language.get('no-data-sets-created'),
			}}
			items={[]}
			{...otherProps}
		/>
	);
};

export default SampleEmptyStateFrontendDataSet;
