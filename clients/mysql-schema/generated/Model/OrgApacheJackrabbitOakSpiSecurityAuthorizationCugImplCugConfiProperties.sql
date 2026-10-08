--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPro`
--
SELECT `cugSupportedPaths`, `cugEnabled`, `configurationRanking` FROM `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPro` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPro`
--
INSERT INTO `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPro`(`cugSupportedPaths`, `cugEnabled`, `configurationRanking`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPro`
--
UPDATE `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPro` SET `cugSupportedPaths` = ?, `cugEnabled` = ?, `configurationRanking` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPro`
--
DELETE FROM `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPro` WHERE 0;

