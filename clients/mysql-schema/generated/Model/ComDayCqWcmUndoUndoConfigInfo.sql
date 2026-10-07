--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmUndoUndoConfigInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmUndoUndoConfigInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmUndoUndoConfigInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmUndoUndoConfigInfo`
--
INSERT INTO `comDayCqWcmUndoUndoConfigInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmUndoUndoConfigInfo`
--
UPDATE `comDayCqWcmUndoUndoConfigInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmUndoUndoConfigInfo`
--
DELETE FROM `comDayCqWcmUndoUndoConfigInfo` WHERE 0;

