--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_msm_impl_actions_references_update_action_factor'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_day_cq_wcm_msm_impl_actions_references_update_action_factor WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_msm_impl_actions_references_update_action_factor'
--
INSERT INTO com_day_cq_wcm_msm_impl_actions_references_update_action_factor (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_msm_impl_actions_references_update_action_factor'
--
UPDATE com_day_cq_wcm_msm_impl_actions_references_update_action_factor SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_msm_impl_actions_references_update_action_factor'
--
DELETE FROM com_day_cq_wcm_msm_impl_actions_references_update_action_factor WHERE 1=2;

