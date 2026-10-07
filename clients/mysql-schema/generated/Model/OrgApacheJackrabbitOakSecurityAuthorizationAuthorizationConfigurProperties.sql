--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur`
--
SELECT `permissionsJr2`, `importBehavior`, `readPaths`, `administrativePrincipals`, `configurationRanking` FROM `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur`
--
INSERT INTO `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur`(`permissionsJr2`, `importBehavior`, `readPaths`, `administrativePrincipals`, `configurationRanking`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur`
--
UPDATE `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur` SET `permissionsJr2` = ?, `importBehavior` = ?, `readPaths` = ?, `administrativePrincipals` = ?, `configurationRanking` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur`
--
DELETE FROM `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur` WHERE 0;

