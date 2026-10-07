--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties`
--
SELECT `hc.tags`, `ignored.bundles` FROM `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties`
--
INSERT INTO `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties`(`hc.tags`, `ignored.bundles`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties`
--
UPDATE `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties` SET `hc.tags` = ?, `ignored.bundles` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties`
--
DELETE FROM `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties` WHERE 0;

