--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamIdsImplIDSJobProcessorProperties' definition.
--


--
-- SELECT template for table `comDayCqDamIdsImplIDSJobProcessorProperties`
--
SELECT `enable.multisession`, `ids.cc.enable`, `enable.retry`, `enable.retry.scripterror`, `externalizer.domain.cqhost`, `externalizer.domain.http` FROM `comDayCqDamIdsImplIDSJobProcessorProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamIdsImplIDSJobProcessorProperties`
--
INSERT INTO `comDayCqDamIdsImplIDSJobProcessorProperties`(`enable.multisession`, `ids.cc.enable`, `enable.retry`, `enable.retry.scripterror`, `externalizer.domain.cqhost`, `externalizer.domain.http`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamIdsImplIDSJobProcessorProperties`
--
UPDATE `comDayCqDamIdsImplIDSJobProcessorProperties` SET `enable.multisession` = ?, `ids.cc.enable` = ?, `enable.retry` = ?, `enable.retry.scripterror` = ?, `externalizer.domain.cqhost` = ?, `externalizer.domain.http` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamIdsImplIDSJobProcessorProperties`
--
DELETE FROM `comDayCqDamIdsImplIDSJobProcessorProperties` WHERE 0;

