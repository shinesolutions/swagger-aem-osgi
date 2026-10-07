--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletAssetStatusServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletAssetStatusServletProperties`
--
SELECT `cq.dam.batch.status.maxassets` FROM `comDayCqDamCoreImplServletAssetStatusServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletAssetStatusServletProperties`
--
INSERT INTO `comDayCqDamCoreImplServletAssetStatusServletProperties`(`cq.dam.batch.status.maxassets`) VALUES (?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletAssetStatusServletProperties`
--
UPDATE `comDayCqDamCoreImplServletAssetStatusServletProperties` SET `cq.dam.batch.status.maxassets` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletAssetStatusServletProperties`
--
DELETE FROM `comDayCqDamCoreImplServletAssetStatusServletProperties` WHERE 0;

