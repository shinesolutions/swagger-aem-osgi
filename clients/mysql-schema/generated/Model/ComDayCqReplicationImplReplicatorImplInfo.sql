--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplReplicatorImplInfo' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplReplicatorImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqReplicationImplReplicatorImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplReplicatorImplInfo`
--
INSERT INTO `comDayCqReplicationImplReplicatorImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplReplicatorImplInfo`
--
UPDATE `comDayCqReplicationImplReplicatorImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplReplicatorImplInfo`
--
DELETE FROM `comDayCqReplicationImplReplicatorImplInfo` WHERE 0;

