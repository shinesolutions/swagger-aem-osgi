--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplEventDamEventAuditListenerProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplEventDamEventAuditListenerProperties`
--
SELECT `event.filter`, `enabled` FROM `comDayCqDamCoreImplEventDamEventAuditListenerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplEventDamEventAuditListenerProperties`
--
INSERT INTO `comDayCqDamCoreImplEventDamEventAuditListenerProperties`(`event.filter`, `enabled`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplEventDamEventAuditListenerProperties`
--
UPDATE `comDayCqDamCoreImplEventDamEventAuditListenerProperties` SET `event.filter` = ?, `enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplEventDamEventAuditListenerProperties`
--
DELETE FROM `comDayCqDamCoreImplEventDamEventAuditListenerProperties` WHERE 0;

