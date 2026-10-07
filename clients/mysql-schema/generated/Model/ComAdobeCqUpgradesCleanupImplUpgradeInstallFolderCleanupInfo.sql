--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo' definition.
--


--
-- SELECT template for table `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo`
--
INSERT INTO `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo`
--
UPDATE `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo`
--
DELETE FROM `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo` WHERE 0;

