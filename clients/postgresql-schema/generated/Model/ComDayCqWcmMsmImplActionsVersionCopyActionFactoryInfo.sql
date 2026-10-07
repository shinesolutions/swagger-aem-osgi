--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_inf'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_inf WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_inf'
--
INSERT INTO com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_inf (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_inf'
--
UPDATE com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_inf SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_inf'
--
DELETE FROM com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_inf WHERE 1=2;

