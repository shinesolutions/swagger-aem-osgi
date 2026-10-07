--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_msm_impl_actions_page_move_action_factory_proper'
--
SELECT cq/wcm/msm/action/excludednodetypes, cq/wcm/msm/action/excludedparagraphitems, cq/wcm/msm/action/excludedprops, cq/wcm/msm/impl/actions/pagemove/prop_reference_update FROM com_day_cq_wcm_msm_impl_actions_page_move_action_factory_proper WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_msm_impl_actions_page_move_action_factory_proper'
--
INSERT INTO com_day_cq_wcm_msm_impl_actions_page_move_action_factory_proper (cq/wcm/msm/action/excludednodetypes, cq/wcm/msm/action/excludedparagraphitems, cq/wcm/msm/action/excludedprops, cq/wcm/msm/impl/actions/pagemove/prop_reference_update) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_msm_impl_actions_page_move_action_factory_proper'
--
UPDATE com_day_cq_wcm_msm_impl_actions_page_move_action_factory_proper SET cq/wcm/msm/action/excludednodetypes = ?, cq/wcm/msm/action/excludedparagraphitems = ?, cq/wcm/msm/action/excludedprops = ?, cq/wcm/msm/impl/actions/pagemove/prop_reference_update = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_msm_impl_actions_page_move_action_factory_proper'
--
DELETE FROM com_day_cq_wcm_msm_impl_actions_page_move_action_factory_proper WHERE 1=2;

