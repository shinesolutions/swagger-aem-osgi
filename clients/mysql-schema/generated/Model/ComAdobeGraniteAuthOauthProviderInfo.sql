--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthProviderInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthProviderInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteAuthOauthProviderInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthProviderInfo`
--
INSERT INTO `comAdobeGraniteAuthOauthProviderInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthProviderInfo`
--
UPDATE `comAdobeGraniteAuthOauthProviderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthProviderInfo`
--
DELETE FROM `comAdobeGraniteAuthOauthProviderInfo` WHERE 0;

