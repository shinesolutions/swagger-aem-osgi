--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo' definition.
--


--
-- SELECT template for table `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo` WHERE 1;

--
-- INSERT template for table `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo`
--
INSERT INTO `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo`
--
UPDATE `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo`
--
DELETE FROM `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo` WHERE 0;

