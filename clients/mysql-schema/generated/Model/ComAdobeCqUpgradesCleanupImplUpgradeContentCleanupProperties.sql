--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties' definition.
--


--
-- SELECT template for table `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties`
--
SELECT `delete.path.regexps`, `delete.sql2.query` FROM `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties`
--
INSERT INTO `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties`(`delete.path.regexps`, `delete.sql2.query`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties`
--
UPDATE `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties` SET `delete.path.regexps` = ?, `delete.sql2.query` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties`
--
DELETE FROM `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties` WHERE 0;

