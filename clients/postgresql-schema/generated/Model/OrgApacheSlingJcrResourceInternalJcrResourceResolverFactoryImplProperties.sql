--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa'
--
SELECT resource/resolver/searchpath, resource/resolver/manglenamespaces, resource/resolver/allow_direct, resource/resolver/required/providers, resource/resolver/required/providernames, resource/resolver/virtual, resource/resolver/mapping, resource/resolver/map/location, resource/resolver/map/observation, resource/resolver/default/vanity/redirect/status, resource/resolver/enable/vanitypath, resource/resolver/vanitypath/max_entries, resource/resolver/vanitypath/max_entries/startup, resource/resolver/vanitypath/bloomfilter/max_bytes, resource/resolver/optimize/alias/resolution, resource/resolver/vanitypath/whitelist, resource/resolver/vanitypath/blacklist, resource/resolver/vanity/precedence, resource/resolver/providerhandling/paranoid, resource/resolver/log/closing, resource/resolver/log/unclosed FROM org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa'
--
INSERT INTO org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa (resource/resolver/searchpath, resource/resolver/manglenamespaces, resource/resolver/allow_direct, resource/resolver/required/providers, resource/resolver/required/providernames, resource/resolver/virtual, resource/resolver/mapping, resource/resolver/map/location, resource/resolver/map/observation, resource/resolver/default/vanity/redirect/status, resource/resolver/enable/vanitypath, resource/resolver/vanitypath/max_entries, resource/resolver/vanitypath/max_entries/startup, resource/resolver/vanitypath/bloomfilter/max_bytes, resource/resolver/optimize/alias/resolution, resource/resolver/vanitypath/whitelist, resource/resolver/vanitypath/blacklist, resource/resolver/vanity/precedence, resource/resolver/providerhandling/paranoid, resource/resolver/log/closing, resource/resolver/log/unclosed) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa'
--
UPDATE org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa SET resource/resolver/searchpath = ?, resource/resolver/manglenamespaces = ?, resource/resolver/allow_direct = ?, resource/resolver/required/providers = ?, resource/resolver/required/providernames = ?, resource/resolver/virtual = ?, resource/resolver/mapping = ?, resource/resolver/map/location = ?, resource/resolver/map/observation = ?, resource/resolver/default/vanity/redirect/status = ?, resource/resolver/enable/vanitypath = ?, resource/resolver/vanitypath/max_entries = ?, resource/resolver/vanitypath/max_entries/startup = ?, resource/resolver/vanitypath/bloomfilter/max_bytes = ?, resource/resolver/optimize/alias/resolution = ?, resource/resolver/vanitypath/whitelist = ?, resource/resolver/vanitypath/blacklist = ?, resource/resolver/vanity/precedence = ?, resource/resolver/providerhandling/paranoid = ?, resource/resolver/log/closing = ?, resource/resolver/log/unclosed = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa'
--
DELETE FROM org_apache_sling_jcr_resource_internal_jcr_resource_resolver_fa WHERE 1=2;

