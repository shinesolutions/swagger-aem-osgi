--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteRepositoryImplCommitStatsConfigInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteRepositoryImplCommitStatsConfigInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteRepositoryImplCommitStatsConfigInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteRepositoryImplCommitStatsConfigInfo`
--
INSERT INTO `comAdobeGraniteRepositoryImplCommitStatsConfigInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteRepositoryImplCommitStatsConfigInfo`
--
UPDATE `comAdobeGraniteRepositoryImplCommitStatsConfigInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteRepositoryImplCommitStatsConfigInfo`
--
DELETE FROM `comAdobeGraniteRepositoryImplCommitStatsConfigInfo` WHERE 0;

