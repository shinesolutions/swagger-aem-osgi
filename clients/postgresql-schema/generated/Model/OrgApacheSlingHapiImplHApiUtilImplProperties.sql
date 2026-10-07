--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingHapiImplHApiUtilImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_hapi_impl_h_api_util_impl_properties'
--
SELECT org/apache/sling/hapi/tools/resourcetype, org/apache/sling/hapi/tools/collectionresourcetype, org/apache/sling/hapi/tools/searchpaths, org/apache/sling/hapi/tools/externalurl, org/apache/sling/hapi/tools/enabled FROM org_apache_sling_hapi_impl_h_api_util_impl_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_hapi_impl_h_api_util_impl_properties'
--
INSERT INTO org_apache_sling_hapi_impl_h_api_util_impl_properties (org/apache/sling/hapi/tools/resourcetype, org/apache/sling/hapi/tools/collectionresourcetype, org/apache/sling/hapi/tools/searchpaths, org/apache/sling/hapi/tools/externalurl, org/apache/sling/hapi/tools/enabled) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_hapi_impl_h_api_util_impl_properties'
--
UPDATE org_apache_sling_hapi_impl_h_api_util_impl_properties SET org/apache/sling/hapi/tools/resourcetype = ?, org/apache/sling/hapi/tools/collectionresourcetype = ?, org/apache/sling/hapi/tools/searchpaths = ?, org/apache/sling/hapi/tools/externalurl = ?, org/apache/sling/hapi/tools/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_hapi_impl_h_api_util_impl_properties'
--
DELETE FROM org_apache_sling_hapi_impl_h_api_util_impl_properties WHERE 1=2;

