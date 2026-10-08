--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_crx_security_token_impl_impl_token_authentication_handl'
--
SELECT "path", token/required/attr, token/alternate/url, token/encapsulated, skip/token/refresh FROM com_day_crx_security_token_impl_impl_token_authentication_handl WHERE 1=1;

--
-- INSERT template for table 'com_day_crx_security_token_impl_impl_token_authentication_handl'
--
INSERT INTO com_day_crx_security_token_impl_impl_token_authentication_handl ("path", token/required/attr, token/alternate/url, token/encapsulated, skip/token/refresh) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_crx_security_token_impl_impl_token_authentication_handl'
--
UPDATE com_day_crx_security_token_impl_impl_token_authentication_handl SET "path" = ?, token/required/attr = ?, token/alternate/url = ?, token/encapsulated = ?, skip/token/refresh = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_crx_security_token_impl_impl_token_authentication_handl'
--
DELETE FROM com_day_crx_security_token_impl_impl_token_authentication_handl WHERE 1=2;

