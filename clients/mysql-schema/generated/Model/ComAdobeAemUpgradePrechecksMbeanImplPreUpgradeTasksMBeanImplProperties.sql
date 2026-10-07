--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties' definition.
--


--
-- SELECT template for table `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProp`
--
SELECT `pre-upgrade.maintenance.tasks`, `pre-upgrade.hc.tags` FROM `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProp` WHERE 1;

--
-- INSERT template for table `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProp`
--
INSERT INTO `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProp`(`pre-upgrade.maintenance.tasks`, `pre-upgrade.hc.tags`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProp`
--
UPDATE `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProp` SET `pre-upgrade.maintenance.tasks` = ?, `pre-upgrade.hc.tags` = ? WHERE 1;

--
-- DELETE template for table `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProp`
--
DELETE FROM `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProp` WHERE 0;

