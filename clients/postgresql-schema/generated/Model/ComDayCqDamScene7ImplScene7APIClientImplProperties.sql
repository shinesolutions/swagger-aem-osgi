--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamScene7ImplScene7APIClientImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties'
--
SELECT cq/dam/scene7/apiclient/recordsperpage/nofilter/name, cq/dam/scene7/apiclient/recordsperpage/withfilter/name FROM com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties'
--
INSERT INTO com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties (cq/dam/scene7/apiclient/recordsperpage/nofilter/name, cq/dam/scene7/apiclient/recordsperpage/withfilter/name) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties'
--
UPDATE com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties SET cq/dam/scene7/apiclient/recordsperpage/nofilter/name = ?, cq/dam/scene7/apiclient/recordsperpage/withfilter/name = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties'
--
DELETE FROM com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties WHERE 1=2;

