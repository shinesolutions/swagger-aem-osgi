--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenP`
--
SELECT `resourceType.filters`, `priority` FROM `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenP`
--
INSERT INTO `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenP`(`resourceType.filters`, `priority`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenP`
--
UPDATE `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenP` SET `resourceType.filters` = ?, `priority` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenP`
--
DELETE FROM `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenP` WHERE 0;

