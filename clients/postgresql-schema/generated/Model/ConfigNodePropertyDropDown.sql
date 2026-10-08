--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'configNodePropertyDropDown' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'config_node_property_drop_down'
--
SELECT "name", optional, is_set, "type", "value", description FROM config_node_property_drop_down WHERE 1=1;

--
-- INSERT template for table 'config_node_property_drop_down'
--
INSERT INTO config_node_property_drop_down ("name", optional, is_set, "type", "value", description) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'config_node_property_drop_down'
--
UPDATE config_node_property_drop_down SET "name" = ?, optional = ?, is_set = ?, "type" = ?, "value" = ?, description = ? WHERE 1=2;

--
-- DELETE template for table 'config_node_property_drop_down'
--
DELETE FROM config_node_property_drop_down WHERE 1=2;

