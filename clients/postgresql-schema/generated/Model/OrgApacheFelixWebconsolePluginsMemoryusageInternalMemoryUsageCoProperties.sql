--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_webconsole_plugins_memoryusage_internal_memory'
--
SELECT felix/memoryusage/dump/threshold, felix/memoryusage/dump/interval, felix/memoryusage/dump/location FROM org_apache_felix_webconsole_plugins_memoryusage_internal_memory WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_webconsole_plugins_memoryusage_internal_memory'
--
INSERT INTO org_apache_felix_webconsole_plugins_memoryusage_internal_memory (felix/memoryusage/dump/threshold, felix/memoryusage/dump/interval, felix/memoryusage/dump/location) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_webconsole_plugins_memoryusage_internal_memory'
--
UPDATE org_apache_felix_webconsole_plugins_memoryusage_internal_memory SET felix/memoryusage/dump/threshold = ?, felix/memoryusage/dump/interval = ?, felix/memoryusage/dump/location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_webconsole_plugins_memoryusage_internal_memory'
--
DELETE FROM org_apache_felix_webconsole_plugins_memoryusage_internal_memory WHERE 1=2;

