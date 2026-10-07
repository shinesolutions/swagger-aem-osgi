--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqTaggingImplJcrTagManagerFactoryImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties'
--
SELECT validation/enabled FROM com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties'
--
INSERT INTO com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties (validation/enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties'
--
UPDATE com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties SET validation/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties'
--
DELETE FROM com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties WHERE 1=2;

