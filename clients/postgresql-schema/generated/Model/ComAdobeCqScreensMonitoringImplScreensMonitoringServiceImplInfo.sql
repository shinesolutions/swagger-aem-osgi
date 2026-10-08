--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_screens_monitoring_impl_screens_monitoring_service'
--
SELECT pid, title, description, properties FROM com_adobe_cq_screens_monitoring_impl_screens_monitoring_service WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_screens_monitoring_impl_screens_monitoring_service'
--
INSERT INTO com_adobe_cq_screens_monitoring_impl_screens_monitoring_service (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_screens_monitoring_impl_screens_monitoring_service'
--
UPDATE com_adobe_cq_screens_monitoring_impl_screens_monitoring_service SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_screens_monitoring_impl_screens_monitoring_service'
--
DELETE FROM com_adobe_cq_screens_monitoring_impl_screens_monitoring_service WHERE 1=2;

