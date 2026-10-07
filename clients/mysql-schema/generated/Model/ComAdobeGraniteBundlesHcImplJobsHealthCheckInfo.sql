--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplJobsHealthCheckInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteBundlesHcImplJobsHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteBundlesHcImplJobsHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteBundlesHcImplJobsHealthCheckInfo`
--
INSERT INTO `comAdobeGraniteBundlesHcImplJobsHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteBundlesHcImplJobsHealthCheckInfo`
--
UPDATE `comAdobeGraniteBundlesHcImplJobsHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteBundlesHcImplJobsHealthCheckInfo`
--
DELETE FROM `comAdobeGraniteBundlesHcImplJobsHealthCheckInfo` WHERE 0;

