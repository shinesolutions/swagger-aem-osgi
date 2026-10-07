--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertie`
--
SELECT `oauth.cookie.login.timeout`, `oauth.cookie.max.age` FROM `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertie` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertie`
--
INSERT INTO `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertie`(`oauth.cookie.login.timeout`, `oauth.cookie.max.age`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertie`
--
UPDATE `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertie` SET `oauth.cookie.login.timeout` = ?, `oauth.cookie.max.age` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertie`
--
DELETE FROM `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertie` WHERE 0;

