--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPro`
--
SELECT `sling.servlet.paths`, `oauth.revocation.active` FROM `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPro` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPro`
--
INSERT INTO `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPro`(`sling.servlet.paths`, `oauth.revocation.active`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPro`
--
UPDATE `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPro` SET `sling.servlet.paths` = ?, `oauth.revocation.active` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPro`
--
DELETE FROM `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPro` WHERE 0;

