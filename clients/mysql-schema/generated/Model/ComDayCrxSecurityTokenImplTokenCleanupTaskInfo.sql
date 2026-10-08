--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCrxSecurityTokenImplTokenCleanupTaskInfo' definition.
--


--
-- SELECT template for table `comDayCrxSecurityTokenImplTokenCleanupTaskInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCrxSecurityTokenImplTokenCleanupTaskInfo` WHERE 1;

--
-- INSERT template for table `comDayCrxSecurityTokenImplTokenCleanupTaskInfo`
--
INSERT INTO `comDayCrxSecurityTokenImplTokenCleanupTaskInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCrxSecurityTokenImplTokenCleanupTaskInfo`
--
UPDATE `comDayCrxSecurityTokenImplTokenCleanupTaskInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCrxSecurityTokenImplTokenCleanupTaskInfo`
--
DELETE FROM `comDayCrxSecurityTokenImplTokenCleanupTaskInfo` WHERE 0;

