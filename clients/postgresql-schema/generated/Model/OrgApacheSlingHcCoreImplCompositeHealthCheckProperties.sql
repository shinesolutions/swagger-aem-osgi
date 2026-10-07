--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplCompositeHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_hc_core_impl_composite_health_check_properties'
--
SELECT hc/name, hc/tags, hc/mbean/name, filter/tags, filter/combine_tags_with_or FROM org_apache_sling_hc_core_impl_composite_health_check_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_hc_core_impl_composite_health_check_properties'
--
INSERT INTO org_apache_sling_hc_core_impl_composite_health_check_properties (hc/name, hc/tags, hc/mbean/name, filter/tags, filter/combine_tags_with_or) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_hc_core_impl_composite_health_check_properties'
--
UPDATE org_apache_sling_hc_core_impl_composite_health_check_properties SET hc/name = ?, hc/tags = ?, hc/mbean/name = ?, filter/tags = ?, filter/combine_tags_with_or = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_hc_core_impl_composite_health_check_properties'
--
DELETE FROM org_apache_sling_hc_core_impl_composite_health_check_properties WHERE 1=2;

