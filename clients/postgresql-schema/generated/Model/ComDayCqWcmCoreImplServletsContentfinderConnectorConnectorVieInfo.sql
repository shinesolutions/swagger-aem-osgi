--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_connector_conne'
--
SELECT pid, title, description, properties FROM com_day_cq_wcm_core_impl_servlets_contentfinder_connector_conne WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_connector_conne'
--
INSERT INTO com_day_cq_wcm_core_impl_servlets_contentfinder_connector_conne (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_connector_conne'
--
UPDATE com_day_cq_wcm_core_impl_servlets_contentfinder_connector_conne SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_connector_conne'
--
DELETE FROM com_day_cq_wcm_core_impl_servlets_contentfinder_connector_conne WHERE 1=2;

