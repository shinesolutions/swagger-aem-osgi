--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqJcrclustersupportClusterStartLevelControllerProperties' definition.
--


--
-- SELECT template for table `comDayCqJcrclustersupportClusterStartLevelControllerProperties`
--
SELECT `cluster.level.enable`, `cluster.master.level`, `cluster.slave.level` FROM `comDayCqJcrclustersupportClusterStartLevelControllerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqJcrclustersupportClusterStartLevelControllerProperties`
--
INSERT INTO `comDayCqJcrclustersupportClusterStartLevelControllerProperties`(`cluster.level.enable`, `cluster.master.level`, `cluster.slave.level`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqJcrclustersupportClusterStartLevelControllerProperties`
--
UPDATE `comDayCqJcrclustersupportClusterStartLevelControllerProperties` SET `cluster.level.enable` = ?, `cluster.master.level` = ?, `cluster.slave.level` = ? WHERE 1;

--
-- DELETE template for table `comDayCqJcrclustersupportClusterStartLevelControllerProperties`
--
DELETE FROM `comDayCqJcrclustersupportClusterStartLevelControllerProperties` WHERE 0;

