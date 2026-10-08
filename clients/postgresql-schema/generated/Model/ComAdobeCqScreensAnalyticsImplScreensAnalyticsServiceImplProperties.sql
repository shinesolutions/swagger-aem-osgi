--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_screens_analytics_impl_screens_analytics_service_i'
--
SELECT com/adobe/cq/screens/analytics/impl/url, com/adobe/cq/screens/analytics/impl/apikey, com/adobe/cq/screens/analytics/impl/project, com/adobe/cq/screens/analytics/impl/environment, com/adobe/cq/screens/analytics/impl/send_frequency FROM com_adobe_cq_screens_analytics_impl_screens_analytics_service_i WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_screens_analytics_impl_screens_analytics_service_i'
--
INSERT INTO com_adobe_cq_screens_analytics_impl_screens_analytics_service_i (com/adobe/cq/screens/analytics/impl/url, com/adobe/cq/screens/analytics/impl/apikey, com/adobe/cq/screens/analytics/impl/project, com/adobe/cq/screens/analytics/impl/environment, com/adobe/cq/screens/analytics/impl/send_frequency) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_screens_analytics_impl_screens_analytics_service_i'
--
UPDATE com_adobe_cq_screens_analytics_impl_screens_analytics_service_i SET com/adobe/cq/screens/analytics/impl/url = ?, com/adobe/cq/screens/analytics/impl/apikey = ?, com/adobe/cq/screens/analytics/impl/project = ?, com/adobe/cq/screens/analytics/impl/environment = ?, com/adobe/cq/screens/analytics/impl/send_frequency = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_screens_analytics_impl_screens_analytics_service_i'
--
DELETE FROM com_adobe_cq_screens_analytics_impl_screens_analytics_service_i WHERE 1=2;

