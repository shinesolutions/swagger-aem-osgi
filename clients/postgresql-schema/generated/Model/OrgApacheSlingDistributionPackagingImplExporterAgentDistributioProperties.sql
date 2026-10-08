--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_packaging_impl_exporter_agent_dis'
--
SELECT "name", queue, drop/invalid/items, agent/target FROM org_apache_sling_distribution_packaging_impl_exporter_agent_dis WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_packaging_impl_exporter_agent_dis'
--
INSERT INTO org_apache_sling_distribution_packaging_impl_exporter_agent_dis ("name", queue, drop/invalid/items, agent/target) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_packaging_impl_exporter_agent_dis'
--
UPDATE org_apache_sling_distribution_packaging_impl_exporter_agent_dis SET "name" = ?, queue = ?, drop/invalid/items = ?, agent/target = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_packaging_impl_exporter_agent_dis'
--
DELETE FROM org_apache_sling_distribution_packaging_impl_exporter_agent_dis WHERE 1=2;

