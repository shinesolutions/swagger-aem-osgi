--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'configNodePropertyArray' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'config_node_property_array'
--
SELECT "name", optional, is_set, "type", "values", description FROM config_node_property_array WHERE 1=1;

--
-- INSERT template for table 'config_node_property_array'
--
INSERT INTO config_node_property_array ("name", optional, is_set, "type", "values", description) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'config_node_property_array'
--
UPDATE config_node_property_array SET "name" = ?, optional = ?, is_set = ?, "type" = ?, "values" = ?, description = ? WHERE 1=2;

--
-- DELETE template for table 'config_node_property_array'
--
DELETE FROM config_node_property_array WHERE 1=2;

