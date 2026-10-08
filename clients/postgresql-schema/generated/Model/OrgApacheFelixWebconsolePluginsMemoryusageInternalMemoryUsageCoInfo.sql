--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_webconsole_plugins_memoryusage_internal_memory'
--
SELECT pid, title, description, properties FROM org_apache_felix_webconsole_plugins_memoryusage_internal_memory WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_webconsole_plugins_memoryusage_internal_memory'
--
INSERT INTO org_apache_felix_webconsole_plugins_memoryusage_internal_memory (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_webconsole_plugins_memoryusage_internal_memory'
--
UPDATE org_apache_felix_webconsole_plugins_memoryusage_internal_memory SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_webconsole_plugins_memoryusage_internal_memory'
--
DELETE FROM org_apache_felix_webconsole_plugins_memoryusage_internal_memory WHERE 1=2;

