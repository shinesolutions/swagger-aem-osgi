--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixSystemreadySystemReadyMonitorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_systemready_system_ready_monitor_properties'
--
SELECT poll/interval FROM org_apache_felix_systemready_system_ready_monitor_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_systemready_system_ready_monitor_properties'
--
INSERT INTO org_apache_felix_systemready_system_ready_monitor_properties (poll/interval) VALUES (?);

--
-- UPDATE template for table 'org_apache_felix_systemready_system_ready_monitor_properties'
--
UPDATE org_apache_felix_systemready_system_ready_monitor_properties SET poll/interval = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_systemready_system_ready_monitor_properties'
--
DELETE FROM org_apache_felix_systemready_system_ready_monitor_properties WHERE 1=2;

