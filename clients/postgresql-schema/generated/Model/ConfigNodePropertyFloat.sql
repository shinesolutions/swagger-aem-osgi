--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'configNodePropertyFloat' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'config_node_property_float'
--
SELECT "name", optional, is_set, "type", "value", description FROM config_node_property_float WHERE 1=1;

--
-- INSERT template for table 'config_node_property_float'
--
INSERT INTO config_node_property_float ("name", optional, is_set, "type", "value", description) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'config_node_property_float'
--
UPDATE config_node_property_float SET "name" = ?, optional = ?, is_set = ?, "type" = ?, "value" = ?, description = ? WHERE 1=2;

--
-- DELETE template for table 'config_node_property_float'
--
DELETE FROM config_node_property_float WHERE 1=2;

