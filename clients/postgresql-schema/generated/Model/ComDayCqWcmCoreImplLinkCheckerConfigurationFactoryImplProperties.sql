--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp'
--
SELECT link/expired/prefix, link/expired/remove, link/expired/suffix, link/invalid/prefix, link/invalid/remove, link/invalid/suffix, link/predated/prefix, link/predated/remove, link/predated/suffix, link/wcmmodes FROM com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp'
--
INSERT INTO com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp (link/expired/prefix, link/expired/remove, link/expired/suffix, link/invalid/prefix, link/invalid/remove, link/invalid/suffix, link/predated/prefix, link/predated/remove, link/predated/suffix, link/wcmmodes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp'
--
UPDATE com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp SET link/expired/prefix = ?, link/expired/remove = ?, link/expired/suffix = ?, link/invalid/prefix = ?, link/invalid/remove = ?, link/invalid/suffix = ?, link/predated/prefix = ?, link/predated/remove = ?, link/predated/suffix = ?, link/wcmmodes = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp'
--
DELETE FROM com_day_cq_wcm_core_impl_link_checker_configuration_factory_imp WHERE 1=2;

