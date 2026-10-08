--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEngineParametersProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingEngineParametersProperties`
--
SELECT `sling.default.parameter.encoding`, `sling.default.max.parameters`, `file.location`, `file.threshold`, `file.max`, `request.max`, `sling.default.parameter.checkForAdditionalContainerParameters` FROM `orgApacheSlingEngineParametersProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEngineParametersProperties`
--
INSERT INTO `orgApacheSlingEngineParametersProperties`(`sling.default.parameter.encoding`, `sling.default.max.parameters`, `file.location`, `file.threshold`, `file.max`, `request.max`, `sling.default.parameter.checkForAdditionalContainerParameters`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEngineParametersProperties`
--
UPDATE `orgApacheSlingEngineParametersProperties` SET `sling.default.parameter.encoding` = ?, `sling.default.max.parameters` = ?, `file.location` = ?, `file.threshold` = ?, `file.max` = ?, `request.max` = ?, `sling.default.parameter.checkForAdditionalContainerParameters` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEngineParametersProperties`
--
DELETE FROM `orgApacheSlingEngineParametersProperties` WHERE 0;

