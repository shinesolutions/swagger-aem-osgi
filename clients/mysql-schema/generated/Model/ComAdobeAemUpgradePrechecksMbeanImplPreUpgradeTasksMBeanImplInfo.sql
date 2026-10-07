--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo' definition.
--


--
-- SELECT template for table `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo`
--
INSERT INTO `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo`
--
UPDATE `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo`
--
DELETE FROM `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo` WHERE 0;

