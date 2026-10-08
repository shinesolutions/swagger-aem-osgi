--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamCfmImplComponentComponentConfigImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_cfm_impl_component_component_config_impl_prope'
--
SELECT dam/cfm/component/resource_type, dam/cfm/component/file_reference_prop, dam/cfm/component/elements_prop, dam/cfm/component/variation_prop FROM com_adobe_cq_dam_cfm_impl_component_component_config_impl_prope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_cfm_impl_component_component_config_impl_prope'
--
INSERT INTO com_adobe_cq_dam_cfm_impl_component_component_config_impl_prope (dam/cfm/component/resource_type, dam/cfm/component/file_reference_prop, dam/cfm/component/elements_prop, dam/cfm/component/variation_prop) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_cfm_impl_component_component_config_impl_prope'
--
UPDATE com_adobe_cq_dam_cfm_impl_component_component_config_impl_prope SET dam/cfm/component/resource_type = ?, dam/cfm/component/file_reference_prop = ?, dam/cfm/component/elements_prop = ?, dam/cfm/component/variation_prop = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_cfm_impl_component_component_config_impl_prope'
--
DELETE FROM com_adobe_cq_dam_cfm_impl_component_component_config_impl_prope WHERE 1=2;

