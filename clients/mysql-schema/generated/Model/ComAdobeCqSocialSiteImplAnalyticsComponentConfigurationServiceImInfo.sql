--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm`
--
INSERT INTO `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm`
--
UPDATE `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm`
--
DELETE FROM `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm` WHERE 0;

