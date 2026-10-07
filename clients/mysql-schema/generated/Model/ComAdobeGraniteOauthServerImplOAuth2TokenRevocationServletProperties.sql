--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProper`
--
SELECT `oauth.token.revocation.active` FROM `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProper` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProper`
--
INSERT INTO `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProper`(`oauth.token.revocation.active`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProper`
--
UPDATE `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProper` SET `oauth.token.revocation.active` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProper`
--
DELETE FROM `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProper` WHERE 0;

