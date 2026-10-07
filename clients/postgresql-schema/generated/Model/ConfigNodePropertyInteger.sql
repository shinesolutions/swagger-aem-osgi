--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'configNodePropertyInteger' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'config_node_property_integer'
--
SELECT "name", optional, is_set, "type", "value", description FROM config_node_property_integer WHERE 1=1;

--
-- INSERT template for table 'config_node_property_integer'
--
INSERT INTO config_node_property_integer ("name", optional, is_set, "type", "value", description) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'config_node_property_integer'
--
UPDATE config_node_property_integer SET "name" = ?, optional = ?, is_set = ?, "type" = ?, "value" = ?, description = ? WHERE 1=2;

--
-- DELETE template for table 'config_node_property_integer'
--
DELETE FROM config_node_property_integer WHERE 1=2;

