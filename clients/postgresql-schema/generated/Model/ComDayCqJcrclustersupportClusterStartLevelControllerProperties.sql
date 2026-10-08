--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqJcrclustersupportClusterStartLevelControllerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_jcrclustersupport_cluster_start_level_controller_pro'
--
SELECT cluster/level/enable, cluster/master/level, cluster/slave/level FROM com_day_cq_jcrclustersupport_cluster_start_level_controller_pro WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_jcrclustersupport_cluster_start_level_controller_pro'
--
INSERT INTO com_day_cq_jcrclustersupport_cluster_start_level_controller_pro (cluster/level/enable, cluster/master/level, cluster/slave/level) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_jcrclustersupport_cluster_start_level_controller_pro'
--
UPDATE com_day_cq_jcrclustersupport_cluster_start_level_controller_pro SET cluster/level/enable = ?, cluster/master/level = ?, cluster/slave/level = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_jcrclustersupport_cluster_start_level_controller_pro'
--
DELETE FROM com_day_cq_jcrclustersupport_cluster_start_level_controller_pro WHERE 1=2;

