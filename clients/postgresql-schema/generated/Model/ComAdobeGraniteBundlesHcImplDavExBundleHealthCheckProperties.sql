--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check_pr'
--
SELECT hc/tags FROM com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check_pr'
--
INSERT INTO com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check_pr (hc/tags) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check_pr'
--
UPDATE com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check_pr SET hc/tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check_pr'
--
DELETE FROM com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check_pr WHERE 1=2;

