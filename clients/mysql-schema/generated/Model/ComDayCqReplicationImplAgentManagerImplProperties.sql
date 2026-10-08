--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplAgentManagerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplAgentManagerImplProperties`
--
SELECT `job.topics`, `serviceUser.target`, `agentProvider.target` FROM `comDayCqReplicationImplAgentManagerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplAgentManagerImplProperties`
--
INSERT INTO `comDayCqReplicationImplAgentManagerImplProperties`(`job.topics`, `serviceUser.target`, `agentProvider.target`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplAgentManagerImplProperties`
--
UPDATE `comDayCqReplicationImplAgentManagerImplProperties` SET `job.topics` = ?, `serviceUser.target` = ?, `agentProvider.target` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplAgentManagerImplProperties`
--
DELETE FROM `comDayCqReplicationImplAgentManagerImplProperties` WHERE 0;

