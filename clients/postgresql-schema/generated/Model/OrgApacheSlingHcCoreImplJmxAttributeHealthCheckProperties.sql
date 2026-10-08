--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_hc_core_impl_jmx_attribute_health_check_proper'
--
SELECT hc/name, hc/tags, hc/mbean/name, mbean/name, attribute/name, attribute/value/constraint FROM org_apache_sling_hc_core_impl_jmx_attribute_health_check_proper WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_hc_core_impl_jmx_attribute_health_check_proper'
--
INSERT INTO org_apache_sling_hc_core_impl_jmx_attribute_health_check_proper (hc/name, hc/tags, hc/mbean/name, mbean/name, attribute/name, attribute/value/constraint) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_hc_core_impl_jmx_attribute_health_check_proper'
--
UPDATE org_apache_sling_hc_core_impl_jmx_attribute_health_check_proper SET hc/name = ?, hc/tags = ?, hc/mbean/name = ?, mbean/name = ?, attribute/name = ?, attribute/value/constraint = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_hc_core_impl_jmx_attribute_health_check_proper'
--
DELETE FROM org_apache_sling_hc_core_impl_jmx_attribute_health_check_proper WHERE 1=2;

