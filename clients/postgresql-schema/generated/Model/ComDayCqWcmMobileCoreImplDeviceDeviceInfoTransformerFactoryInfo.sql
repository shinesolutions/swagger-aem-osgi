--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_'
--
INSERT INTO com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_ (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_'
--
UPDATE com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_ SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_'
--
DELETE FROM com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_ WHERE 1=2;

