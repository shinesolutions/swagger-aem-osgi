--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMcmImplMCMConfigurationInfo' definition.
--


--
-- SELECT template for table `comDayCqMcmImplMCMConfigurationInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqMcmImplMCMConfigurationInfo` WHERE 1;

--
-- INSERT template for table `comDayCqMcmImplMCMConfigurationInfo`
--
INSERT INTO `comDayCqMcmImplMCMConfigurationInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqMcmImplMCMConfigurationInfo`
--
UPDATE `comDayCqMcmImplMCMConfigurationInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMcmImplMCMConfigurationInfo`
--
DELETE FROM `comDayCqMcmImplMCMConfigurationInfo` WHERE 0;

