--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_resource_internal_jcr_system_user_validato'
--
SELECT allow/only/system/user FROM org_apache_sling_jcr_resource_internal_jcr_system_user_validato WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_resource_internal_jcr_system_user_validato'
--
INSERT INTO org_apache_sling_jcr_resource_internal_jcr_system_user_validato (allow/only/system/user) VALUES (?);

--
-- UPDATE template for table 'org_apache_sling_jcr_resource_internal_jcr_system_user_validato'
--
UPDATE org_apache_sling_jcr_resource_internal_jcr_system_user_validato SET allow/only/system/user = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_resource_internal_jcr_system_user_validato'
--
DELETE FROM org_apache_sling_jcr_resource_internal_jcr_system_user_validato WHERE 1=2;

