--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthImsImplImsConfigProviderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_ims_impl_ims_config_provider_impl_proper'
--
SELECT oauth/configmanager/ims/configid, ims/owning_entity, aem/instance_id, ims/service_code FROM com_adobe_granite_auth_ims_impl_ims_config_provider_impl_proper WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_ims_impl_ims_config_provider_impl_proper'
--
INSERT INTO com_adobe_granite_auth_ims_impl_ims_config_provider_impl_proper (oauth/configmanager/ims/configid, ims/owning_entity, aem/instance_id, ims/service_code) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_ims_impl_ims_config_provider_impl_proper'
--
UPDATE com_adobe_granite_auth_ims_impl_ims_config_provider_impl_proper SET oauth/configmanager/ims/configid = ?, ims/owning_entity = ?, aem/instance_id = ?, ims/service_code = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_ims_impl_ims_config_provider_impl_proper'
--
DELETE FROM com_adobe_granite_auth_ims_impl_ims_config_provider_impl_proper WHERE 1=2;

