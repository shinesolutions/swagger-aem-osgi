--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum`
--
SELECT `job.topics` FROM `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum`
--
INSERT INTO `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum`(`job.topics`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum`
--
UPDATE `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum` SET `job.topics` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum`
--
DELETE FROM `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum` WHERE 0;

