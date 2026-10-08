--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalP`
--
SELECT `oauth.cookie.login.timeout`, `oauth.cookie.max.age` FROM `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalP` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalP`
--
INSERT INTO `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalP`(`oauth.cookie.login.timeout`, `oauth.cookie.max.age`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalP`
--
UPDATE `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalP` SET `oauth.cookie.login.timeout` = ?, `oauth.cookie.max.age` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalP`
--
DELETE FROM `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalP` WHERE 0;

