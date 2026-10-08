--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check_p'
--
SELECT hc/tags FROM com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check_p WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check_p'
--
INSERT INTO com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check_p (hc/tags) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check_p'
--
UPDATE com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check_p SET hc/tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check_p'
--
DELETE FROM com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check_p WHERE 1=2;

