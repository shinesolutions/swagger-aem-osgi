--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertie`
--
SELECT `path`, `oauth.clientIds.allowed`, `auth.bearer.sync.ims`, `auth.tokenRequestParameter`, `oauth.bearer.configid`, `oauth.jwt.support` FROM `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertie` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertie`
--
INSERT INTO `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertie`(`path`, `oauth.clientIds.allowed`, `auth.bearer.sync.ims`, `auth.tokenRequestParameter`, `oauth.bearer.configid`, `oauth.jwt.support`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertie`
--
UPDATE `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertie` SET `path` = ?, `oauth.clientIds.allowed` = ?, `auth.bearer.sync.ims` = ?, `auth.tokenRequestParameter` = ?, `oauth.bearer.configid` = ?, `oauth.jwt.support` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertie`
--
DELETE FROM `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertie` WHERE 0;

