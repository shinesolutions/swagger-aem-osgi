--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScreensDeviceImplDeviceServiceInfo' definition.
--


--
-- SELECT template for table `comAdobeCqScreensDeviceImplDeviceServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqScreensDeviceImplDeviceServiceInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqScreensDeviceImplDeviceServiceInfo`
--
INSERT INTO `comAdobeCqScreensDeviceImplDeviceServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqScreensDeviceImplDeviceServiceInfo`
--
UPDATE `comAdobeCqScreensDeviceImplDeviceServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScreensDeviceImplDeviceServiceInfo`
--
DELETE FROM `comAdobeCqScreensDeviceImplDeviceServiceInfo` WHERE 0;

