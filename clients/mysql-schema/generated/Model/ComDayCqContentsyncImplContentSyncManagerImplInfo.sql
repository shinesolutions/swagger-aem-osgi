--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqContentsyncImplContentSyncManagerImplInfo' definition.
--


--
-- SELECT template for table `comDayCqContentsyncImplContentSyncManagerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqContentsyncImplContentSyncManagerImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqContentsyncImplContentSyncManagerImplInfo`
--
INSERT INTO `comDayCqContentsyncImplContentSyncManagerImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqContentsyncImplContentSyncManagerImplInfo`
--
UPDATE `comDayCqContentsyncImplContentSyncManagerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqContentsyncImplContentSyncManagerImplInfo`
--
DELETE FROM `comDayCqContentsyncImplContentSyncManagerImplInfo` WHERE 0;

