--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplJobsHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteBundlesHcImplJobsHealthCheckProperties`
--
SELECT `hc.tags`, `max.queued.jobs` FROM `comAdobeGraniteBundlesHcImplJobsHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteBundlesHcImplJobsHealthCheckProperties`
--
INSERT INTO `comAdobeGraniteBundlesHcImplJobsHealthCheckProperties`(`hc.tags`, `max.queued.jobs`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteBundlesHcImplJobsHealthCheckProperties`
--
UPDATE `comAdobeGraniteBundlesHcImplJobsHealthCheckProperties` SET `hc.tags` = ?, `max.queued.jobs` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteBundlesHcImplJobsHealthCheckProperties`
--
DELETE FROM `comAdobeGraniteBundlesHcImplJobsHealthCheckProperties` WHERE 0;

