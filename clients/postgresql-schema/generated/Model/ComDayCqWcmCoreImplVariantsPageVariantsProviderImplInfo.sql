--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_i'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_i WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_i'
--
INSERT INTO com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_i (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_i'
--
UPDATE com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_i SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_i'
--
DELETE FROM com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_i WHERE 1=2;

