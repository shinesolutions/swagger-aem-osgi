--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_agent_impl_forward_distribution_a'
--
SELECT "name", title, details, enabled, service_name, log/level, allowed/roots, queue/processing/enabled, package_importer/endpoints, passive_queues, priority_queues, retry/strategy, retry/attempts, request_authorization_strategy/target, transport_secret_provider/target, package_builder/target, triggers/target, queue/provider, async/delivery, http/conn/timeout FROM org_apache_sling_distribution_agent_impl_forward_distribution_a WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_agent_impl_forward_distribution_a'
--
INSERT INTO org_apache_sling_distribution_agent_impl_forward_distribution_a ("name", title, details, enabled, service_name, log/level, allowed/roots, queue/processing/enabled, package_importer/endpoints, passive_queues, priority_queues, retry/strategy, retry/attempts, request_authorization_strategy/target, transport_secret_provider/target, package_builder/target, triggers/target, queue/provider, async/delivery, http/conn/timeout) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_agent_impl_forward_distribution_a'
--
UPDATE org_apache_sling_distribution_agent_impl_forward_distribution_a SET "name" = ?, title = ?, details = ?, enabled = ?, service_name = ?, log/level = ?, allowed/roots = ?, queue/processing/enabled = ?, package_importer/endpoints = ?, passive_queues = ?, priority_queues = ?, retry/strategy = ?, retry/attempts = ?, request_authorization_strategy/target = ?, transport_secret_provider/target = ?, package_builder/target = ?, triggers/target = ?, queue/provider = ?, async/delivery = ?, http/conn/timeout = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_agent_impl_forward_distribution_a'
--
DELETE FROM org_apache_sling_distribution_agent_impl_forward_distribution_a WHERE 1=2;

