--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqContentinsightImplReportingServicesSettingsProviderInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_contentinsight_impl_reporting_services_settings_pr'
--
SELECT pid, title, description, properties FROM com_adobe_cq_contentinsight_impl_reporting_services_settings_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_contentinsight_impl_reporting_services_settings_pr'
--
INSERT INTO com_adobe_cq_contentinsight_impl_reporting_services_settings_pr (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_contentinsight_impl_reporting_services_settings_pr'
--
UPDATE com_adobe_cq_contentinsight_impl_reporting_services_settings_pr SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_contentinsight_impl_reporting_services_settings_pr'
--
DELETE FROM com_adobe_cq_contentinsight_impl_reporting_services_settings_pr WHERE 1=2;

