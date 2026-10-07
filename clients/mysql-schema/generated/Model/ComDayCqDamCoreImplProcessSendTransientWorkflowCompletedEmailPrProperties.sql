--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrP`
--
SELECT `process.label`, `Notify on Complete` FROM `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrP` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrP`
--
INSERT INTO `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrP`(`process.label`, `Notify on Complete`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrP`
--
UPDATE `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrP` SET `process.label` = ?, `Notify on Complete` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrP`
--
DELETE FROM `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrP` WHERE 0;

