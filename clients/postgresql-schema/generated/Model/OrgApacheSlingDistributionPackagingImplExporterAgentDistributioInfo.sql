--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_packaging_impl_exporter_agent_dis'
--
SELECT pid, title, description, properties FROM org_apache_sling_distribution_packaging_impl_exporter_agent_dis WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_packaging_impl_exporter_agent_dis'
--
INSERT INTO org_apache_sling_distribution_packaging_impl_exporter_agent_dis (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_packaging_impl_exporter_agent_dis'
--
UPDATE org_apache_sling_distribution_packaging_impl_exporter_agent_dis SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_packaging_impl_exporter_agent_dis'
--
DELETE FROM org_apache_sling_distribution_packaging_impl_exporter_agent_dis WHERE 1=2;

