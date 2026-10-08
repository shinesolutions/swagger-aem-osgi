--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplWCMDeveloperModeFilterProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplWCMDeveloperModeFilterProperties`
--
SELECT `wcmdevmodefilter.enabled` FROM `comDayCqWcmCoreImplWCMDeveloperModeFilterProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplWCMDeveloperModeFilterProperties`
--
INSERT INTO `comDayCqWcmCoreImplWCMDeveloperModeFilterProperties`(`wcmdevmodefilter.enabled`) VALUES (?);

--
-- UPDATE template for table `comDayCqWcmCoreImplWCMDeveloperModeFilterProperties`
--
UPDATE `comDayCqWcmCoreImplWCMDeveloperModeFilterProperties` SET `wcmdevmodefilter.enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplWCMDeveloperModeFilterProperties`
--
DELETE FROM `comDayCqWcmCoreImplWCMDeveloperModeFilterProperties` WHERE 0;

