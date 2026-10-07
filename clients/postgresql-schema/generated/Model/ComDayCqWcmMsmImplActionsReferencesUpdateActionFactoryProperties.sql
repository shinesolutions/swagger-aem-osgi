--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_msm_impl_actions_references_update_action_factor'
--
SELECT cq/wcm/msm/action/excludednodetypes, cq/wcm/msm/action/excludedparagraphitems, cq/wcm/msm/action/excludedprops, cq/wcm/msm/impl/action/referencesupdate/prop_update_nested FROM com_day_cq_wcm_msm_impl_actions_references_update_action_factor WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_msm_impl_actions_references_update_action_factor'
--
INSERT INTO com_day_cq_wcm_msm_impl_actions_references_update_action_factor (cq/wcm/msm/action/excludednodetypes, cq/wcm/msm/action/excludedparagraphitems, cq/wcm/msm/action/excludedprops, cq/wcm/msm/impl/action/referencesupdate/prop_update_nested) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_msm_impl_actions_references_update_action_factor'
--
UPDATE com_day_cq_wcm_msm_impl_actions_references_update_action_factor SET cq/wcm/msm/action/excludednodetypes = ?, cq/wcm/msm/action/excludedparagraphitems = ?, cq/wcm/msm/action/excludedprops = ?, cq/wcm/msm/impl/action/referencesupdate/prop_update_nested = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_msm_impl_actions_references_update_action_factor'
--
DELETE FROM com_day_cq_wcm_msm_impl_actions_references_update_action_factor WHERE 1=2;

