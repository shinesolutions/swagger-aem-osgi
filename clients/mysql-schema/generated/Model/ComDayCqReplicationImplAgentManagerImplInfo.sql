--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplAgentManagerImplInfo' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplAgentManagerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqReplicationImplAgentManagerImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplAgentManagerImplInfo`
--
INSERT INTO `comDayCqReplicationImplAgentManagerImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplAgentManagerImplInfo`
--
UPDATE `comDayCqReplicationImplAgentManagerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplAgentManagerImplInfo`
--
DELETE FROM `comDayCqReplicationImplAgentManagerImplInfo` WHERE 0;

