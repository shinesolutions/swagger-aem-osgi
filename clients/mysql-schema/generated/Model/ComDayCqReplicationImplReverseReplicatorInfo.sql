--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplReverseReplicatorInfo' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplReverseReplicatorInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `comDayCqReplicationImplReverseReplicatorInfo` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplReverseReplicatorInfo`
--
INSERT INTO `comDayCqReplicationImplReverseReplicatorInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplReverseReplicatorInfo`
--
UPDATE `comDayCqReplicationImplReverseReplicatorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplReverseReplicatorInfo`
--
DELETE FROM `comDayCqReplicationImplReverseReplicatorInfo` WHERE 0;

