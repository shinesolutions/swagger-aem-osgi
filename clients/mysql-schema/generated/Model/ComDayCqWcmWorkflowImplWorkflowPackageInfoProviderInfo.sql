--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo`
--
INSERT INTO `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo`
--
UPDATE `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo`
--
DELETE FROM `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo` WHERE 0;

