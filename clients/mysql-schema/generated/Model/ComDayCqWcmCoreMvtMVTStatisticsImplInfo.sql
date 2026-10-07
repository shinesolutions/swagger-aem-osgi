--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreMvtMVTStatisticsImplInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreMvtMVTStatisticsImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmCoreMvtMVTStatisticsImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreMvtMVTStatisticsImplInfo`
--
INSERT INTO `comDayCqWcmCoreMvtMVTStatisticsImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreMvtMVTStatisticsImplInfo`
--
UPDATE `comDayCqWcmCoreMvtMVTStatisticsImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreMvtMVTStatisticsImplInfo`
--
DELETE FROM `comDayCqWcmCoreMvtMVTStatisticsImplInfo` WHERE 0;

