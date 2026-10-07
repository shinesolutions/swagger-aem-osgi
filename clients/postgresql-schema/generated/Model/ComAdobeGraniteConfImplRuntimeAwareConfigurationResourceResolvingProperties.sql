--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_conf_impl_runtime_aware_configuration_resourc'
--
SELECT enabled, fallback_paths FROM com_adobe_granite_conf_impl_runtime_aware_configuration_resourc WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_conf_impl_runtime_aware_configuration_resourc'
--
INSERT INTO com_adobe_granite_conf_impl_runtime_aware_configuration_resourc (enabled, fallback_paths) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_conf_impl_runtime_aware_configuration_resourc'
--
UPDATE com_adobe_granite_conf_impl_runtime_aware_configuration_resourc SET enabled = ?, fallback_paths = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_conf_impl_runtime_aware_configuration_resourc'
--
DELETE FROM com_adobe_granite_conf_impl_runtime_aware_configuration_resourc WHERE 1=2;

