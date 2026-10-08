--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_'
--
SELECT device/info/transformer/enabled, device/info/transformer/css/style FROM com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_'
--
INSERT INTO com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_ (device/info/transformer/enabled, device/info/transformer/css/style) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_'
--
UPDATE com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_ SET device/info/transformer/enabled = ?, device/info/transformer/css/style = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_'
--
DELETE FROM com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_ WHERE 1=2;

