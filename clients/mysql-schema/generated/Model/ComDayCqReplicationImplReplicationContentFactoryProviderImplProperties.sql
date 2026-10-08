--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplReplicationContentFactoryProviderImplProperties' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplReplicationContentFactoryProviderImplProp`
--
SELECT `replication.content.useFileStorage`, `replication.content.maxCommitAttempts` FROM `comDayCqReplicationImplReplicationContentFactoryProviderImplProp` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplReplicationContentFactoryProviderImplProp`
--
INSERT INTO `comDayCqReplicationImplReplicationContentFactoryProviderImplProp`(`replication.content.useFileStorage`, `replication.content.maxCommitAttempts`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplReplicationContentFactoryProviderImplProp`
--
UPDATE `comDayCqReplicationImplReplicationContentFactoryProviderImplProp` SET `replication.content.useFileStorage` = ?, `replication.content.maxCommitAttempts` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplReplicationContentFactoryProviderImplProp`
--
DELETE FROM `comDayCqReplicationImplReplicationContentFactoryProviderImplProp` WHERE 0;

