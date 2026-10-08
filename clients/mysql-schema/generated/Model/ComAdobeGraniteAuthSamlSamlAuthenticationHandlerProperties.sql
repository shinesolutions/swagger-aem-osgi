--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties`
--
SELECT `path`, `service.ranking`, `idpUrl`, `idpCertAlias`, `idpHttpRedirect`, `serviceProviderEntityId`, `assertionConsumerServiceURL`, `spPrivateKeyAlias`, `keyStorePassword`, `defaultRedirectUrl`, `userIDAttribute`, `useEncryption`, `createUser`, `userIntermediatePath`, `addGroupMemberships`, `groupMembershipAttribute`, `defaultGroups`, `nameIdFormat`, `synchronizeAttributes`, `handleLogout`, `logoutUrl`, `clockTolerance`, `digestMethod`, `signatureMethod`, `identitySyncType`, `idpIdentifier` FROM `comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties`
--
INSERT INTO `comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties`(`path`, `service.ranking`, `idpUrl`, `idpCertAlias`, `idpHttpRedirect`, `serviceProviderEntityId`, `assertionConsumerServiceURL`, `spPrivateKeyAlias`, `keyStorePassword`, `defaultRedirectUrl`, `userIDAttribute`, `useEncryption`, `createUser`, `userIntermediatePath`, `addGroupMemberships`, `groupMembershipAttribute`, `defaultGroups`, `nameIdFormat`, `synchronizeAttributes`, `handleLogout`, `logoutUrl`, `clockTolerance`, `digestMethod`, `signatureMethod`, `identitySyncType`, `idpIdentifier`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties`
--
UPDATE `comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties` SET `path` = ?, `service.ranking` = ?, `idpUrl` = ?, `idpCertAlias` = ?, `idpHttpRedirect` = ?, `serviceProviderEntityId` = ?, `assertionConsumerServiceURL` = ?, `spPrivateKeyAlias` = ?, `keyStorePassword` = ?, `defaultRedirectUrl` = ?, `userIDAttribute` = ?, `useEncryption` = ?, `createUser` = ?, `userIntermediatePath` = ?, `addGroupMemberships` = ?, `groupMembershipAttribute` = ?, `defaultGroups` = ?, `nameIdFormat` = ?, `synchronizeAttributes` = ?, `handleLogout` = ?, `logoutUrl` = ?, `clockTolerance` = ?, `digestMethod` = ?, `signatureMethod` = ?, `identitySyncType` = ?, `idpIdentifier` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties`
--
DELETE FROM `comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties` WHERE 0;

