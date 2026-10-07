--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check'
--
SELECT hc/tags, ignored/bundles FROM com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check'
--
INSERT INTO com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check (hc/tags, ignored/bundles) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check'
--
UPDATE com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check SET hc/tags = ?, ignored/bundles = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check'
--
DELETE FROM com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check WHERE 1=2;

