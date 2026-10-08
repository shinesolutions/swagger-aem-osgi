--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEngineImplAuthSlingAuthenticatorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_engine_impl_auth_sling_authenticator_propertie'
--
SELECT osgi/http/whiteboard/context/select, osgi/http/whiteboard/listener, auth/sudo/cookie, auth/sudo/parameter, auth/annonymous, sling/auth/requirements, sling/auth/anonymous/user, sling/auth/anonymous/password, auth/http, auth/http/realm, auth/uri/suffix FROM org_apache_sling_engine_impl_auth_sling_authenticator_propertie WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_engine_impl_auth_sling_authenticator_propertie'
--
INSERT INTO org_apache_sling_engine_impl_auth_sling_authenticator_propertie (osgi/http/whiteboard/context/select, osgi/http/whiteboard/listener, auth/sudo/cookie, auth/sudo/parameter, auth/annonymous, sling/auth/requirements, sling/auth/anonymous/user, sling/auth/anonymous/password, auth/http, auth/http/realm, auth/uri/suffix) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_engine_impl_auth_sling_authenticator_propertie'
--
UPDATE org_apache_sling_engine_impl_auth_sling_authenticator_propertie SET osgi/http/whiteboard/context/select = ?, osgi/http/whiteboard/listener = ?, auth/sudo/cookie = ?, auth/sudo/parameter = ?, auth/annonymous = ?, sling/auth/requirements = ?, sling/auth/anonymous/user = ?, sling/auth/anonymous/password = ?, auth/http = ?, auth/http/realm = ?, auth/uri/suffix = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_engine_impl_auth_sling_authenticator_propertie'
--
DELETE FROM org_apache_sling_engine_impl_auth_sling_authenticator_propertie WHERE 1=2;

