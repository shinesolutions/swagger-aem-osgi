--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp'
--
SELECT pid, title, description, properties FROM com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp'
--
INSERT INTO com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp'
--
UPDATE com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp'
--
DELETE FROM com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp WHERE 1=2;

