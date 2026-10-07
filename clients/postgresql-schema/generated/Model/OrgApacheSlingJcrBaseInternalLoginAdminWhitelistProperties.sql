--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_proper'
--
SELECT whitelist/bypass, whitelist/bundles/regexp FROM org_apache_sling_jcr_base_internal_login_admin_whitelist_proper WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_proper'
--
INSERT INTO org_apache_sling_jcr_base_internal_login_admin_whitelist_proper (whitelist/bypass, whitelist/bundles/regexp) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_proper'
--
UPDATE org_apache_sling_jcr_base_internal_login_admin_whitelist_proper SET whitelist/bypass = ?, whitelist/bundles/regexp = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_proper'
--
DELETE FROM org_apache_sling_jcr_base_internal_login_admin_whitelist_proper WHERE 1=2;

