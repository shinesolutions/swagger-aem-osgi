--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqSecurityACLSetupInfo' definition.
--


--
-- SELECT template for table `comDayCqSecurityACLSetupInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqSecurityACLSetupInfo` WHERE 1;

--
-- INSERT template for table `comDayCqSecurityACLSetupInfo`
--
INSERT INTO `comDayCqSecurityACLSetupInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqSecurityACLSetupInfo`
--
UPDATE `comDayCqSecurityACLSetupInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqSecurityACLSetupInfo`
--
DELETE FROM `comDayCqSecurityACLSetupInfo` WHERE 0;

