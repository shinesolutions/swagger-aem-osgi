--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_contentinsight_impl_servlets_reporting_services_pr'
--
SELECT reportingservices/proxy/whitelist FROM com_adobe_cq_contentinsight_impl_servlets_reporting_services_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_contentinsight_impl_servlets_reporting_services_pr'
--
INSERT INTO com_adobe_cq_contentinsight_impl_servlets_reporting_services_pr (reportingservices/proxy/whitelist) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_contentinsight_impl_servlets_reporting_services_pr'
--
UPDATE com_adobe_cq_contentinsight_impl_servlets_reporting_services_pr SET reportingservices/proxy/whitelist = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_contentinsight_impl_servlets_reporting_services_pr'
--
DELETE FROM com_adobe_cq_contentinsight_impl_servlets_reporting_services_pr WHERE 1=2;

