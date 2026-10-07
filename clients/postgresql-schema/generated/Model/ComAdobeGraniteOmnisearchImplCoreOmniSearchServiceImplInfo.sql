--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_omnisearch_impl_core_omni_search_service_impl'
--
SELECT pid, title, description, properties FROM com_adobe_granite_omnisearch_impl_core_omni_search_service_impl WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_omnisearch_impl_core_omni_search_service_impl'
--
INSERT INTO com_adobe_granite_omnisearch_impl_core_omni_search_service_impl (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_omnisearch_impl_core_omni_search_service_impl'
--
UPDATE com_adobe_granite_omnisearch_impl_core_omni_search_service_impl SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_omnisearch_impl_core_omni_search_service_impl'
--
DELETE FROM com_adobe_granite_omnisearch_impl_core_omni_search_service_impl WHERE 1=2;

