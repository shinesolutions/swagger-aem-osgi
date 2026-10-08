--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme'
--
SELECT whitelist/name, whitelist/bundles FROM org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme'
--
INSERT INTO org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme (whitelist/name, whitelist/bundles) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme'
--
UPDATE org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme SET whitelist/name = ?, whitelist/bundles = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme'
--
DELETE FROM org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme WHERE 1=2;

