--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamScene7ImplScene7UploadServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_scene7_impl_scene7_upload_service_impl_propertie'
--
SELECT cq/dam/scene7/uploadservice/activejobtimeout/label, cq/dam/scene7/uploadservice/connectionmaxperroute/label FROM com_day_cq_dam_scene7_impl_scene7_upload_service_impl_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_scene7_impl_scene7_upload_service_impl_propertie'
--
INSERT INTO com_day_cq_dam_scene7_impl_scene7_upload_service_impl_propertie (cq/dam/scene7/uploadservice/activejobtimeout/label, cq/dam/scene7/uploadservice/connectionmaxperroute/label) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_scene7_impl_scene7_upload_service_impl_propertie'
--
UPDATE com_day_cq_dam_scene7_impl_scene7_upload_service_impl_propertie SET cq/dam/scene7/uploadservice/activejobtimeout/label = ?, cq/dam/scene7/uploadservice/connectionmaxperroute/label = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_scene7_impl_scene7_upload_service_impl_propertie'
--
DELETE FROM com_day_cq_dam_scene7_impl_scene7_upload_service_impl_propertie WHERE 1=2;

