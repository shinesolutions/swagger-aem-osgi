--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmFoundationImplHTTPAuthHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_foundation_impl_http_auth_handler_properties'
--
SELECT "path", auth/http/nologin, auth/http/realm, auth/default/loginpage, auth/cred/form, auth/cred/utf8 FROM com_day_cq_wcm_foundation_impl_http_auth_handler_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_foundation_impl_http_auth_handler_properties'
--
INSERT INTO com_day_cq_wcm_foundation_impl_http_auth_handler_properties ("path", auth/http/nologin, auth/http/realm, auth/default/loginpage, auth/cred/form, auth/cred/utf8) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_foundation_impl_http_auth_handler_properties'
--
UPDATE com_day_cq_wcm_foundation_impl_http_auth_handler_properties SET "path" = ?, auth/http/nologin = ?, auth/http/realm = ?, auth/default/loginpage = ?, auth/cred/form = ?, auth/cred/utf8 = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_foundation_impl_http_auth_handler_properties'
--
DELETE FROM com_day_cq_wcm_foundation_impl_http_auth_handler_properties WHERE 1=2;

