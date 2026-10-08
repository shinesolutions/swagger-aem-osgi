--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreStatsPageViewStatisticsImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreStatsPageViewStatisticsImplProperties`
--
SELECT `pageviewstatistics.trackingurl`, `pageviewstatistics.trackingscript.enabled` FROM `comDayCqWcmCoreStatsPageViewStatisticsImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreStatsPageViewStatisticsImplProperties`
--
INSERT INTO `comDayCqWcmCoreStatsPageViewStatisticsImplProperties`(`pageviewstatistics.trackingurl`, `pageviewstatistics.trackingscript.enabled`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreStatsPageViewStatisticsImplProperties`
--
UPDATE `comDayCqWcmCoreStatsPageViewStatisticsImplProperties` SET `pageviewstatistics.trackingurl` = ?, `pageviewstatistics.trackingscript.enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreStatsPageViewStatisticsImplProperties`
--
DELETE FROM `comDayCqWcmCoreStatsPageViewStatisticsImplProperties` WHERE 0;

