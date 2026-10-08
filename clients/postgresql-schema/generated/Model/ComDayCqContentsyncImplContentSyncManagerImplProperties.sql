--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqContentsyncImplContentSyncManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_contentsync_impl_content_sync_manager_impl_propertie'
--
SELECT contentsync/fallback/authorizable, contentsync/fallback/updateuser FROM com_day_cq_contentsync_impl_content_sync_manager_impl_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_contentsync_impl_content_sync_manager_impl_propertie'
--
INSERT INTO com_day_cq_contentsync_impl_content_sync_manager_impl_propertie (contentsync/fallback/authorizable, contentsync/fallback/updateuser) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_contentsync_impl_content_sync_manager_impl_propertie'
--
UPDATE com_day_cq_contentsync_impl_content_sync_manager_impl_propertie SET contentsync/fallback/authorizable = ?, contentsync/fallback/updateuser = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_contentsync_impl_content_sync_manager_impl_propertie'
--
DELETE FROM com_day_cq_contentsync_impl_content_sync_manager_impl_propertie WHERE 1=2;

