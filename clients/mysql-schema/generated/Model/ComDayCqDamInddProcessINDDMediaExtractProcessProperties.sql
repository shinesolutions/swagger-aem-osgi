--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamInddProcessINDDMediaExtractProcessProperties' definition.
--


--
-- SELECT template for table `comDayCqDamInddProcessINDDMediaExtractProcessProperties`
--
SELECT `process.label`, `cq.dam.indd.pages.regex`, `ids.job.decoupled`, `ids.job.workflow.model` FROM `comDayCqDamInddProcessINDDMediaExtractProcessProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamInddProcessINDDMediaExtractProcessProperties`
--
INSERT INTO `comDayCqDamInddProcessINDDMediaExtractProcessProperties`(`process.label`, `cq.dam.indd.pages.regex`, `ids.job.decoupled`, `ids.job.workflow.model`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamInddProcessINDDMediaExtractProcessProperties`
--
UPDATE `comDayCqDamInddProcessINDDMediaExtractProcessProperties` SET `process.label` = ?, `cq.dam.indd.pages.regex` = ?, `ids.job.decoupled` = ?, `ids.job.workflow.model` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamInddProcessINDDMediaExtractProcessProperties`
--
DELETE FROM `comDayCqDamInddProcessINDDMediaExtractProcessProperties` WHERE 0;

