--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplPagePageManagerFactoryImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propert'
--
SELECT illegal_char_mapping, page_sub_tree_activation_check FROM com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propert WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propert'
--
INSERT INTO com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propert (illegal_char_mapping, page_sub_tree_activation_check) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propert'
--
UPDATE com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propert SET illegal_char_mapping = ?, page_sub_tree_activation_check = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propert'
--
DELETE FROM com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propert WHERE 1=2;

