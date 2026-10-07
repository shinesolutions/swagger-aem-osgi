--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_reporting_analytics_services_impl_site_tren'
--
SELECT cq/social/console/analytics/sites/mapping, priority FROM com_adobe_cq_social_reporting_analytics_services_impl_site_tren WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_reporting_analytics_services_impl_site_tren'
--
INSERT INTO com_adobe_cq_social_reporting_analytics_services_impl_site_tren (cq/social/console/analytics/sites/mapping, priority) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_reporting_analytics_services_impl_site_tren'
--
UPDATE com_adobe_cq_social_reporting_analytics_services_impl_site_tren SET cq/social/console/analytics/sites/mapping = ?, priority = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_reporting_analytics_services_impl_site_tren'
--
DELETE FROM com_adobe_cq_social_reporting_analytics_services_impl_site_tren WHERE 1=2;

