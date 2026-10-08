--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamCfmImplConfFeatureConfigImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties'
--
SELECT dam/cfm/resource_types, dam/cfm/reference_properties FROM com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties'
--
INSERT INTO com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties (dam/cfm/resource_types, dam/cfm/reference_properties) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties'
--
UPDATE com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties SET dam/cfm/resource_types = ?, dam/cfm/reference_properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties'
--
DELETE FROM com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties WHERE 1=2;

