--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum`
--
INSERT INTO `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum`
--
UPDATE `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum`
--
DELETE FROM `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum` WHERE 0;

