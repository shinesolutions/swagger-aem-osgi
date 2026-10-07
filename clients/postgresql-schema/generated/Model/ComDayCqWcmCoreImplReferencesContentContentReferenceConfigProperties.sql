--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_references_content_content_reference_c'
--
SELECT content_reference_config/resource_types FROM com_day_cq_wcm_core_impl_references_content_content_reference_c WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_references_content_content_reference_c'
--
INSERT INTO com_day_cq_wcm_core_impl_references_content_content_reference_c (content_reference_config/resource_types) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_references_content_content_reference_c'
--
UPDATE com_day_cq_wcm_core_impl_references_content_content_reference_c SET content_reference_config/resource_types = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_references_content_content_reference_c'
--
DELETE FROM com_day_cq_wcm_core_impl_references_content_content_reference_c WHERE 1=2;

