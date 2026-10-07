--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationAuditReplicationEventListenerInfo' definition.
--


--
-- SELECT template for table `comDayCqReplicationAuditReplicationEventListenerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqReplicationAuditReplicationEventListenerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationAuditReplicationEventListenerInfo`
--
INSERT INTO `comDayCqReplicationAuditReplicationEventListenerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReplicationAuditReplicationEventListenerInfo`
--
UPDATE `comDayCqReplicationAuditReplicationEventListenerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationAuditReplicationEventListenerInfo`
--
DELETE FROM `comDayCqReplicationAuditReplicationEventListenerInfo` WHERE 0;

