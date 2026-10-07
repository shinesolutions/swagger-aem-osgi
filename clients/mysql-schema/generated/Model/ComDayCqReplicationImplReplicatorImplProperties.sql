--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplReplicatorImplProperties' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplReplicatorImplProperties`
--
SELECT `distribute_events` FROM `comDayCqReplicationImplReplicatorImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplReplicatorImplProperties`
--
INSERT INTO `comDayCqReplicationImplReplicatorImplProperties`(`distribute_events`) VALUES (?);

--
-- UPDATE template for table `comDayCqReplicationImplReplicatorImplProperties`
--
UPDATE `comDayCqReplicationImplReplicatorImplProperties` SET `distribute_events` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplReplicatorImplProperties`
--
DELETE FROM `comDayCqReplicationImplReplicatorImplProperties` WHERE 0;

