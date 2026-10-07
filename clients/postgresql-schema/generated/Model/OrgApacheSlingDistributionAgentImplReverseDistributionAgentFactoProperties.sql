--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_agent_impl_reverse_distribution_a'
--
SELECT "name", title, details, enabled, service_name, log/level, queue/processing/enabled, package_exporter/endpoints, pull/items, http/conn/timeout, request_authorization_strategy/target, transport_secret_provider/target, package_builder/target, triggers/target FROM org_apache_sling_distribution_agent_impl_reverse_distribution_a WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_agent_impl_reverse_distribution_a'
--
INSERT INTO org_apache_sling_distribution_agent_impl_reverse_distribution_a ("name", title, details, enabled, service_name, log/level, queue/processing/enabled, package_exporter/endpoints, pull/items, http/conn/timeout, request_authorization_strategy/target, transport_secret_provider/target, package_builder/target, triggers/target) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_agent_impl_reverse_distribution_a'
--
UPDATE org_apache_sling_distribution_agent_impl_reverse_distribution_a SET "name" = ?, title = ?, details = ?, enabled = ?, service_name = ?, log/level = ?, queue/processing/enabled = ?, package_exporter/endpoints = ?, pull/items = ?, http/conn/timeout = ?, request_authorization_strategy/target = ?, transport_secret_provider/target = ?, package_builder/target = ?, triggers/target = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_agent_impl_reverse_distribution_a'
--
DELETE FROM org_apache_sling_distribution_agent_impl_reverse_distribution_a WHERE 1=2;

