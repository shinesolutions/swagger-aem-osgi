--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreStatsPageViewStatisticsImplInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreStatsPageViewStatisticsImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmCoreStatsPageViewStatisticsImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreStatsPageViewStatisticsImplInfo`
--
INSERT INTO `comDayCqWcmCoreStatsPageViewStatisticsImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreStatsPageViewStatisticsImplInfo`
--
UPDATE `comDayCqWcmCoreStatsPageViewStatisticsImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreStatsPageViewStatisticsImplInfo`
--
DELETE FROM `comDayCqWcmCoreStatsPageViewStatisticsImplInfo` WHERE 0;

