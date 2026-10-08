--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_oauth_impl_default_token_validator_impl_'
--
SELECT auth/token/validator/type FROM com_adobe_granite_auth_oauth_impl_default_token_validator_impl_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_oauth_impl_default_token_validator_impl_'
--
INSERT INTO com_adobe_granite_auth_oauth_impl_default_token_validator_impl_ (auth/token/validator/type) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_auth_oauth_impl_default_token_validator_impl_'
--
UPDATE com_adobe_granite_auth_oauth_impl_default_token_validator_impl_ SET auth/token/validator/type = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_oauth_impl_default_token_validator_impl_'
--
DELETE FROM com_adobe_granite_auth_oauth_impl_default_token_validator_impl_ WHERE 1=2;

