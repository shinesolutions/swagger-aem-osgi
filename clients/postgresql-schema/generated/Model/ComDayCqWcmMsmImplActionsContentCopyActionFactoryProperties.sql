--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_pro'
--
SELECT cq/wcm/msm/action/excludednodetypes, cq/wcm/msm/action/excludedparagraphitems, cq/wcm/msm/action/excludedprops, contentcopyaction/order/style FROM com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_pro WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_pro'
--
INSERT INTO com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_pro (cq/wcm/msm/action/excludednodetypes, cq/wcm/msm/action/excludedparagraphitems, cq/wcm/msm/action/excludedprops, contentcopyaction/order/style) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_pro'
--
UPDATE com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_pro SET cq/wcm/msm/action/excludednodetypes = ?, cq/wcm/msm/action/excludedparagraphitems = ?, cq/wcm/msm/action/excludedprops = ?, contentcopyaction/order/style = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_pro'
--
DELETE FROM com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_pro WHERE 1=2;

