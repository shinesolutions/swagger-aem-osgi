--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo`
--
INSERT INTO `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo`
--
UPDATE `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo`
--
DELETE FROM `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo` WHERE 0;

