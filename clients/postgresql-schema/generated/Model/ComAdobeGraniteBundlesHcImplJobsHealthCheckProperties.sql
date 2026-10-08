--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplJobsHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_bundles_hc_impl_jobs_health_check_properties'
--
SELECT hc/tags, max/queued/jobs FROM com_adobe_granite_bundles_hc_impl_jobs_health_check_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_bundles_hc_impl_jobs_health_check_properties'
--
INSERT INTO com_adobe_granite_bundles_hc_impl_jobs_health_check_properties (hc/tags, max/queued/jobs) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_bundles_hc_impl_jobs_health_check_properties'
--
UPDATE com_adobe_granite_bundles_hc_impl_jobs_health_check_properties SET hc/tags = ?, max/queued/jobs = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_bundles_hc_impl_jobs_health_check_properties'
--
DELETE FROM com_adobe_granite_bundles_hc_impl_jobs_health_check_properties WHERE 1=2;

