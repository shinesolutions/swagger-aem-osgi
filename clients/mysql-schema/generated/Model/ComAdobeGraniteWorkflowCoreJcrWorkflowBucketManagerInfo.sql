--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo`
--
INSERT INTO `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo`
--
UPDATE `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo`
--
DELETE FROM `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo` WHERE 0;

