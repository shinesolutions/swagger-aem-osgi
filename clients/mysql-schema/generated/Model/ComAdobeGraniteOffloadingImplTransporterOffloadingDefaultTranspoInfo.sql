--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo`
--
INSERT INTO `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo`
--
UPDATE `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo`
--
DELETE FROM `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo` WHERE 0;

