--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEngineImplLogRequestLoggerServiceProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingEngineImplLogRequestLoggerServiceProperties`
--
SELECT `request.log.service.format`, `request.log.service.output`, `request.log.service.outputtype`, `request.log.service.onentry` FROM `orgApacheSlingEngineImplLogRequestLoggerServiceProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEngineImplLogRequestLoggerServiceProperties`
--
INSERT INTO `orgApacheSlingEngineImplLogRequestLoggerServiceProperties`(`request.log.service.format`, `request.log.service.output`, `request.log.service.outputtype`, `request.log.service.onentry`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEngineImplLogRequestLoggerServiceProperties`
--
UPDATE `orgApacheSlingEngineImplLogRequestLoggerServiceProperties` SET `request.log.service.format` = ?, `request.log.service.output` = ?, `request.log.service.outputtype` = ?, `request.log.service.onentry` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEngineImplLogRequestLoggerServiceProperties`
--
DELETE FROM `orgApacheSlingEngineImplLogRequestLoggerServiceProperties` WHERE 0;

