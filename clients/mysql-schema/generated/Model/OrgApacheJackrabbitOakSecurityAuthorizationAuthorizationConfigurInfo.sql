--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur`
--
INSERT INTO `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur`
--
UPDATE `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur`
--
DELETE FROM `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur` WHERE 0;

