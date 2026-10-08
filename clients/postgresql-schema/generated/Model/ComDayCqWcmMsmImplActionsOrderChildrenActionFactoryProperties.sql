--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_msm_impl_actions_order_children_action_factory_p'
--
SELECT cq/wcm/msm/action/excludednodetypes, cq/wcm/msm/action/excludedparagraphitems, cq/wcm/msm/action/excludedprops FROM com_day_cq_wcm_msm_impl_actions_order_children_action_factory_p WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_msm_impl_actions_order_children_action_factory_p'
--
INSERT INTO com_day_cq_wcm_msm_impl_actions_order_children_action_factory_p (cq/wcm/msm/action/excludednodetypes, cq/wcm/msm/action/excludedparagraphitems, cq/wcm/msm/action/excludedprops) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_msm_impl_actions_order_children_action_factory_p'
--
UPDATE com_day_cq_wcm_msm_impl_actions_order_children_action_factory_p SET cq/wcm/msm/action/excludednodetypes = ?, cq/wcm/msm/action/excludedparagraphitems = ?, cq/wcm/msm/action/excludedprops = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_msm_impl_actions_order_children_action_factory_p'
--
DELETE FROM com_day_cq_wcm_msm_impl_actions_order_children_action_factory_p WHERE 1=2;

