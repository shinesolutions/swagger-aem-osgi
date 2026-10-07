--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_reporting_analytics_services_impl_analytics'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_reporting_analytics_services_impl_analytics WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_reporting_analytics_services_impl_analytics'
--
INSERT INTO com_adobe_cq_social_reporting_analytics_services_impl_analytics (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_reporting_analytics_services_impl_analytics'
--
UPDATE com_adobe_cq_social_reporting_analytics_services_impl_analytics SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_reporting_analytics_services_impl_analytics'
--
DELETE FROM com_adobe_cq_social_reporting_analytics_services_impl_analytics WHERE 1=2;

