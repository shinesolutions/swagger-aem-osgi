--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanP`
--
SELECT `path`, `jaas.controlFlag`, `jaas.realmName`, `jaas.ranking`, `oauth.offline.validation` FROM `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanP` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanP`
--
INSERT INTO `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanP`(`path`, `jaas.controlFlag`, `jaas.realmName`, `jaas.ranking`, `oauth.offline.validation`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanP`
--
UPDATE `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanP` SET `path` = ?, `jaas.controlFlag` = ?, `jaas.realmName` = ?, `jaas.ranking` = ?, `oauth.offline.validation` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanP`
--
DELETE FROM `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanP` WHERE 0;

