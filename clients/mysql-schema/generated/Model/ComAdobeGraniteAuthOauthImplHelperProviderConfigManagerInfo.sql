--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo`
--
INSERT INTO `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo`
--
UPDATE `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo`
--
DELETE FROM `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo` WHERE 0;

