--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialNotificationsImplNotificationManagerImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialNotificationsImplNotificationManagerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialNotificationsImplNotificationManagerImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialNotificationsImplNotificationManagerImplInfo`
--
INSERT INTO `comAdobeCqSocialNotificationsImplNotificationManagerImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialNotificationsImplNotificationManagerImplInfo`
--
UPDATE `comAdobeCqSocialNotificationsImplNotificationManagerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialNotificationsImplNotificationManagerImplInfo`
--
DELETE FROM `comAdobeCqSocialNotificationsImplNotificationManagerImplInfo` WHERE 0;

