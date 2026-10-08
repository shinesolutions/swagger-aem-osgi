--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplReplicationReceiverImplProperties' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplReplicationReceiverImplProperties`
--
SELECT `receiver.tmpfile.threshold`, `receiver.packages.use.install` FROM `comDayCqReplicationImplReplicationReceiverImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplReplicationReceiverImplProperties`
--
INSERT INTO `comDayCqReplicationImplReplicationReceiverImplProperties`(`receiver.tmpfile.threshold`, `receiver.packages.use.install`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplReplicationReceiverImplProperties`
--
UPDATE `comDayCqReplicationImplReplicationReceiverImplProperties` SET `receiver.tmpfile.threshold` = ?, `receiver.packages.use.install` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplReplicationReceiverImplProperties`
--
DELETE FROM `comDayCqReplicationImplReplicationReceiverImplProperties` WHERE 0;

