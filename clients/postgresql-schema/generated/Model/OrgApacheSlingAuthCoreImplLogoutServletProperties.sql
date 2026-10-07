--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingAuthCoreImplLogoutServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_auth_core_impl_logout_servlet_properties'
--
SELECT sling/servlet/methods, sling/servlet/paths FROM org_apache_sling_auth_core_impl_logout_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_auth_core_impl_logout_servlet_properties'
--
INSERT INTO org_apache_sling_auth_core_impl_logout_servlet_properties (sling/servlet/methods, sling/servlet/paths) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_auth_core_impl_logout_servlet_properties'
--
UPDATE org_apache_sling_auth_core_impl_logout_servlet_properties SET sling/servlet/methods = ?, sling/servlet/paths = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_auth_core_impl_logout_servlet_properties'
--
DELETE FROM org_apache_sling_auth_core_impl_logout_servlet_properties WHERE 1=2;

