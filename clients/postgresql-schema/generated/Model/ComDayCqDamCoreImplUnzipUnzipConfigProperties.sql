--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplUnzipUnzipConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_unzip_unzip_config_properties'
--
SELECT cq/dam/config/unzip/maxuncompressedsize, cq/dam/config/unzip/encoding FROM com_day_cq_dam_core_impl_unzip_unzip_config_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_unzip_unzip_config_properties'
--
INSERT INTO com_day_cq_dam_core_impl_unzip_unzip_config_properties (cq/dam/config/unzip/maxuncompressedsize, cq/dam/config/unzip/encoding) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_unzip_unzip_config_properties'
--
UPDATE com_day_cq_dam_core_impl_unzip_unzip_config_properties SET cq/dam/config/unzip/maxuncompressedsize = ?, cq/dam/config/unzip/encoding = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_unzip_unzip_config_properties'
--
DELETE FROM com_day_cq_dam_core_impl_unzip_unzip_config_properties WHERE 1=2;

