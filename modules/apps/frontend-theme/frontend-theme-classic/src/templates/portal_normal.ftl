<!DOCTYPE html>

<#include init />

<html class="${root_css_class} theme-classic" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${html_title}</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<div class="d-flex flex-column min-vh-100">
	<@liferay.control_menu />

	<div id="wrapper" class="d-flex flex-column flex-fill">
		<#if show_header>
			<#--  <#assign preferences = freeMarkerPortletPreferences.getPreferences({"portletSetupPortletDecoratorId": "barebone", "destination": "/search"})}" />  -->

			<header id="banner" class="border-bottom border-light navbar-expand-md py-3">
				<div class="container-fluid container-fluid-max-xl portlet-container-no-margin">
					<div class="d-flex flex-column-reverse flex-md-row">
						<div class="align-items-center d-inline-flex">
							<a class="${logo_css_class} align-items-center d-inline-flex text-decoration-none"
								href="${site_default_url}"
								title='<@liferay.language_format arguments="" key="go-to-x" />'>
								<img alt="${logo_description}" height="56" src="${site_logo}" />

								<#if show_site_name>
									<h1 class="font-weight-bold h2 mb-0 text-dark ml-2">${site_name}</h1>
								</#if>
							</a>

							<#if has_navigation && is_setup_complete>
								<button aria-controls="navigationCollapse"
										aria-expanded="false"
										aria-label="Toggle navigation"
										class="btn navbar-toggler ml-auto collapsed"
										data-target="#navigationCollapse"
										data-toggle="liferay-collapse"
										type="button"
									>
									<span class="c-inner" tabindex="-1">
										<svg aria-hidden="true" class="lexicon-icon lexicon-icon-bars" viewBox="0 0 512 512">
											<path class="lexicon-icon-outline bars-line-top" d="M480 64h-448c-17.664 0-32-14.336-32-32v0c0-17.664 14.336-32 32-32h448c17.664 0 32 14.336 32 32v0c0 17.664-14.336 32-32 32z"></path>
											<path class="lexicon-icon-outline bars-line-middle" d="M480 288h-448c-17.664 0-32-14.336-32-32v0c0-17.664 14.336-32 32-32h448c17.664 0 32 14.336 32 32v0c0 17.664-14.336 32-32 32z"></path>
											<path class="lexicon-icon-outline bars-line-bottom" d="M480 512h-448c-17.664 0-32-14.336-32-32v0c0-17.664 14.336-32 32-32h448c17.664 0 32 14.336 32 32v0c0 17.664-14.336 32-32 32z"></path>
										</svg>
										<svg aria-hidden="true" class="lexicon-icon lexicon-icon-times" viewBox="0 0 512 512">
											<path class="lexicon-icon-outline" d="M300.4,256L467,89.4c29.6-29.6-14.8-74.1-44.4-44.4L256,211.6L89.4,45C59.8,15.3,15.3,59.8,45,89.4L211.6,256L45,422.6 c-29.7,29.7,14.7,74.1,44.4,44.4L256,300.4L422.6,467c29.7,29.7,74.1-14.7,44.4-44.4L300.4,256z"></path>
										</svg>
									</span>
								</button>
							</#if>
						</div>

						<div class="align-items-center d-inline-flex justify-content-end ml-md-auto mb-3 mb-md-0">
							<#if show_header_search>
								<div class="flex-fill mr-3">
									<@liferay.search_bar />
									<#--  <@liferay.search_bar default_preferences="${preferences}" />  -->
								</div>
							</#if>

							<@liferay.user_personal_bar />
						</div>
					</div>

					<#if has_navigation && is_setup_complete>
						<div class="collapse navbar-collapse navigation-bar-light border-0 order-1 w-100 mt-3" id="navigationCollapse">
							<@liferay.navigation_menu />
							<#--  <@liferay.navigation_menu default_preferences="${preferences}" />  -->
						</div>
					</#if>
				</div>
			</header>
		</#if>

		<section class="${portal_content_css_class} flex-fill" id="content">
			<h2 class="sr-only" role="heading" aria-level="1">${the_title}</h2>

			<#if selectable>
				<@liferay_util["include"] page=content_include />
			<#else>
				${portletDisplay.recycle()}

				${portletDisplay.setTitle(the_title)}

				<@liferay_theme["wrap-portlet"] page="portlet.ftl">
					<@liferay_util["include"] page=content_include />
				</@>
			</#if>
		</section>

		<#if show_footer>
			<footer id="footer" role="contentinfo" class="bg-dark text-white py-5 mt-3">
				<div class="container">
					<div class="row">
						<div class="col-md-12 text-center text-md-left">
							<@liferay.language key="powered-by" />

							<a class="text-white" href="http://www.liferay.com" rel="external">Liferay</a>
						</div>
					</div>
				</div>
			</footer>
		</#if>
	</div>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

</body>

</html>