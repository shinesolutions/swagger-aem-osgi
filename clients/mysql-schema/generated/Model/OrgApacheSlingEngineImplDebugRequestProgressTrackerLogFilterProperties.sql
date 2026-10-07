--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProp`
--
SELECT `extensions`, `minDurationMs`, `maxDurationMs`, `compactLogFormat` FROM `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProp` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProp`
--
INSERT INTO `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProp`(`extensions`, `minDurationMs`, `maxDurationMs`, `compactLogFormat`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProp`
--
UPDATE `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProp` SET `extensions` = ?, `minDurationMs` = ?, `maxDurationMs` = ?, `compactLogFormat` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProp`
--
DELETE FROM `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProp` WHERE 0;

