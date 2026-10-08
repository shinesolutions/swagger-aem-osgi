--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_contentinsight_impl_reporting_services_settings_pr'
--
SELECT reportingservices/url FROM com_adobe_cq_contentinsight_impl_reporting_services_settings_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_contentinsight_impl_reporting_services_settings_pr'
--
INSERT INTO com_adobe_cq_contentinsight_impl_reporting_services_settings_pr (reportingservices/url) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_contentinsight_impl_reporting_services_settings_pr'
--
UPDATE com_adobe_cq_contentinsight_impl_reporting_services_settings_pr SET reportingservices/url = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_contentinsight_impl_reporting_services_settings_pr'
--
DELETE FROM com_adobe_cq_contentinsight_impl_reporting_services_settings_pr WHERE 1=2;

