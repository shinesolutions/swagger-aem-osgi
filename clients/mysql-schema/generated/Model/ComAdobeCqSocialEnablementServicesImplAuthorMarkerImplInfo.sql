--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo`
--
INSERT INTO `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo`
--
UPDATE `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo`
--
DELETE FROM `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo` WHERE 0;

