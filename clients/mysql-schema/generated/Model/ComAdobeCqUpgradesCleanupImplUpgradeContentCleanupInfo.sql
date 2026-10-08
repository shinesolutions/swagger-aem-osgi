--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo' definition.
--


--
-- SELECT template for table `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo`
--
INSERT INTO `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo`
--
UPDATE `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo`
--
DELETE FROM `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo` WHERE 0;

