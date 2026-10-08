--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo`
--
INSERT INTO `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo`
--
UPDATE `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo`
--
DELETE FROM `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo` WHERE 0;

