--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthAccesstokenProviderInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthAccesstokenProviderInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteAuthOauthAccesstokenProviderInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthAccesstokenProviderInfo`
--
INSERT INTO `comAdobeGraniteAuthOauthAccesstokenProviderInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthAccesstokenProviderInfo`
--
UPDATE `comAdobeGraniteAuthOauthAccesstokenProviderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthAccesstokenProviderInfo`
--
DELETE FROM `comAdobeGraniteAuthOauthAccesstokenProviderInfo` WHERE 0;

