--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixScrScrServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_scr_scr_service_properties'
--
SELECT ds/loglevel, ds/factory/enabled, ds/delayed/keep_instances, ds/lock/timeout/milliseconds, ds/stop/timeout/milliseconds, ds/global/extender FROM org_apache_felix_scr_scr_service_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_scr_scr_service_properties'
--
INSERT INTO org_apache_felix_scr_scr_service_properties (ds/loglevel, ds/factory/enabled, ds/delayed/keep_instances, ds/lock/timeout/milliseconds, ds/stop/timeout/milliseconds, ds/global/extender) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_scr_scr_service_properties'
--
UPDATE org_apache_felix_scr_scr_service_properties SET ds/loglevel = ?, ds/factory/enabled = ?, ds/delayed/keep_instances = ?, ds/lock/timeout/milliseconds = ?, ds/stop/timeout/milliseconds = ?, ds/global/extender = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_scr_scr_service_properties'
--
DELETE FROM org_apache_felix_scr_scr_service_properties WHERE 1=2;

