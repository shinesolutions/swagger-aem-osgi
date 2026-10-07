--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_resourcemerger_impl_merged_resource_provider_f'
--
SELECT merge/root, merge/read_only FROM org_apache_sling_resourcemerger_impl_merged_resource_provider_f WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_resourcemerger_impl_merged_resource_provider_f'
--
INSERT INTO org_apache_sling_resourcemerger_impl_merged_resource_provider_f (merge/root, merge/read_only) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_resourcemerger_impl_merged_resource_provider_f'
--
UPDATE org_apache_sling_resourcemerger_impl_merged_resource_provider_f SET merge/root = ?, merge/read_only = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_resourcemerger_impl_merged_resource_provider_f'
--
DELETE FROM org_apache_sling_resourcemerger_impl_merged_resource_provider_f WHERE 1=2;

