--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqContentsyncImplContentSyncManagerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqContentsyncImplContentSyncManagerImplProperties`
--
SELECT `contentsync.fallback.authorizable`, `contentsync.fallback.updateuser` FROM `comDayCqContentsyncImplContentSyncManagerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqContentsyncImplContentSyncManagerImplProperties`
--
INSERT INTO `comDayCqContentsyncImplContentSyncManagerImplProperties`(`contentsync.fallback.authorizable`, `contentsync.fallback.updateuser`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqContentsyncImplContentSyncManagerImplProperties`
--
UPDATE `comDayCqContentsyncImplContentSyncManagerImplProperties` SET `contentsync.fallback.authorizable` = ?, `contentsync.fallback.updateuser` = ? WHERE 1;

--
-- DELETE template for table `comDayCqContentsyncImplContentSyncManagerImplProperties`
--
DELETE FROM `comDayCqContentsyncImplContentSyncManagerImplProperties` WHERE 0;

