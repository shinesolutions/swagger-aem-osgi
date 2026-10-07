--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa'
--
INSERT INTO org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa'
--
UPDATE org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa'
--
DELETE FROM org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa WHERE 1=2;

