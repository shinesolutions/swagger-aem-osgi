--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPr`
--
SELECT `resourceType.filters`, `priority` FROM `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPr`
--
INSERT INTO `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPr`(`resourceType.filters`, `priority`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPr`
--
UPDATE `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPr` SET `resourceType.filters` = ?, `priority` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPr`
--
DELETE FROM `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPr` WHERE 0;

