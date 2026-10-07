--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties`
--
SELECT `granite.workflowinbox.sort.propertyName`, `granite.workflowinbox.sort.order`, `cq.workflow.job.retry`, `cq.workflow.superuser`, `granite.workflow.inboxQuerySize`, `granite.workflow.adminUserGroupFilter`, `granite.workflow.enforceWorkitemAssigneePermissions`, `granite.workflow.enforceWorkflowInitiatorPermissions`, `granite.workflow.injectTenantIdInJobTopics`, `granite.workflow.maxPurgeSaveThreshold`, `granite.workflow.maxPurgeQueryCount` FROM `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties`
--
INSERT INTO `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties`(`granite.workflowinbox.sort.propertyName`, `granite.workflowinbox.sort.order`, `cq.workflow.job.retry`, `cq.workflow.superuser`, `granite.workflow.inboxQuerySize`, `granite.workflow.adminUserGroupFilter`, `granite.workflow.enforceWorkitemAssigneePermissions`, `granite.workflow.enforceWorkflowInitiatorPermissions`, `granite.workflow.injectTenantIdInJobTopics`, `granite.workflow.maxPurgeSaveThreshold`, `granite.workflow.maxPurgeQueryCount`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties`
--
UPDATE `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties` SET `granite.workflowinbox.sort.propertyName` = ?, `granite.workflowinbox.sort.order` = ?, `cq.workflow.job.retry` = ?, `cq.workflow.superuser` = ?, `granite.workflow.inboxQuerySize` = ?, `granite.workflow.adminUserGroupFilter` = ?, `granite.workflow.enforceWorkitemAssigneePermissions` = ?, `granite.workflow.enforceWorkflowInitiatorPermissions` = ?, `granite.workflow.injectTenantIdInJobTopics` = ?, `granite.workflow.maxPurgeSaveThreshold` = ?, `granite.workflow.maxPurgeQueryCount` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties`
--
DELETE FROM `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties` WHERE 0;

