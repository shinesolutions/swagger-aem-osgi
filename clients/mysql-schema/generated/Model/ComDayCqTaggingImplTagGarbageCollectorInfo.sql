--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqTaggingImplTagGarbageCollectorInfo' definition.
--


--
-- SELECT template for table `comDayCqTaggingImplTagGarbageCollectorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqTaggingImplTagGarbageCollectorInfo` WHERE 1;

--
-- INSERT template for table `comDayCqTaggingImplTagGarbageCollectorInfo`
--
INSERT INTO `comDayCqTaggingImplTagGarbageCollectorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqTaggingImplTagGarbageCollectorInfo`
--
UPDATE `comDayCqTaggingImplTagGarbageCollectorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqTaggingImplTagGarbageCollectorInfo`
--
DELETE FROM `comDayCqTaggingImplTagGarbageCollectorInfo` WHERE 0;

