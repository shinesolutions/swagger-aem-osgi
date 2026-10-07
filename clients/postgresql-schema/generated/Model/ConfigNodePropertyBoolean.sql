--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'configNodePropertyBoolean' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'config_node_property_boolean'
--
SELECT "name", optional, is_set, "type", "value", description FROM config_node_property_boolean WHERE 1=1;

--
-- INSERT template for table 'config_node_property_boolean'
--
INSERT INTO config_node_property_boolean ("name", optional, is_set, "type", "value", description) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'config_node_property_boolean'
--
UPDATE config_node_property_boolean SET "name" = ?, optional = ?, is_set = ?, "type" = ?, "value" = ?, description = ? WHERE 1=2;

--
-- DELETE template for table 'config_node_property_boolean'
--
DELETE FROM config_node_property_boolean WHERE 1=2;

