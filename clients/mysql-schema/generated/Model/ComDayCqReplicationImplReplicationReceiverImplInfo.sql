--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplReplicationReceiverImplInfo' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplReplicationReceiverImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqReplicationImplReplicationReceiverImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplReplicationReceiverImplInfo`
--
INSERT INTO `comDayCqReplicationImplReplicationReceiverImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplReplicationReceiverImplInfo`
--
UPDATE `comDayCqReplicationImplReplicationReceiverImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplReplicationReceiverImplInfo`
--
DELETE FROM `comDayCqReplicationImplReplicationReceiverImplInfo` WHERE 0;

