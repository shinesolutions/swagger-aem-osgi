--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqNotificationImplNotificationServiceImplInfo' definition.
--


--
-- SELECT template for table `comDayCqNotificationImplNotificationServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqNotificationImplNotificationServiceImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqNotificationImplNotificationServiceImplInfo`
--
INSERT INTO `comDayCqNotificationImplNotificationServiceImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqNotificationImplNotificationServiceImplInfo`
--
UPDATE `comDayCqNotificationImplNotificationServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqNotificationImplNotificationServiceImplInfo`
--
DELETE FROM `comDayCqNotificationImplNotificationServiceImplInfo` WHERE 0;

