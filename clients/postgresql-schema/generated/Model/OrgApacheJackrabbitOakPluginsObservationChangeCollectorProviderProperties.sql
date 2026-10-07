--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_observation_change_collector_'
--
SELECT max_items, max_path_depth, enabled FROM org_apache_jackrabbit_oak_plugins_observation_change_collector_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_observation_change_collector_'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_observation_change_collector_ (max_items, max_path_depth, enabled) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_observation_change_collector_'
--
UPDATE org_apache_jackrabbit_oak_plugins_observation_change_collector_ SET max_items = ?, max_path_depth = ?, enabled = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_observation_change_collector_'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_observation_change_collector_ WHERE 1=2;

