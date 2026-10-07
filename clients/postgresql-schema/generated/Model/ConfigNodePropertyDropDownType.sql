--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'configNodePropertyDropDown_type' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'config_node_property_drop_down_type'
--
SELECT labels, "values" FROM config_node_property_drop_down_type WHERE 1=1;

--
-- INSERT template for table 'config_node_property_drop_down_type'
--
INSERT INTO config_node_property_drop_down_type (labels, "values") VALUES (?, ?);

--
-- UPDATE template for table 'config_node_property_drop_down_type'
--
UPDATE config_node_property_drop_down_type SET labels = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'config_node_property_drop_down_type'
--
DELETE FROM config_node_property_drop_down_type WHERE 1=2;

