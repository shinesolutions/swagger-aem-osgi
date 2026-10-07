--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProper`
--
SELECT `event.topics`, `event.filter`, `verbs` FROM `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProper` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProper`
--
INSERT INTO `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProper`(`event.topics`, `event.filter`, `verbs`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProper`
--
UPDATE `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProper` SET `event.topics` = ?, `event.filter` = ?, `verbs` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProper`
--
DELETE FROM `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProper` WHERE 0;

