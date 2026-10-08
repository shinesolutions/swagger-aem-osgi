--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties' definition.
--


--
-- SELECT template for table `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProp`
--
SELECT `hc.name`, `hc.tags`, `hc.mbean.name` FROM `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProp` WHERE 1;

--
-- INSERT template for table `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProp`
--
INSERT INTO `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProp`(`hc.name`, `hc.tags`, `hc.mbean.name`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProp`
--
UPDATE `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProp` SET `hc.name` = ?, `hc.tags` = ?, `hc.mbean.name` = ? WHERE 1;

--
-- DELETE template for table `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProp`
--
DELETE FROM `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProp` WHERE 0;

