--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl'
--
SELECT create_preview_enabled, update_preview_enabled, queue_size, folder_preview_rendition_regex FROM com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl'
--
INSERT INTO com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl (create_preview_enabled, update_preview_enabled, queue_size, folder_preview_rendition_regex) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl'
--
UPDATE com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl SET create_preview_enabled = ?, update_preview_enabled = ?, queue_size = ?, folder_preview_rendition_regex = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl'
--
DELETE FROM com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl WHERE 1=2;

