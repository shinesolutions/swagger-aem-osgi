--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties`
--
SELECT `fieldWhitelist`, `sitePathFilters`, `sitePackageGroup` FROM `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties`
--
INSERT INTO `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties`(`fieldWhitelist`, `sitePathFilters`, `sitePackageGroup`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties`
--
UPDATE `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties` SET `fieldWhitelist` = ?, `sitePathFilters` = ?, `sitePackageGroup` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties`
--
DELETE FROM `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties` WHERE 0;

