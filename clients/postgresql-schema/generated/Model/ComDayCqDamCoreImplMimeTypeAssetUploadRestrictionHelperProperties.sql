--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_hel'
--
SELECT cq/dam/allow/all/mime, cq/dam/allowed/asset/mimes FROM com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_hel WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_hel'
--
INSERT INTO com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_hel (cq/dam/allow/all/mime, cq/dam/allowed/asset/mimes) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_hel'
--
UPDATE com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_hel SET cq/dam/allow/all/mime = ?, cq/dam/allowed/asset/mimes = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_hel'
--
DELETE FROM com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_hel WHERE 1=2;

