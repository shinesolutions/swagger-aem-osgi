--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqScheduledExporterImplScheduledExporterImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_pr'
--
SELECT include/paths, exporter/user FROM com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_pr'
--
INSERT INTO com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_pr (include/paths, exporter/user) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_pr'
--
UPDATE com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_pr SET include/paths = ?, exporter/user = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_pr'
--
DELETE FROM com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_pr WHERE 1=2;

