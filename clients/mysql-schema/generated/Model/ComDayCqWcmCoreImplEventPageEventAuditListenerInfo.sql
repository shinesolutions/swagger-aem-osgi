--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplEventPageEventAuditListenerInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplEventPageEventAuditListenerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmCoreImplEventPageEventAuditListenerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplEventPageEventAuditListenerInfo`
--
INSERT INTO `comDayCqWcmCoreImplEventPageEventAuditListenerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplEventPageEventAuditListenerInfo`
--
UPDATE `comDayCqWcmCoreImplEventPageEventAuditListenerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplEventPageEventAuditListenerInfo`
--
DELETE FROM `comDayCqWcmCoreImplEventPageEventAuditListenerInfo` WHERE 0;

