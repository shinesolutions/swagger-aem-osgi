--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPr`
--
SELECT `enableScheduledPostsSearch`, `numberOfMinutes`, `maxSearchLimit` FROM `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPr`
--
INSERT INTO `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPr`(`enableScheduledPostsSearch`, `numberOfMinutes`, `maxSearchLimit`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPr`
--
UPDATE `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPr` SET `enableScheduledPostsSearch` = ?, `numberOfMinutes` = ?, `maxSearchLimit` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPr`
--
DELETE FROM `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPr` WHERE 0;

