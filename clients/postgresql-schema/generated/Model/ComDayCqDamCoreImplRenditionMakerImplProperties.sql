--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplRenditionMakerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_rendition_maker_impl_properties'
--
SELECT xmp/propagate, xmp/excludes FROM com_day_cq_dam_core_impl_rendition_maker_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_rendition_maker_impl_properties'
--
INSERT INTO com_day_cq_dam_core_impl_rendition_maker_impl_properties (xmp/propagate, xmp/excludes) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_rendition_maker_impl_properties'
--
UPDATE com_day_cq_dam_core_impl_rendition_maker_impl_properties SET xmp/propagate = ?, xmp/excludes = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_rendition_maker_impl_properties'
--
DELETE FROM com_day_cq_dam_core_impl_rendition_maker_impl_properties WHERE 1=2;

