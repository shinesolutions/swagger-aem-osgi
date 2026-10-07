--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqSearchImplBuilderQueryBuilderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_search_impl_builder_query_builder_impl_properties'
--
SELECT excerpt/properties, cache/max/entries, cache/entry/lifetime, xpath/union FROM com_day_cq_search_impl_builder_query_builder_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_search_impl_builder_query_builder_impl_properties'
--
INSERT INTO com_day_cq_search_impl_builder_query_builder_impl_properties (excerpt/properties, cache/max/entries, cache/entry/lifetime, xpath/union) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_search_impl_builder_query_builder_impl_properties'
--
UPDATE com_day_cq_search_impl_builder_query_builder_impl_properties SET excerpt/properties = ?, cache/max/entries = ?, cache/entry/lifetime = ?, xpath/union = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_search_impl_builder_query_builder_impl_properties'
--
DELETE FROM com_day_cq_search_impl_builder_query_builder_impl_properties WHERE 1=2;

