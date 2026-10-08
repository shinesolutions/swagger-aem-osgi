--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqStatisticsImplStatisticsServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_statistics_impl_statistics_service_impl_properties'
--
SELECT scheduler/period, scheduler/concurrent, "path", workspace, keywords_path, async_entries FROM com_day_cq_statistics_impl_statistics_service_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_statistics_impl_statistics_service_impl_properties'
--
INSERT INTO com_day_cq_statistics_impl_statistics_service_impl_properties (scheduler/period, scheduler/concurrent, "path", workspace, keywords_path, async_entries) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_statistics_impl_statistics_service_impl_properties'
--
UPDATE com_day_cq_statistics_impl_statistics_service_impl_properties SET scheduler/period = ?, scheduler/concurrent = ?, "path" = ?, workspace = ?, keywords_path = ?, async_entries = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_statistics_impl_statistics_service_impl_properties'
--
DELETE FROM com_day_cq_statistics_impl_statistics_service_impl_properties WHERE 1=2;

