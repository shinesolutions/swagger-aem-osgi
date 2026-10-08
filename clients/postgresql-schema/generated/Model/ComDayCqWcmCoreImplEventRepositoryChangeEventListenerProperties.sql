--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_event_repository_change_event_listener'
--
SELECT paths, excluded_paths FROM com_day_cq_wcm_core_impl_event_repository_change_event_listener WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_event_repository_change_event_listener'
--
INSERT INTO com_day_cq_wcm_core_impl_event_repository_change_event_listener (paths, excluded_paths) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_event_repository_change_event_listener'
--
UPDATE com_day_cq_wcm_core_impl_event_repository_change_event_listener SET paths = ?, excluded_paths = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_event_repository_change_event_listener'
--
DELETE FROM com_day_cq_wcm_core_impl_event_repository_change_event_listener WHERE 1=2;

