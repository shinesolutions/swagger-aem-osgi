--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_agent_impl_sync_distribution_agen'
--
SELECT pid, title, description, properties FROM org_apache_sling_distribution_agent_impl_sync_distribution_agen WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_agent_impl_sync_distribution_agen'
--
INSERT INTO org_apache_sling_distribution_agent_impl_sync_distribution_agen (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_agent_impl_sync_distribution_agen'
--
UPDATE org_apache_sling_distribution_agent_impl_sync_distribution_agen SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_agent_impl_sync_distribution_agen'
--
DELETE FROM org_apache_sling_distribution_agent_impl_sync_distribution_agen WHERE 1=2;

