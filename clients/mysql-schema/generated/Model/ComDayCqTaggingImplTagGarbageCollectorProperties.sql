--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqTaggingImplTagGarbageCollectorProperties' definition.
--


--
-- SELECT template for table `comDayCqTaggingImplTagGarbageCollectorProperties`
--
SELECT `scheduler.expression` FROM `comDayCqTaggingImplTagGarbageCollectorProperties` WHERE 1;

--
-- INSERT template for table `comDayCqTaggingImplTagGarbageCollectorProperties`
--
INSERT INTO `comDayCqTaggingImplTagGarbageCollectorProperties`(`scheduler.expression`) VALUES (?);

--
-- UPDATE template for table `comDayCqTaggingImplTagGarbageCollectorProperties`
--
UPDATE `comDayCqTaggingImplTagGarbageCollectorProperties` SET `scheduler.expression` = ? WHERE 1;

--
-- DELETE template for table `comDayCqTaggingImplTagGarbageCollectorProperties`
--
DELETE FROM `comDayCqTaggingImplTagGarbageCollectorProperties` WHERE 0;

