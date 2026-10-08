--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableIn`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableIn` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableIn`
--
INSERT INTO `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableIn`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableIn`
--
UPDATE `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableIn`
--
DELETE FROM `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableIn` WHERE 0;

