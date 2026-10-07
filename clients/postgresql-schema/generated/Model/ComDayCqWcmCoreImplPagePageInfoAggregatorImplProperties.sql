--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propert'
--
SELECT page/info/provider/property/regex/default, page/info/provider/property/name FROM com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propert WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propert'
--
INSERT INTO com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propert (page/info/provider/property/regex/default, page/info/provider/property/name) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propert'
--
UPDATE com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propert SET page/info/provider/property/regex/default = ?, page/info/provider/property/name = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propert'
--
DELETE FROM com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propert WHERE 1=2;

