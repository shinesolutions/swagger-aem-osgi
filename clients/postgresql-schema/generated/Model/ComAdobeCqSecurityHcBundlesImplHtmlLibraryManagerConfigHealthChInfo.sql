--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_security_hc_bundles_impl_html_library_manager_conf'
--
SELECT pid, title, description, properties FROM com_adobe_cq_security_hc_bundles_impl_html_library_manager_conf WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_security_hc_bundles_impl_html_library_manager_conf'
--
INSERT INTO com_adobe_cq_security_hc_bundles_impl_html_library_manager_conf (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_security_hc_bundles_impl_html_library_manager_conf'
--
UPDATE com_adobe_cq_security_hc_bundles_impl_html_library_manager_conf SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_security_hc_bundles_impl_html_library_manager_conf'
--
DELETE FROM com_adobe_cq_security_hc_bundles_impl_html_library_manager_conf WHERE 1=2;

