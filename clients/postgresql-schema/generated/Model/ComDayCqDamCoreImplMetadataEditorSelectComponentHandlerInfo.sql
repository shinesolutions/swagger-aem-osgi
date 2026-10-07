--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_metadata_editor_select_component_handl'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_core_impl_metadata_editor_select_component_handl WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_metadata_editor_select_component_handl'
--
INSERT INTO com_day_cq_dam_core_impl_metadata_editor_select_component_handl (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_metadata_editor_select_component_handl'
--
UPDATE com_day_cq_dam_core_impl_metadata_editor_select_component_handl SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_metadata_editor_select_component_handl'
--
DELETE FROM com_day_cq_dam_core_impl_metadata_editor_select_component_handl WHERE 1=2;

