--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreWorkflowConfigProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreWorkflowConfigProperties`
--
SELECT `cq.workflow.config.workflow.packages.root.path`, `cq.workflow.config.workflow.process.legacy.mode`, `cq.workflow.config.allow.locking` FROM `comAdobeGraniteWorkflowCoreWorkflowConfigProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreWorkflowConfigProperties`
--
INSERT INTO `comAdobeGraniteWorkflowCoreWorkflowConfigProperties`(`cq.workflow.config.workflow.packages.root.path`, `cq.workflow.config.workflow.process.legacy.mode`, `cq.workflow.config.allow.locking`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreWorkflowConfigProperties`
--
UPDATE `comAdobeGraniteWorkflowCoreWorkflowConfigProperties` SET `cq.workflow.config.workflow.packages.root.path` = ?, `cq.workflow.config.workflow.process.legacy.mode` = ?, `cq.workflow.config.allow.locking` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreWorkflowConfigProperties`
--
DELETE FROM `comAdobeGraniteWorkflowCoreWorkflowConfigProperties` WHERE 0;

