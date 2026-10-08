--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMcmImplMCMConfigurationProperties' definition.
--


--
-- SELECT template for table `comDayCqMcmImplMCMConfigurationProperties`
--
SELECT `experience.indirection`, `touchpoint.indirection` FROM `comDayCqMcmImplMCMConfigurationProperties` WHERE 1;

--
-- INSERT template for table `comDayCqMcmImplMCMConfigurationProperties`
--
INSERT INTO `comDayCqMcmImplMCMConfigurationProperties`(`experience.indirection`, `touchpoint.indirection`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqMcmImplMCMConfigurationProperties`
--
UPDATE `comDayCqMcmImplMCMConfigurationProperties` SET `experience.indirection` = ?, `touchpoint.indirection` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMcmImplMCMConfigurationProperties`
--
DELETE FROM `comDayCqMcmImplMCMConfigurationProperties` WHERE 0;

