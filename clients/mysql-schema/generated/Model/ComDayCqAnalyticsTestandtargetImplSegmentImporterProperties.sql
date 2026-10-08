--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAnalyticsTestandtargetImplSegmentImporterProperties' definition.
--


--
-- SELECT template for table `comDayCqAnalyticsTestandtargetImplSegmentImporterProperties`
--
SELECT `cq.analytics.testandtarget.segmentimporter.enabled` FROM `comDayCqAnalyticsTestandtargetImplSegmentImporterProperties` WHERE 1;

--
-- INSERT template for table `comDayCqAnalyticsTestandtargetImplSegmentImporterProperties`
--
INSERT INTO `comDayCqAnalyticsTestandtargetImplSegmentImporterProperties`(`cq.analytics.testandtarget.segmentimporter.enabled`) VALUES (?);

--
-- UPDATE template for table `comDayCqAnalyticsTestandtargetImplSegmentImporterProperties`
--
UPDATE `comDayCqAnalyticsTestandtargetImplSegmentImporterProperties` SET `cq.analytics.testandtarget.segmentimporter.enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAnalyticsTestandtargetImplSegmentImporterProperties`
--
DELETE FROM `comDayCqAnalyticsTestandtargetImplSegmentImporterProperties` WHERE 0;

