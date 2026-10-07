--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialNotificationsImplNotificationManagerImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialNotificationsImplNotificationManagerImplProperti`
--
SELECT `max.unread.notification.count` FROM `comAdobeCqSocialNotificationsImplNotificationManagerImplProperti` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialNotificationsImplNotificationManagerImplProperti`
--
INSERT INTO `comAdobeCqSocialNotificationsImplNotificationManagerImplProperti`(`max.unread.notification.count`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqSocialNotificationsImplNotificationManagerImplProperti`
--
UPDATE `comAdobeCqSocialNotificationsImplNotificationManagerImplProperti` SET `max.unread.notification.count` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialNotificationsImplNotificationManagerImplProperti`
--
DELETE FROM `comAdobeCqSocialNotificationsImplNotificationManagerImplProperti` WHERE 0;

