--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplReverseReplicatorProperties' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplReverseReplicatorProperties`
--
SELECT `scheduler.period` FROM `comDayCqReplicationImplReverseReplicatorProperties` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplReverseReplicatorProperties`
--
INSERT INTO `comDayCqReplicationImplReverseReplicatorProperties`(`scheduler.period`) VALUES (?);

--
-- UPDATE template for table `comDayCqReplicationImplReverseReplicatorProperties`
--
UPDATE `comDayCqReplicationImplReverseReplicatorProperties` SET `scheduler.period` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplReverseReplicatorProperties`
--
DELETE FROM `comDayCqReplicationImplReverseReplicatorProperties` WHERE 0;

