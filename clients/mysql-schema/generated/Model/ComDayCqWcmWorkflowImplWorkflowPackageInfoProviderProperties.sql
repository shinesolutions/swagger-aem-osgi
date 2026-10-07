--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties`
--
SELECT `workflowpackageinfoprovider.filter`, `workflowpackageinfoprovider.filter.rootpath` FROM `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties`
--
INSERT INTO `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties`(`workflowpackageinfoprovider.filter`, `workflowpackageinfoprovider.filter.rootpath`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties`
--
UPDATE `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties` SET `workflowpackageinfoprovider.filter` = ?, `workflowpackageinfoprovider.filter.rootpath` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties`
--
DELETE FROM `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties` WHERE 0;

