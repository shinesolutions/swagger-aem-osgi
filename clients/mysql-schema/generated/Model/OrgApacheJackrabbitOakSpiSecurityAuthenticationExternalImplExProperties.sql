--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPro`
--
SELECT `jaas.ranking`, `jaas.controlFlag`, `jaas.realmName`, `idp.name`, `sync.handlerName` FROM `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPro` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPro`
--
INSERT INTO `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPro`(`jaas.ranking`, `jaas.controlFlag`, `jaas.realmName`, `idp.name`, `sync.handlerName`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPro`
--
UPDATE `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPro` SET `jaas.ranking` = ?, `jaas.controlFlag` = ?, `jaas.realmName` = ?, `idp.name` = ?, `sync.handlerName` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPro`
--
DELETE FROM `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPro` WHERE 0;

