--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_'
--
INSERT INTO com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_ (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_'
--
UPDATE com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_ SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_'
--
DELETE FROM com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_ WHERE 1=2;

