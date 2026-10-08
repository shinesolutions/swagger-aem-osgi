--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_reporting_analytics_services_impl_site_tren'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_reporting_analytics_services_impl_site_tren WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_reporting_analytics_services_impl_site_tren'
--
INSERT INTO com_adobe_cq_social_reporting_analytics_services_impl_site_tren (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_reporting_analytics_services_impl_site_tren'
--
UPDATE com_adobe_cq_social_reporting_analytics_services_impl_site_tren SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_reporting_analytics_services_impl_site_tren'
--
DELETE FROM com_adobe_cq_social_reporting_analytics_services_impl_site_tren WHERE 1=2;

