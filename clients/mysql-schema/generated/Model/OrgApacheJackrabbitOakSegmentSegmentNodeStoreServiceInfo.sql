--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo`
--
INSERT INTO `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo`
--
UPDATE `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo`
--
DELETE FROM `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo` WHERE 0;

