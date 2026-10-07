--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo`
--
INSERT INTO `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo`
--
UPDATE `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo`
--
DELETE FROM `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo` WHERE 0;

