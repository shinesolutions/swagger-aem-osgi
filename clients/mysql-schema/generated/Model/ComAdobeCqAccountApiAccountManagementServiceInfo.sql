--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAccountApiAccountManagementServiceInfo' definition.
--


--
-- SELECT template for table `comAdobeCqAccountApiAccountManagementServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `comAdobeCqAccountApiAccountManagementServiceInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqAccountApiAccountManagementServiceInfo`
--
INSERT INTO `comAdobeCqAccountApiAccountManagementServiceInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqAccountApiAccountManagementServiceInfo`
--
UPDATE `comAdobeCqAccountApiAccountManagementServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAccountApiAccountManagementServiceInfo`
--
DELETE FROM `comAdobeCqAccountApiAccountManagementServiceInfo` WHERE 0;

