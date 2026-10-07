--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties' definition.
--


--
-- SELECT template for table `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperti`
--
SELECT `delete.name.regexps` FROM `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperti` WHERE 1;

--
-- INSERT template for table `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperti`
--
INSERT INTO `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperti`(`delete.name.regexps`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperti`
--
UPDATE `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperti` SET `delete.name.regexps` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperti`
--
DELETE FROM `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperti` WHERE 0;

