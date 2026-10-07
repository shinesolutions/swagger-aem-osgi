--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOptoutImplOptOutServiceImplInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteOptoutImplOptOutServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteOptoutImplOptOutServiceImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOptoutImplOptOutServiceImplInfo`
--
INSERT INTO `comAdobeGraniteOptoutImplOptOutServiceImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOptoutImplOptOutServiceImplInfo`
--
UPDATE `comAdobeGraniteOptoutImplOptOutServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOptoutImplOptOutServiceImplInfo`
--
DELETE FROM `comAdobeGraniteOptoutImplOptOutServiceImplInfo` WHERE 0;

