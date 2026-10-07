--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService`
--
INSERT INTO `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService`
--
UPDATE `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService`
--
DELETE FROM `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService` WHERE 0;

