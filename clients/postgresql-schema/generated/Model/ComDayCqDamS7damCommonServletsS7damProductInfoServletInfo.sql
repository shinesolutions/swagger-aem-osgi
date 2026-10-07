--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamS7damCommonServletsS7damProductInfoServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet'
--
INSERT INTO com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet'
--
UPDATE com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet'
--
DELETE FROM com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet WHERE 1=2;

