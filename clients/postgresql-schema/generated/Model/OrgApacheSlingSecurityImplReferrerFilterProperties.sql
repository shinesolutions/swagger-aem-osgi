--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingSecurityImplReferrerFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_security_impl_referrer_filter_properties'
--
SELECT allow/empty, allow/hosts, allow/hosts/regexp, filter/methods, exclude/agents/regexp FROM org_apache_sling_security_impl_referrer_filter_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_security_impl_referrer_filter_properties'
--
INSERT INTO org_apache_sling_security_impl_referrer_filter_properties (allow/empty, allow/hosts, allow/hosts/regexp, filter/methods, exclude/agents/regexp) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_security_impl_referrer_filter_properties'
--
UPDATE org_apache_sling_security_impl_referrer_filter_properties SET allow/empty = ?, allow/hosts = ?, allow/hosts/regexp = ?, filter/methods = ?, exclude/agents/regexp = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_security_impl_referrer_filter_properties'
--
DELETE FROM org_apache_sling_security_impl_referrer_filter_properties WHERE 1=2;

