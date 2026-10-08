--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMsmImplRolloutManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_msm_impl_rollout_manager_impl_properties'
--
SELECT event/filter, rolloutmgr/excludedprops/default, rolloutmgr/excludedparagraphprops/default, rolloutmgr/excludednodetypes/default, rolloutmgr/threadpool/maxsize, rolloutmgr/threadpool/maxshutdowntime, rolloutmgr/threadpool/priority, rolloutmgr/commit/size, rolloutmgr/conflicthandling/enabled FROM com_day_cq_wcm_msm_impl_rollout_manager_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_msm_impl_rollout_manager_impl_properties'
--
INSERT INTO com_day_cq_wcm_msm_impl_rollout_manager_impl_properties (event/filter, rolloutmgr/excludedprops/default, rolloutmgr/excludedparagraphprops/default, rolloutmgr/excludednodetypes/default, rolloutmgr/threadpool/maxsize, rolloutmgr/threadpool/maxshutdowntime, rolloutmgr/threadpool/priority, rolloutmgr/commit/size, rolloutmgr/conflicthandling/enabled) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_msm_impl_rollout_manager_impl_properties'
--
UPDATE com_day_cq_wcm_msm_impl_rollout_manager_impl_properties SET event/filter = ?, rolloutmgr/excludedprops/default = ?, rolloutmgr/excludedparagraphprops/default = ?, rolloutmgr/excludednodetypes/default = ?, rolloutmgr/threadpool/maxsize = ?, rolloutmgr/threadpool/maxshutdowntime = ?, rolloutmgr/threadpool/priority = ?, rolloutmgr/commit/size = ?, rolloutmgr/conflicthandling/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_msm_impl_rollout_manager_impl_properties'
--
DELETE FROM com_day_cq_wcm_msm_impl_rollout_manager_impl_properties WHERE 1=2;

