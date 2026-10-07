--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletGuidLookupFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties'
--
SELECT cq/dam/core/guidlookupfilter/enabled FROM com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties (cq/dam/core/guidlookupfilter/enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties'
--
UPDATE com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties SET cq/dam/core/guidlookupfilter/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties WHERE 1=2;

