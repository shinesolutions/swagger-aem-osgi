--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig`
--
INSERT INTO `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig`
--
UPDATE `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig`
--
DELETE FROM `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig` WHERE 0;

