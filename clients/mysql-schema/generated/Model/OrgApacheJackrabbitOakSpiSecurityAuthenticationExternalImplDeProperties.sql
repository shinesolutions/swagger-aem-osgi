--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePro`
--
SELECT `handler.name`, `user.expirationTime`, `user.autoMembership`, `user.propertyMapping`, `user.pathPrefix`, `user.membershipExpTime`, `user.membershipNestingDepth`, `user.dynamicMembership`, `user.disableMissing`, `group.expirationTime`, `group.autoMembership`, `group.propertyMapping`, `group.pathPrefix`, `enableRFC7613UsercaseMappedProfile` FROM `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePro` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePro`
--
INSERT INTO `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePro`(`handler.name`, `user.expirationTime`, `user.autoMembership`, `user.propertyMapping`, `user.pathPrefix`, `user.membershipExpTime`, `user.membershipNestingDepth`, `user.dynamicMembership`, `user.disableMissing`, `group.expirationTime`, `group.autoMembership`, `group.propertyMapping`, `group.pathPrefix`, `enableRFC7613UsercaseMappedProfile`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePro`
--
UPDATE `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePro` SET `handler.name` = ?, `user.expirationTime` = ?, `user.autoMembership` = ?, `user.propertyMapping` = ?, `user.pathPrefix` = ?, `user.membershipExpTime` = ?, `user.membershipNestingDepth` = ?, `user.dynamicMembership` = ?, `user.disableMissing` = ?, `group.expirationTime` = ?, `group.autoMembership` = ?, `group.propertyMapping` = ?, `group.pathPrefix` = ?, `enableRFC7613UsercaseMappedProfile` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePro`
--
DELETE FROM `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePro` WHERE 0;

