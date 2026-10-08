--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_devicedetection_device_identification_'
--
SELECT dim/default/mode, dim/appcache/enabled FROM com_day_cq_wcm_core_impl_devicedetection_device_identification_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_devicedetection_device_identification_'
--
INSERT INTO com_day_cq_wcm_core_impl_devicedetection_device_identification_ (dim/default/mode, dim/appcache/enabled) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_devicedetection_device_identification_'
--
UPDATE com_day_cq_wcm_core_impl_devicedetection_device_identification_ SET dim/default/mode = ?, dim/appcache/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_devicedetection_device_identification_'
--
DELETE FROM com_day_cq_wcm_core_impl_devicedetection_device_identification_ WHERE 1=2;

