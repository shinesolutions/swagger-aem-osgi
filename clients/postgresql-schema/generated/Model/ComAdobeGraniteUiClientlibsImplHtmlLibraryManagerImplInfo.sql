--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_'
--
INSERT INTO com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_ (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_'
--
UPDATE com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_ SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_'
--
DELETE FROM com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_ WHERE 1=2;

