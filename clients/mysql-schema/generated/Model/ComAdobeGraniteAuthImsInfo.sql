--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthImsInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthImsInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteAuthImsInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthImsInfo`
--
INSERT INTO `comAdobeGraniteAuthImsInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthImsInfo`
--
UPDATE `comAdobeGraniteAuthImsInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthImsInfo`
--
DELETE FROM `comAdobeGraniteAuthImsInfo` WHERE 0;

