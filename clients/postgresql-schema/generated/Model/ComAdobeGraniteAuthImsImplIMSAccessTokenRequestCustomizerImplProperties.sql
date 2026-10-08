--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_ims_impl_ims_access_token_request_custom'
--
SELECT auth/ims/client/secret, customizer/type FROM com_adobe_granite_auth_ims_impl_ims_access_token_request_custom WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_ims_impl_ims_access_token_request_custom'
--
INSERT INTO com_adobe_granite_auth_ims_impl_ims_access_token_request_custom (auth/ims/client/secret, customizer/type) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_ims_impl_ims_access_token_request_custom'
--
UPDATE com_adobe_granite_auth_ims_impl_ims_access_token_request_custom SET auth/ims/client/secret = ?, customizer/type = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_ims_impl_ims_access_token_request_custom'
--
DELETE FROM com_adobe_granite_auth_ims_impl_ims_access_token_request_custom WHERE 1=2;

