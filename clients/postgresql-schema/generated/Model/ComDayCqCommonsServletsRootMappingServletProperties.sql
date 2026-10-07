--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqCommonsServletsRootMappingServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_commons_servlets_root_mapping_servlet_properties'
--
SELECT rootmapping/target FROM com_day_cq_commons_servlets_root_mapping_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_commons_servlets_root_mapping_servlet_properties'
--
INSERT INTO com_day_cq_commons_servlets_root_mapping_servlet_properties (rootmapping/target) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_commons_servlets_root_mapping_servlet_properties'
--
UPDATE com_day_cq_commons_servlets_root_mapping_servlet_properties SET rootmapping/target = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_commons_servlets_root_mapping_servlet_properties'
--
DELETE FROM com_day_cq_commons_servlets_root_mapping_servlet_properties WHERE 1=2;

