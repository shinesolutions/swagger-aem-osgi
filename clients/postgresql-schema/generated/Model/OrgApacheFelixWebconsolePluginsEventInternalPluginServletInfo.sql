--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixWebconsolePluginsEventInternalPluginServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_webconsole_plugins_event_internal_plugin_servl'
--
SELECT pid, title, description, properties FROM org_apache_felix_webconsole_plugins_event_internal_plugin_servl WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_webconsole_plugins_event_internal_plugin_servl'
--
INSERT INTO org_apache_felix_webconsole_plugins_event_internal_plugin_servl (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_webconsole_plugins_event_internal_plugin_servl'
--
UPDATE org_apache_felix_webconsole_plugins_event_internal_plugin_servl SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_webconsole_plugins_event_internal_plugin_servl'
--
DELETE FROM org_apache_felix_webconsole_plugins_event_internal_plugin_servl WHERE 1=2;

