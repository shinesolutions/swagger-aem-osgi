--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties`
--
SELECT `hc.tags`, `disk.space.warn.threshold`, `disk.space.error.threshold` FROM `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties`
--
INSERT INTO `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties`(`hc.tags`, `disk.space.warn.threshold`, `disk.space.error.threshold`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties`
--
UPDATE `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties` SET `hc.tags` = ?, `disk.space.warn.threshold` = ?, `disk.space.error.threshold` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties`
--
DELETE FROM `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties` WHERE 0;

