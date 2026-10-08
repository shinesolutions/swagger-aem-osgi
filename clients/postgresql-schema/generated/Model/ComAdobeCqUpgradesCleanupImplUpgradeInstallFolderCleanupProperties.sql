--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_clean'
--
SELECT delete/name/regexps FROM com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_clean WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_clean'
--
INSERT INTO com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_clean (delete/name/regexps) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_clean'
--
UPDATE com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_clean SET delete/name/regexps = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_clean'
--
DELETE FROM com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_clean WHERE 1=2;

