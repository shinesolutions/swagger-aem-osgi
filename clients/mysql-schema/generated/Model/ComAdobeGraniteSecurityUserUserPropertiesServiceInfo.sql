--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteSecurityUserUserPropertiesServiceInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteSecurityUserUserPropertiesServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteSecurityUserUserPropertiesServiceInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteSecurityUserUserPropertiesServiceInfo`
--
INSERT INTO `comAdobeGraniteSecurityUserUserPropertiesServiceInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteSecurityUserUserPropertiesServiceInfo`
--
UPDATE `comAdobeGraniteSecurityUserUserPropertiesServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteSecurityUserUserPropertiesServiceInfo`
--
DELETE FROM `comAdobeGraniteSecurityUserUserPropertiesServiceInfo` WHERE 0;

