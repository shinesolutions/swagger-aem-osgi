--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_ims_impl_ims_instance_credentials_valida'
--
SELECT oauth/provider/id FROM com_adobe_granite_auth_ims_impl_ims_instance_credentials_valida WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_ims_impl_ims_instance_credentials_valida'
--
INSERT INTO com_adobe_granite_auth_ims_impl_ims_instance_credentials_valida (oauth/provider/id) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_auth_ims_impl_ims_instance_credentials_valida'
--
UPDATE com_adobe_granite_auth_ims_impl_ims_instance_credentials_valida SET oauth/provider/id = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_ims_impl_ims_instance_credentials_valida'
--
DELETE FROM com_adobe_granite_auth_ims_impl_ims_instance_credentials_valida WHERE 1=2;

