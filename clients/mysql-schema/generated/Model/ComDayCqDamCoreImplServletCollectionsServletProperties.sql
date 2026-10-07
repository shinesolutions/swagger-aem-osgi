--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletCollectionsServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletCollectionsServletProperties`
--
SELECT `cq.dam.batch.collections.properties`, `cq.dam.batch.collections.limit` FROM `comDayCqDamCoreImplServletCollectionsServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletCollectionsServletProperties`
--
INSERT INTO `comDayCqDamCoreImplServletCollectionsServletProperties`(`cq.dam.batch.collections.properties`, `cq.dam.batch.collections.limit`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletCollectionsServletProperties`
--
UPDATE `comDayCqDamCoreImplServletCollectionsServletProperties` SET `cq.dam.batch.collections.properties` = ?, `cq.dam.batch.collections.limit` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletCollectionsServletProperties`
--
DELETE FROM `comDayCqDamCoreImplServletCollectionsServletProperties` WHERE 0;

