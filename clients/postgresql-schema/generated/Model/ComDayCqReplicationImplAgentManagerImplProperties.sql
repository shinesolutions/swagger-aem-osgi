--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReplicationImplAgentManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_replication_impl_agent_manager_impl_properties'
--
SELECT job/topics, service_user/target, agent_provider/target FROM com_day_cq_replication_impl_agent_manager_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_replication_impl_agent_manager_impl_properties'
--
INSERT INTO com_day_cq_replication_impl_agent_manager_impl_properties (job/topics, service_user/target, agent_provider/target) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_replication_impl_agent_manager_impl_properties'
--
UPDATE com_day_cq_replication_impl_agent_manager_impl_properties SET job/topics = ?, service_user/target = ?, agent_provider/target = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_replication_impl_agent_manager_impl_properties'
--
DELETE FROM com_day_cq_replication_impl_agent_manager_impl_properties WHERE 1=2;

