--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletCollectionServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletCollectionServletProperties`
--
SELECT `cq.dam.batch.collection.properties`, `cq.dam.batch.collection.maxcollections` FROM `comDayCqDamCoreImplServletCollectionServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletCollectionServletProperties`
--
INSERT INTO `comDayCqDamCoreImplServletCollectionServletProperties`(`cq.dam.batch.collection.properties`, `cq.dam.batch.collection.maxcollections`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletCollectionServletProperties`
--
UPDATE `comDayCqDamCoreImplServletCollectionServletProperties` SET `cq.dam.batch.collection.properties` = ?, `cq.dam.batch.collection.maxcollections` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletCollectionServletProperties`
--
DELETE FROM `comDayCqDamCoreImplServletCollectionServletProperties` WHERE 0;

