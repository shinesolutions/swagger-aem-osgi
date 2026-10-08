--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo`
--
INSERT INTO `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo`
--
UPDATE `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo`
--
DELETE FROM `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo` WHERE 0;

