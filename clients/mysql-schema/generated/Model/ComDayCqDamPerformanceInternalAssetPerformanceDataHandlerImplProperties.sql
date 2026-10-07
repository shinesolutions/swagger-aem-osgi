--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPro`
--
SELECT `batch.commit.size` FROM `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPro` WHERE 1;

--
-- INSERT template for table `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPro`
--
INSERT INTO `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPro`(`batch.commit.size`) VALUES (?);

--
-- UPDATE template for table `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPro`
--
UPDATE `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPro` SET `batch.commit.size` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPro`
--
DELETE FROM `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPro` WHERE 0;

