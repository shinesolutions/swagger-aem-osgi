--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_agent_impl_privilege_distribution'
--
SELECT "name", jcr_privilege FROM org_apache_sling_distribution_agent_impl_privilege_distribution WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_agent_impl_privilege_distribution'
--
INSERT INTO org_apache_sling_distribution_agent_impl_privilege_distribution ("name", jcr_privilege) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_agent_impl_privilege_distribution'
--
UPDATE org_apache_sling_distribution_agent_impl_privilege_distribution SET "name" = ?, jcr_privilege = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_agent_impl_privilege_distribution'
--
DELETE FROM org_apache_sling_distribution_agent_impl_privilege_distribution WHERE 1=2;

