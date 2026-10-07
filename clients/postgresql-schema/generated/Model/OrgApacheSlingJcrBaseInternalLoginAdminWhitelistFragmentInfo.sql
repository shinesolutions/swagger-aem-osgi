--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme'
--
SELECT pid, title, description, properties FROM org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme'
--
INSERT INTO org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme'
--
UPDATE org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme'
--
DELETE FROM org_apache_sling_jcr_base_internal_login_admin_whitelist_fragme WHERE 1=2;

