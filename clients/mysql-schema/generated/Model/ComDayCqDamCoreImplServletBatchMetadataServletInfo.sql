--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletBatchMetadataServletInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletBatchMetadataServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplServletBatchMetadataServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletBatchMetadataServletInfo`
--
INSERT INTO `comDayCqDamCoreImplServletBatchMetadataServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletBatchMetadataServletInfo`
--
UPDATE `comDayCqDamCoreImplServletBatchMetadataServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletBatchMetadataServletInfo`
--
DELETE FROM `comDayCqDamCoreImplServletBatchMetadataServletInfo` WHERE 0;

