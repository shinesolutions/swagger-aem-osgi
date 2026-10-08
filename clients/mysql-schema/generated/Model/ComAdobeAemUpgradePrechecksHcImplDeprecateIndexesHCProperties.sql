--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties' definition.
--


--
-- SELECT template for table `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties`
--
SELECT `hc.name`, `hc.tags`, `hc.mbean.name` FROM `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties` WHERE 1;

--
-- INSERT template for table `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties`
--
INSERT INTO `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties`(`hc.name`, `hc.tags`, `hc.mbean.name`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties`
--
UPDATE `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties` SET `hc.name` = ?, `hc.tags` = ?, `hc.mbean.name` = ? WHERE 1;

--
-- DELETE template for table `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties`
--
DELETE FROM `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties` WHERE 0;

