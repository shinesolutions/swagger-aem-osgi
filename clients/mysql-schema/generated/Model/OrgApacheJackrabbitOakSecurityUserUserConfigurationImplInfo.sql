--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo`
--
INSERT INTO `orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo`
--
UPDATE `orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo`
--
DELETE FROM `orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo` WHERE 0;

