--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertie`
--
SELECT `usersPath`, `groupsPath`, `systemRelativePath`, `defaultDepth`, `importBehavior`, `passwordHashAlgorithm`, `passwordHashIterations`, `passwordSaltSize`, `omitAdminPw`, `supportAutoSave`, `passwordMaxAge`, `initialPasswordChange`, `passwordHistorySize`, `passwordExpiryForAdmin`, `cacheExpiration`, `enableRFC7613UsercaseMappedProfile` FROM `orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertie` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertie`
--
INSERT INTO `orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertie`(`usersPath`, `groupsPath`, `systemRelativePath`, `defaultDepth`, `importBehavior`, `passwordHashAlgorithm`, `passwordHashIterations`, `passwordSaltSize`, `omitAdminPw`, `supportAutoSave`, `passwordMaxAge`, `initialPasswordChange`, `passwordHistorySize`, `passwordExpiryForAdmin`, `cacheExpiration`, `enableRFC7613UsercaseMappedProfile`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertie`
--
UPDATE `orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertie` SET `usersPath` = ?, `groupsPath` = ?, `systemRelativePath` = ?, `defaultDepth` = ?, `importBehavior` = ?, `passwordHashAlgorithm` = ?, `passwordHashIterations` = ?, `passwordSaltSize` = ?, `omitAdminPw` = ?, `supportAutoSave` = ?, `passwordMaxAge` = ?, `initialPasswordChange` = ?, `passwordHistorySize` = ?, `passwordExpiryForAdmin` = ?, `cacheExpiration` = ?, `enableRFC7613UsercaseMappedProfile` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertie`
--
DELETE FROM `orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertie` WHERE 0;

