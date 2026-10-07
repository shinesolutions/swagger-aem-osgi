--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_'
--
SELECT htmllibmanager/timing, htmllibmanager/debug/init/js, htmllibmanager/minify, htmllibmanager/debug, htmllibmanager/gzip, htmllibmanager/max_data_uri_size, htmllibmanager/maxage, htmllibmanager/force_cq_url_info, htmllibmanager/defaultthemename, htmllibmanager/defaultuserthemename, htmllibmanager/clientmanager, htmllibmanager/path/list, htmllibmanager/excluded/path/list, htmllibmanager/processor/js, htmllibmanager/processor/css, htmllibmanager/longcache/patterns, htmllibmanager/longcache/format, htmllibmanager/use_file_system_output_cache, htmllibmanager/file_system_output_cache_location, htmllibmanager/disable/replacement FROM com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_'
--
INSERT INTO com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_ (htmllibmanager/timing, htmllibmanager/debug/init/js, htmllibmanager/minify, htmllibmanager/debug, htmllibmanager/gzip, htmllibmanager/max_data_uri_size, htmllibmanager/maxage, htmllibmanager/force_cq_url_info, htmllibmanager/defaultthemename, htmllibmanager/defaultuserthemename, htmllibmanager/clientmanager, htmllibmanager/path/list, htmllibmanager/excluded/path/list, htmllibmanager/processor/js, htmllibmanager/processor/css, htmllibmanager/longcache/patterns, htmllibmanager/longcache/format, htmllibmanager/use_file_system_output_cache, htmllibmanager/file_system_output_cache_location, htmllibmanager/disable/replacement) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_'
--
UPDATE com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_ SET htmllibmanager/timing = ?, htmllibmanager/debug/init/js = ?, htmllibmanager/minify = ?, htmllibmanager/debug = ?, htmllibmanager/gzip = ?, htmllibmanager/max_data_uri_size = ?, htmllibmanager/maxage = ?, htmllibmanager/force_cq_url_info = ?, htmllibmanager/defaultthemename = ?, htmllibmanager/defaultuserthemename = ?, htmllibmanager/clientmanager = ?, htmllibmanager/path/list = ?, htmllibmanager/excluded/path/list = ?, htmllibmanager/processor/js = ?, htmllibmanager/processor/css = ?, htmllibmanager/longcache/patterns = ?, htmllibmanager/longcache/format = ?, htmllibmanager/use_file_system_output_cache = ?, htmllibmanager/file_system_output_cache_location = ?, htmllibmanager/disable/replacement = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_'
--
DELETE FROM com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_ WHERE 1=2;

