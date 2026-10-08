--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo`
--
INSERT INTO `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo`
--
UPDATE `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo`
--
DELETE FROM `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo` WHERE 0;

