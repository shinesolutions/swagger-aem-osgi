--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig`
--
SELECT `org.apache.jackrabbit.oak.authentication.appName`, `org.apache.jackrabbit.oak.authentication.configSpiName` FROM `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig`
--
INSERT INTO `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig`(`org.apache.jackrabbit.oak.authentication.appName`, `org.apache.jackrabbit.oak.authentication.configSpiName`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig`
--
UPDATE `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig` SET `org.apache.jackrabbit.oak.authentication.appName` = ?, `org.apache.jackrabbit.oak.authentication.configSpiName` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig`
--
DELETE FROM `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig` WHERE 0;

