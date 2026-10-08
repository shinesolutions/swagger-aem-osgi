--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_pr'
--
SELECT sling/post/operation, sling/servlet/methods FROM com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_pr WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_pr'
--
INSERT INTO com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_pr (sling/post/operation, sling/servlet/methods) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_pr'
--
UPDATE com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_pr SET sling/post/operation = ?, sling/servlet/methods = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_pr'
--
DELETE FROM com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_pr WHERE 1=2;

