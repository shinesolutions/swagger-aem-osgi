--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties' definition.
--


--
-- SELECT template for table `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProp`
--
SELECT `root.path`, `fix.inconsistencies` FROM `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProp` WHERE 1;

--
-- INSERT template for table `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProp`
--
INSERT INTO `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProp`(`root.path`, `fix.inconsistencies`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProp`
--
UPDATE `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProp` SET `root.path` = ?, `fix.inconsistencies` = ? WHERE 1;

--
-- DELETE template for table `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProp`
--
DELETE FROM `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProp` WHERE 0;

