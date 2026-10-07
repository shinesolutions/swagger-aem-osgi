--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_agent_impl_simple_distribution_ag'
--
SELECT "name", title, details, enabled, service_name, log/level, queue/processing/enabled, package_exporter/target, package_importer/target, request_authorization_strategy/target, triggers/target FROM org_apache_sling_distribution_agent_impl_simple_distribution_ag WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_agent_impl_simple_distribution_ag'
--
INSERT INTO org_apache_sling_distribution_agent_impl_simple_distribution_ag ("name", title, details, enabled, service_name, log/level, queue/processing/enabled, package_exporter/target, package_importer/target, request_authorization_strategy/target, triggers/target) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_agent_impl_simple_distribution_ag'
--
UPDATE org_apache_sling_distribution_agent_impl_simple_distribution_ag SET "name" = ?, title = ?, details = ?, enabled = ?, service_name = ?, log/level = ?, queue/processing/enabled = ?, package_exporter/target = ?, package_importer/target = ?, request_authorization_strategy/target = ?, triggers/target = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_agent_impl_simple_distribution_ag'
--
DELETE FROM org_apache_sling_distribution_agent_impl_simple_distribution_ag WHERE 1=2;

