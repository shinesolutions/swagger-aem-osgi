--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteHttpcacheFileFileCacheStoreProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_httpcache_file_file_cache_store_properties'
--
SELECT com/adobe/granite/httpcache/file/document_root, com/adobe/granite/httpcache/file/include_host FROM com_adobe_granite_httpcache_file_file_cache_store_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_httpcache_file_file_cache_store_properties'
--
INSERT INTO com_adobe_granite_httpcache_file_file_cache_store_properties (com/adobe/granite/httpcache/file/document_root, com/adobe/granite/httpcache/file/include_host) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_httpcache_file_file_cache_store_properties'
--
UPDATE com_adobe_granite_httpcache_file_file_cache_store_properties SET com/adobe/granite/httpcache/file/document_root = ?, com/adobe/granite/httpcache/file/include_host = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_httpcache_file_file_cache_store_properties'
--
DELETE FROM com_adobe_granite_httpcache_file_file_cache_store_properties WHERE 1=2;

