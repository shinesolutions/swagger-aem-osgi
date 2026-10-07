--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties`
--
SELECT `scheduler.expression`, `scheduler.concurrent`, `chunk.cleanup.age` FROM `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties`
--
INSERT INTO `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties`(`scheduler.expression`, `scheduler.concurrent`, `chunk.cleanup.age`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties`
--
UPDATE `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties` SET `scheduler.expression` = ?, `scheduler.concurrent` = ?, `chunk.cleanup.age` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties`
--
DELETE FROM `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties` WHERE 0;

