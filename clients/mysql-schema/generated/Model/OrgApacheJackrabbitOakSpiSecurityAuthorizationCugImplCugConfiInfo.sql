--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInf`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInf` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInf`
--
INSERT INTO `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInf`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInf`
--
UPDATE `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInf` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInf`
--
DELETE FROM `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInf` WHERE 0;

