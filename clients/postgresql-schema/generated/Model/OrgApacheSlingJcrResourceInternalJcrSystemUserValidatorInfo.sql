--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_resource_internal_jcr_system_user_validato'
--
SELECT pid, title, description, properties FROM org_apache_sling_jcr_resource_internal_jcr_system_user_validato WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_resource_internal_jcr_system_user_validato'
--
INSERT INTO org_apache_sling_jcr_resource_internal_jcr_system_user_validato (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_resource_internal_jcr_system_user_validato'
--
UPDATE org_apache_sling_jcr_resource_internal_jcr_system_user_validato SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_resource_internal_jcr_system_user_validato'
--
DELETE FROM org_apache_sling_jcr_resource_internal_jcr_system_user_validato WHERE 1=2;

