--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingTenantInternalTenantProviderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_tenant_internal_tenant_provider_impl_propertie'
--
SELECT tenant/root, tenant/path/matcher FROM org_apache_sling_tenant_internal_tenant_provider_impl_propertie WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_tenant_internal_tenant_provider_impl_propertie'
--
INSERT INTO org_apache_sling_tenant_internal_tenant_provider_impl_propertie (tenant/root, tenant/path/matcher) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_tenant_internal_tenant_provider_impl_propertie'
--
UPDATE org_apache_sling_tenant_internal_tenant_provider_impl_propertie SET tenant/root = ?, tenant/path/matcher = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_tenant_internal_tenant_provider_impl_propertie'
--
DELETE FROM org_apache_sling_tenant_internal_tenant_provider_impl_propertie WHERE 1=2;

