--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplGraniteProviderInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthImplGraniteProviderInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteAuthOauthImplGraniteProviderInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthImplGraniteProviderInfo`
--
INSERT INTO `comAdobeGraniteAuthOauthImplGraniteProviderInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthImplGraniteProviderInfo`
--
UPDATE `comAdobeGraniteAuthOauthImplGraniteProviderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthImplGraniteProviderInfo`
--
DELETE FROM `comAdobeGraniteAuthOauthImplGraniteProviderInfo` WHERE 0;

