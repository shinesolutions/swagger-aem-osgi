--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmUndoUndoConfigProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmUndoUndoConfigProperties`
--
SELECT `cq.wcm.undo.enabled`, `cq.wcm.undo.path`, `cq.wcm.undo.validity`, `cq.wcm.undo.steps`, `cq.wcm.undo.persistence`, `cq.wcm.undo.persistence.mode`, `cq.wcm.undo.markermode`, `cq.wcm.undo.whitelist`, `cq.wcm.undo.blacklist` FROM `comDayCqWcmUndoUndoConfigProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmUndoUndoConfigProperties`
--
INSERT INTO `comDayCqWcmUndoUndoConfigProperties`(`cq.wcm.undo.enabled`, `cq.wcm.undo.path`, `cq.wcm.undo.validity`, `cq.wcm.undo.steps`, `cq.wcm.undo.persistence`, `cq.wcm.undo.persistence.mode`, `cq.wcm.undo.markermode`, `cq.wcm.undo.whitelist`, `cq.wcm.undo.blacklist`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmUndoUndoConfigProperties`
--
UPDATE `comDayCqWcmUndoUndoConfigProperties` SET `cq.wcm.undo.enabled` = ?, `cq.wcm.undo.path` = ?, `cq.wcm.undo.validity` = ?, `cq.wcm.undo.steps` = ?, `cq.wcm.undo.persistence` = ?, `cq.wcm.undo.persistence.mode` = ?, `cq.wcm.undo.markermode` = ?, `cq.wcm.undo.whitelist` = ?, `cq.wcm.undo.blacklist` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmUndoUndoConfigProperties`
--
DELETE FROM `comDayCqWcmUndoUndoConfigProperties` WHERE 0;

