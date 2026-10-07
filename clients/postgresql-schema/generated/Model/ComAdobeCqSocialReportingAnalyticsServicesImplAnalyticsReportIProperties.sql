--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_reporting_analytics_services_impl_analytics'
--
SELECT cq/social/reporting/analytics/polling/importer/interval, cq/social/reporting/analytics/polling/importer/page_size FROM com_adobe_cq_social_reporting_analytics_services_impl_analytics WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_reporting_analytics_services_impl_analytics'
--
INSERT INTO com_adobe_cq_social_reporting_analytics_services_impl_analytics (cq/social/reporting/analytics/polling/importer/interval, cq/social/reporting/analytics/polling/importer/page_size) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_reporting_analytics_services_impl_analytics'
--
UPDATE com_adobe_cq_social_reporting_analytics_services_impl_analytics SET cq/social/reporting/analytics/polling/importer/interval = ?, cq/social/reporting/analytics/polling/importer/page_size = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_reporting_analytics_services_impl_analytics'
--
DELETE FROM com_adobe_cq_social_reporting_analytics_services_impl_analytics WHERE 1=2;

