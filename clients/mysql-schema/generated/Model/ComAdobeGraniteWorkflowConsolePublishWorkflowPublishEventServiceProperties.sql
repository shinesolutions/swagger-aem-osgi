--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService`
--
SELECT `granite.workflow.WorkflowPublishEventService.enabled` FROM `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService`
--
INSERT INTO `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService`(`granite.workflow.WorkflowPublishEventService.enabled`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService`
--
UPDATE `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService` SET `granite.workflow.WorkflowPublishEventService.enabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService`
--
DELETE FROM `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService` WHERE 0;

