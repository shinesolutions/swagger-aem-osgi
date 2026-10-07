--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo`
--
INSERT INTO `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo`
--
UPDATE `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo`
--
DELETE FROM `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo` WHERE 0;

