--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingTracerInternalLogTracerProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingTracerInternalLogTracerProperties`
--
SELECT `tracerSets`, `enabled`, `servletEnabled`, `recordingCacheSizeInMB`, `recordingCacheDurationInSecs`, `recordingCompressionEnabled`, `gzipResponse` FROM `orgApacheSlingTracerInternalLogTracerProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingTracerInternalLogTracerProperties`
--
INSERT INTO `orgApacheSlingTracerInternalLogTracerProperties`(`tracerSets`, `enabled`, `servletEnabled`, `recordingCacheSizeInMB`, `recordingCacheDurationInSecs`, `recordingCompressionEnabled`, `gzipResponse`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingTracerInternalLogTracerProperties`
--
UPDATE `orgApacheSlingTracerInternalLogTracerProperties` SET `tracerSets` = ?, `enabled` = ?, `servletEnabled` = ?, `recordingCacheSizeInMB` = ?, `recordingCacheDurationInSecs` = ?, `recordingCompressionEnabled` = ?, `gzipResponse` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingTracerInternalLogTracerProperties`
--
DELETE FROM `orgApacheSlingTracerInternalLogTracerProperties` WHERE 0;

