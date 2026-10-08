--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_p'
--
SELECT hc/tags FROM com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_p WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_p'
--
INSERT INTO com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_p (hc/tags) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_p'
--
UPDATE com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_p SET hc/tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_p'
--
DELETE FROM com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_p WHERE 1=2;

