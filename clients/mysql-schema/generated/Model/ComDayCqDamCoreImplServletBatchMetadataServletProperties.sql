--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletBatchMetadataServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletBatchMetadataServletProperties`
--
SELECT `cq.dam.batch.metadata.asset.default`, `cq.dam.batch.metadata.collection.default`, `cq.dam.batch.metadata.maxresources` FROM `comDayCqDamCoreImplServletBatchMetadataServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletBatchMetadataServletProperties`
--
INSERT INTO `comDayCqDamCoreImplServletBatchMetadataServletProperties`(`cq.dam.batch.metadata.asset.default`, `cq.dam.batch.metadata.collection.default`, `cq.dam.batch.metadata.maxresources`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletBatchMetadataServletProperties`
--
UPDATE `comDayCqDamCoreImplServletBatchMetadataServletProperties` SET `cq.dam.batch.metadata.asset.default` = ?, `cq.dam.batch.metadata.collection.default` = ?, `cq.dam.batch.metadata.maxresources` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletBatchMetadataServletProperties`
--
DELETE FROM `comDayCqDamCoreImplServletBatchMetadataServletProperties` WHERE 0;

