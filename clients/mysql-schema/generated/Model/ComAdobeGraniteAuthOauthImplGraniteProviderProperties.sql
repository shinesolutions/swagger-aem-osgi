--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplGraniteProviderProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthImplGraniteProviderProperties`
--
SELECT `oauth.provider.id`, `oauth.provider.granite.authorization.url`, `oauth.provider.granite.token.url`, `oauth.provider.granite.profile.url`, `oauth.provider.granite.extended.details.urls` FROM `comAdobeGraniteAuthOauthImplGraniteProviderProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthImplGraniteProviderProperties`
--
INSERT INTO `comAdobeGraniteAuthOauthImplGraniteProviderProperties`(`oauth.provider.id`, `oauth.provider.granite.authorization.url`, `oauth.provider.granite.token.url`, `oauth.provider.granite.profile.url`, `oauth.provider.granite.extended.details.urls`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthImplGraniteProviderProperties`
--
UPDATE `comAdobeGraniteAuthOauthImplGraniteProviderProperties` SET `oauth.provider.id` = ?, `oauth.provider.granite.authorization.url` = ?, `oauth.provider.granite.token.url` = ?, `oauth.provider.granite.profile.url` = ?, `oauth.provider.granite.extended.details.urls` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthImplGraniteProviderProperties`
--
DELETE FROM `comAdobeGraniteAuthOauthImplGraniteProviderProperties` WHERE 0;

