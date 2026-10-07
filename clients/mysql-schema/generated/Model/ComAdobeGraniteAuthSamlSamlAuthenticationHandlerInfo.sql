--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo`
--
INSERT INTO `comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo`
--
UPDATE `comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo`
--
DELETE FROM `comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo` WHERE 0;

