--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplEventDamEventAuditListenerInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplEventDamEventAuditListenerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplEventDamEventAuditListenerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplEventDamEventAuditListenerInfo`
--
INSERT INTO `comDayCqDamCoreImplEventDamEventAuditListenerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplEventDamEventAuditListenerInfo`
--
UPDATE `comDayCqDamCoreImplEventDamEventAuditListenerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplEventDamEventAuditListenerInfo`
--
DELETE FROM `comDayCqDamCoreImplEventDamEventAuditListenerInfo` WHERE 0;

