--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_agent_impl_simple_distribution_ag'
--
SELECT pid, title, description, properties FROM org_apache_sling_distribution_agent_impl_simple_distribution_ag WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_agent_impl_simple_distribution_ag'
--
INSERT INTO org_apache_sling_distribution_agent_impl_simple_distribution_ag (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_agent_impl_simple_distribution_ag'
--
UPDATE org_apache_sling_distribution_agent_impl_simple_distribution_ag SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_agent_impl_simple_distribution_ag'
--
DELETE FROM org_apache_sling_distribution_agent_impl_simple_distribution_ag WHERE 1=2;

