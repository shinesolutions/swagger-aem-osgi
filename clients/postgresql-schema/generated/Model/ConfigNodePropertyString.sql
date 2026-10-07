--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'configNodePropertyString' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'config_node_property_string'
--
SELECT "name", optional, is_set, "type", "value", description FROM config_node_property_string WHERE 1=1;

--
-- INSERT template for table 'config_node_property_string'
--
INSERT INTO config_node_property_string ("name", optional, is_set, "type", "value", description) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'config_node_property_string'
--
UPDATE config_node_property_string SET "name" = ?, optional = ?, is_set = ?, "type" = ?, "value" = ?, description = ? WHERE 1=2;

--
-- DELETE template for table 'config_node_property_string'
--
DELETE FROM config_node_property_string WHERE 1=2;

