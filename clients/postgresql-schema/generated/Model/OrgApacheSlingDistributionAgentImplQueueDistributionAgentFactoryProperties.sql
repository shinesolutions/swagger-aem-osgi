--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_agent_impl_queue_distribution_age'
--
SELECT "name", title, details, enabled, service_name, log/level, allowed/roots, request_authorization_strategy/target, queue_provider_factory/target, package_builder/target, triggers/target, priority_queues FROM org_apache_sling_distribution_agent_impl_queue_distribution_age WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_agent_impl_queue_distribution_age'
--
INSERT INTO org_apache_sling_distribution_agent_impl_queue_distribution_age ("name", title, details, enabled, service_name, log/level, allowed/roots, request_authorization_strategy/target, queue_provider_factory/target, package_builder/target, triggers/target, priority_queues) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_agent_impl_queue_distribution_age'
--
UPDATE org_apache_sling_distribution_agent_impl_queue_distribution_age SET "name" = ?, title = ?, details = ?, enabled = ?, service_name = ?, log/level = ?, allowed/roots = ?, request_authorization_strategy/target = ?, queue_provider_factory/target = ?, package_builder/target = ?, triggers/target = ?, priority_queues = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_agent_impl_queue_distribution_age'
--
DELETE FROM org_apache_sling_distribution_agent_impl_queue_distribution_age WHERE 1=2;

