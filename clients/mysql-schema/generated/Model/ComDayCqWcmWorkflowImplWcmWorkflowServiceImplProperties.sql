--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties`
--
SELECT `event.filter`, `minThreadPoolSize`, `maxThreadPoolSize`, `cq.wcm.workflow.terminate.on.activate`, `cq.wcm.worklfow.terminate.exclusion.list` FROM `comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties`
--
INSERT INTO `comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties`(`event.filter`, `minThreadPoolSize`, `maxThreadPoolSize`, `cq.wcm.workflow.terminate.on.activate`, `cq.wcm.worklfow.terminate.exclusion.list`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties`
--
UPDATE `comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties` SET `event.filter` = ?, `minThreadPoolSize` = ?, `maxThreadPoolSize` = ?, `cq.wcm.workflow.terminate.on.activate` = ?, `cq.wcm.worklfow.terminate.exclusion.list` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties`
--
DELETE FROM `comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties` WHERE 0;

