--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraP`
--
SELECT `tokenExpiration`, `tokenLength`, `tokenRefresh`, `tokenCleanupThreshold`, `passwordHashAlgorithm`, `passwordHashIterations`, `passwordSaltSize` FROM `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraP` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraP`
--
INSERT INTO `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraP`(`tokenExpiration`, `tokenLength`, `tokenRefresh`, `tokenCleanupThreshold`, `passwordHashAlgorithm`, `passwordHashIterations`, `passwordSaltSize`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraP`
--
UPDATE `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraP` SET `tokenExpiration` = ?, `tokenLength` = ?, `tokenRefresh` = ?, `tokenCleanupThreshold` = ?, `passwordHashAlgorithm` = ?, `passwordHashIterations` = ?, `passwordSaltSize` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraP`
--
DELETE FROM `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraP` WHERE 0;

