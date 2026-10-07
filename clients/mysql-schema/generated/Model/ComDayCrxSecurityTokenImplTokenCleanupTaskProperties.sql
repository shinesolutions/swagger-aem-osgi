--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCrxSecurityTokenImplTokenCleanupTaskProperties' definition.
--


--
-- SELECT template for table `comDayCrxSecurityTokenImplTokenCleanupTaskProperties`
--
SELECT `enable.token.cleanup.task`, `scheduler.expression`, `batch.size` FROM `comDayCrxSecurityTokenImplTokenCleanupTaskProperties` WHERE 1;

--
-- INSERT template for table `comDayCrxSecurityTokenImplTokenCleanupTaskProperties`
--
INSERT INTO `comDayCrxSecurityTokenImplTokenCleanupTaskProperties`(`enable.token.cleanup.task`, `scheduler.expression`, `batch.size`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCrxSecurityTokenImplTokenCleanupTaskProperties`
--
UPDATE `comDayCrxSecurityTokenImplTokenCleanupTaskProperties` SET `enable.token.cleanup.task` = ?, `scheduler.expression` = ?, `batch.size` = ? WHERE 1;

--
-- DELETE template for table `comDayCrxSecurityTokenImplTokenCleanupTaskProperties`
--
DELETE FROM `comDayCrxSecurityTokenImplTokenCleanupTaskProperties` WHERE 0;

