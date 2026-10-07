--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEngineImplLogRequestLoggerProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingEngineImplLogRequestLoggerProperties`
--
SELECT `request.log.output`, `request.log.outputtype`, `request.log.enabled`, `access.log.output`, `access.log.outputtype`, `access.log.enabled` FROM `orgApacheSlingEngineImplLogRequestLoggerProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEngineImplLogRequestLoggerProperties`
--
INSERT INTO `orgApacheSlingEngineImplLogRequestLoggerProperties`(`request.log.output`, `request.log.outputtype`, `request.log.enabled`, `access.log.output`, `access.log.outputtype`, `access.log.enabled`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEngineImplLogRequestLoggerProperties`
--
UPDATE `orgApacheSlingEngineImplLogRequestLoggerProperties` SET `request.log.output` = ?, `request.log.outputtype` = ?, `request.log.enabled` = ?, `access.log.output` = ?, `access.log.outputtype` = ?, `access.log.enabled` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEngineImplLogRequestLoggerProperties`
--
DELETE FROM `orgApacheSlingEngineImplLogRequestLoggerProperties` WHERE 0;

