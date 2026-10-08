--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_agent_impl_sync_distribution_agen'
--
SELECT "name", title, details, enabled, service_name, log/level, queue/processing/enabled, passive_queues, package_exporter/endpoints, package_importer/endpoints, retry/strategy, retry/attempts, pull/items, http/conn/timeout, request_authorization_strategy/target, transport_secret_provider/target, package_builder/target, triggers/target FROM org_apache_sling_distribution_agent_impl_sync_distribution_agen WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_agent_impl_sync_distribution_agen'
--
INSERT INTO org_apache_sling_distribution_agent_impl_sync_distribution_agen ("name", title, details, enabled, service_name, log/level, queue/processing/enabled, passive_queues, package_exporter/endpoints, package_importer/endpoints, retry/strategy, retry/attempts, pull/items, http/conn/timeout, request_authorization_strategy/target, transport_secret_provider/target, package_builder/target, triggers/target) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_agent_impl_sync_distribution_agen'
--
UPDATE org_apache_sling_distribution_agent_impl_sync_distribution_agen SET "name" = ?, title = ?, details = ?, enabled = ?, service_name = ?, log/level = ?, queue/processing/enabled = ?, passive_queues = ?, package_exporter/endpoints = ?, package_importer/endpoints = ?, retry/strategy = ?, retry/attempts = ?, pull/items = ?, http/conn/timeout = ?, request_authorization_strategy/target = ?, transport_secret_provider/target = ?, package_builder/target = ?, triggers/target = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_agent_impl_sync_distribution_agen'
--
DELETE FROM org_apache_sling_distribution_agent_impl_sync_distribution_agen WHERE 1=2;

