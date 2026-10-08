--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo' definition.
--


--
-- SELECT template for table `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo`
--
INSERT INTO `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo`
--
UPDATE `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo`
--
DELETE FROM `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo` WHERE 0;

