--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmNotificationImplNotificationManagerImplInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmNotificationImplNotificationManagerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmNotificationImplNotificationManagerImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmNotificationImplNotificationManagerImplInfo`
--
INSERT INTO `comDayCqWcmNotificationImplNotificationManagerImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmNotificationImplNotificationManagerImplInfo`
--
UPDATE `comDayCqWcmNotificationImplNotificationManagerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmNotificationImplNotificationManagerImplInfo`
--
DELETE FROM `comDayCqWcmNotificationImplNotificationManagerImplInfo` WHERE 0;

