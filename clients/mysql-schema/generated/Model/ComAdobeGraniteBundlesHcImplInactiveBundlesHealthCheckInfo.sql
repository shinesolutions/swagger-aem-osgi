--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo`
--
INSERT INTO `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo`
--
UPDATE `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo`
--
DELETE FROM `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo` WHERE 0;

