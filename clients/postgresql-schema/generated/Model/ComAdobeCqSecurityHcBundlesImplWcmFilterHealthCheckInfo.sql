--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_i'
--
SELECT pid, title, description, properties FROM com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_i WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_i'
--
INSERT INTO com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_i (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_i'
--
UPDATE com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_i SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_i'
--
DELETE FROM com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_i WHERE 1=2;

