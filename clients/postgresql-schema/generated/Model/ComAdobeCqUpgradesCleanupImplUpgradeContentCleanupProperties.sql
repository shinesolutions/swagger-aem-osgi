--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_prop'
--
SELECT delete/path/regexps, delete/sql2/query FROM com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_prop WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_prop'
--
INSERT INTO com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_prop (delete/path/regexps, delete/sql2/query) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_prop'
--
UPDATE com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_prop SET delete/path/regexps = ?, delete/sql2/query = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_prop'
--
DELETE FROM com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_prop WHERE 1=2;

