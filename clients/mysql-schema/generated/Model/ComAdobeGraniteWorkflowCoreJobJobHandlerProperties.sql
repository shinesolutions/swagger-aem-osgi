--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreJobJobHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreJobJobHandlerProperties`
--
SELECT `job.topics`, `allow.self.process.termination` FROM `comAdobeGraniteWorkflowCoreJobJobHandlerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreJobJobHandlerProperties`
--
INSERT INTO `comAdobeGraniteWorkflowCoreJobJobHandlerProperties`(`job.topics`, `allow.self.process.termination`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreJobJobHandlerProperties`
--
UPDATE `comAdobeGraniteWorkflowCoreJobJobHandlerProperties` SET `job.topics` = ?, `allow.self.process.termination` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreJobJobHandlerProperties`
--
DELETE FROM `comAdobeGraniteWorkflowCoreJobJobHandlerProperties` WHERE 0;

