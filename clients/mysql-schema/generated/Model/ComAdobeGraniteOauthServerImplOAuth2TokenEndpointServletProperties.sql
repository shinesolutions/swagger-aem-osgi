--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperti`
--
SELECT `oauth.issuer`, `oauth.access.token.expires.in`, `osgi.http.whiteboard.servlet.pattern`, `osgi.http.whiteboard.context.select` FROM `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperti` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperti`
--
INSERT INTO `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperti`(`oauth.issuer`, `oauth.access.token.expires.in`, `osgi.http.whiteboard.servlet.pattern`, `osgi.http.whiteboard.context.select`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperti`
--
UPDATE `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperti` SET `oauth.issuer` = ?, `oauth.access.token.expires.in` = ?, `osgi.http.whiteboard.servlet.pattern` = ?, `osgi.http.whiteboard.context.select` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperti`
--
DELETE FROM `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperti` WHERE 0;

