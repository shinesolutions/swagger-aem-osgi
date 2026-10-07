--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWidgetImplHtmlLibraryManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_widget_impl_html_library_manager_impl_properties'
--
SELECT htmllibmanager/clientmanager, htmllibmanager/debug, htmllibmanager/debug/console, htmllibmanager/debug/init/js, htmllibmanager/defaultthemename, htmllibmanager/defaultuserthemename, htmllibmanager/firebuglite/path, htmllibmanager/force_cq_url_info, htmllibmanager/gzip, htmllibmanager/maxage, htmllibmanager/max_data_uri_size, htmllibmanager/minify, htmllibmanager/path/list, htmllibmanager/timing FROM com_day_cq_widget_impl_html_library_manager_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_widget_impl_html_library_manager_impl_properties'
--
INSERT INTO com_day_cq_widget_impl_html_library_manager_impl_properties (htmllibmanager/clientmanager, htmllibmanager/debug, htmllibmanager/debug/console, htmllibmanager/debug/init/js, htmllibmanager/defaultthemename, htmllibmanager/defaultuserthemename, htmllibmanager/firebuglite/path, htmllibmanager/force_cq_url_info, htmllibmanager/gzip, htmllibmanager/maxage, htmllibmanager/max_data_uri_size, htmllibmanager/minify, htmllibmanager/path/list, htmllibmanager/timing) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_widget_impl_html_library_manager_impl_properties'
--
UPDATE com_day_cq_widget_impl_html_library_manager_impl_properties SET htmllibmanager/clientmanager = ?, htmllibmanager/debug = ?, htmllibmanager/debug/console = ?, htmllibmanager/debug/init/js = ?, htmllibmanager/defaultthemename = ?, htmllibmanager/defaultuserthemename = ?, htmllibmanager/firebuglite/path = ?, htmllibmanager/force_cq_url_info = ?, htmllibmanager/gzip = ?, htmllibmanager/maxage = ?, htmllibmanager/max_data_uri_size = ?, htmllibmanager/minify = ?, htmllibmanager/path/list = ?, htmllibmanager/timing = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_widget_impl_html_library_manager_impl_properties'
--
DELETE FROM com_day_cq_widget_impl_html_library_manager_impl_properties WHERE 1=2;

