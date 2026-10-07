--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSiteImplSiteConfiguratorImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSiteImplSiteConfiguratorImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialSiteImplSiteConfiguratorImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSiteImplSiteConfiguratorImplInfo`
--
INSERT INTO `comAdobeCqSocialSiteImplSiteConfiguratorImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSiteImplSiteConfiguratorImplInfo`
--
UPDATE `comAdobeCqSocialSiteImplSiteConfiguratorImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSiteImplSiteConfiguratorImplInfo`
--
DELETE FROM `comAdobeCqSocialSiteImplSiteConfiguratorImplInfo` WHERE 0;

