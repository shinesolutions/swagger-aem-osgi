--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplScriptableHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_hc_core_impl_scriptable_health_check_propertie'
--
SELECT hc/name, hc/tags, hc/mbean/name, "expression", language/extension FROM org_apache_sling_hc_core_impl_scriptable_health_check_propertie WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_hc_core_impl_scriptable_health_check_propertie'
--
INSERT INTO org_apache_sling_hc_core_impl_scriptable_health_check_propertie (hc/name, hc/tags, hc/mbean/name, "expression", language/extension) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_hc_core_impl_scriptable_health_check_propertie'
--
UPDATE org_apache_sling_hc_core_impl_scriptable_health_check_propertie SET hc/name = ?, hc/tags = ?, hc/mbean/name = ?, "expression" = ?, language/extension = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_hc_core_impl_scriptable_health_check_propertie'
--
DELETE FROM org_apache_sling_hc_core_impl_scriptable_health_check_propertie WHERE 1=2;

