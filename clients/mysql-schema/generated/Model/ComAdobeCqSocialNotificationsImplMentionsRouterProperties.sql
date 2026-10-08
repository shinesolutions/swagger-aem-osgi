--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialNotificationsImplMentionsRouterProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialNotificationsImplMentionsRouterProperties`
--
SELECT `event.topics`, `event.filter` FROM `comAdobeCqSocialNotificationsImplMentionsRouterProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialNotificationsImplMentionsRouterProperties`
--
INSERT INTO `comAdobeCqSocialNotificationsImplMentionsRouterProperties`(`event.topics`, `event.filter`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialNotificationsImplMentionsRouterProperties`
--
UPDATE `comAdobeCqSocialNotificationsImplMentionsRouterProperties` SET `event.topics` = ?, `event.filter` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialNotificationsImplMentionsRouterProperties`
--
DELETE FROM `comAdobeCqSocialNotificationsImplMentionsRouterProperties` WHERE 0;

