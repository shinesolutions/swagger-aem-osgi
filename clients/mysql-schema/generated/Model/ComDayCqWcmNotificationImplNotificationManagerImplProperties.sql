--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmNotificationImplNotificationManagerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmNotificationImplNotificationManagerImplProperties`
--
SELECT `event.topics` FROM `comDayCqWcmNotificationImplNotificationManagerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmNotificationImplNotificationManagerImplProperties`
--
INSERT INTO `comDayCqWcmNotificationImplNotificationManagerImplProperties`(`event.topics`) VALUES (?);

--
-- UPDATE template for table `comDayCqWcmNotificationImplNotificationManagerImplProperties`
--
UPDATE `comDayCqWcmNotificationImplNotificationManagerImplProperties` SET `event.topics` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmNotificationImplNotificationManagerImplProperties`
--
DELETE FROM `comDayCqWcmNotificationImplNotificationManagerImplProperties` WHERE 0;

