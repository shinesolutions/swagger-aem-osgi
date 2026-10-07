--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosIn`
--
INSERT INTO `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosIn`
--
UPDATE `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosIn`
--
DELETE FROM `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosIn` WHERE 0;

