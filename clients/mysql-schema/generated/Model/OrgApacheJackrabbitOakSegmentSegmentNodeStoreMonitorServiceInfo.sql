--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo`
--
INSERT INTO `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo`
--
UPDATE `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo`
--
DELETE FROM `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo` WHERE 0;

