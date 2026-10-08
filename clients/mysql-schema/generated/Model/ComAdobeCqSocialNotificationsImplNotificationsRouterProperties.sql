--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialNotificationsImplNotificationsRouterProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialNotificationsImplNotificationsRouterProperties`
--
SELECT `event.topics`, `event.filter` FROM `comAdobeCqSocialNotificationsImplNotificationsRouterProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialNotificationsImplNotificationsRouterProperties`
--
INSERT INTO `comAdobeCqSocialNotificationsImplNotificationsRouterProperties`(`event.topics`, `event.filter`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialNotificationsImplNotificationsRouterProperties`
--
UPDATE `comAdobeCqSocialNotificationsImplNotificationsRouterProperties` SET `event.topics` = ?, `event.filter` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialNotificationsImplNotificationsRouterProperties`
--
DELETE FROM `comAdobeCqSocialNotificationsImplNotificationsRouterProperties` WHERE 0;

