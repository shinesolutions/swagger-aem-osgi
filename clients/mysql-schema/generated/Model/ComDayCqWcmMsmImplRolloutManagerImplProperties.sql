--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplRolloutManagerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplRolloutManagerImplProperties`
--
SELECT `event.filter`, `rolloutmgr.excludedprops.default`, `rolloutmgr.excludedparagraphprops.default`, `rolloutmgr.excludednodetypes.default`, `rolloutmgr.threadpool.maxsize`, `rolloutmgr.threadpool.maxshutdowntime`, `rolloutmgr.threadpool.priority`, `rolloutmgr.commit.size`, `rolloutmgr.conflicthandling.enabled` FROM `comDayCqWcmMsmImplRolloutManagerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplRolloutManagerImplProperties`
--
INSERT INTO `comDayCqWcmMsmImplRolloutManagerImplProperties`(`event.filter`, `rolloutmgr.excludedprops.default`, `rolloutmgr.excludedparagraphprops.default`, `rolloutmgr.excludednodetypes.default`, `rolloutmgr.threadpool.maxsize`, `rolloutmgr.threadpool.maxshutdowntime`, `rolloutmgr.threadpool.priority`, `rolloutmgr.commit.size`, `rolloutmgr.conflicthandling.enabled`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplRolloutManagerImplProperties`
--
UPDATE `comDayCqWcmMsmImplRolloutManagerImplProperties` SET `event.filter` = ?, `rolloutmgr.excludedprops.default` = ?, `rolloutmgr.excludedparagraphprops.default` = ?, `rolloutmgr.excludednodetypes.default` = ?, `rolloutmgr.threadpool.maxsize` = ?, `rolloutmgr.threadpool.maxshutdowntime` = ?, `rolloutmgr.threadpool.priority` = ?, `rolloutmgr.commit.size` = ?, `rolloutmgr.conflicthandling.enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplRolloutManagerImplProperties`
--
DELETE FROM `comDayCqWcmMsmImplRolloutManagerImplProperties` WHERE 0;

