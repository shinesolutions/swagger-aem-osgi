--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties`
--
SELECT `path`, `service.ranking`, `jaas.controlFlag`, `jaas.realmName`, `jaas.ranking`, `headers`, `cookies`, `parameters`, `usermap`, `format`, `trustedCredentialsAttribute` FROM `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties`
--
INSERT INTO `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties`(`path`, `service.ranking`, `jaas.controlFlag`, `jaas.realmName`, `jaas.ranking`, `headers`, `cookies`, `parameters`, `usermap`, `format`, `trustedCredentialsAttribute`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties`
--
UPDATE `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties` SET `path` = ?, `service.ranking` = ?, `jaas.controlFlag` = ?, `jaas.realmName` = ?, `jaas.ranking` = ?, `headers` = ?, `cookies` = ?, `parameters` = ?, `usermap` = ?, `format` = ?, `trustedCredentialsAttribute` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties`
--
DELETE FROM `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties` WHERE 0;

