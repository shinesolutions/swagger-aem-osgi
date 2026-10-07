--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplIn`
--
INSERT INTO `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplIn`
--
UPDATE `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplIn`
--
DELETE FROM `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplIn` WHERE 0;

