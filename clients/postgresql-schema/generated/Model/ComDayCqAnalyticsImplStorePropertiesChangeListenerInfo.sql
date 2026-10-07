--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsImplStorePropertiesChangeListenerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_impl_store_properties_change_listener_info'
--
SELECT pid, title, description, properties FROM com_day_cq_analytics_impl_store_properties_change_listener_info WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_impl_store_properties_change_listener_info'
--
INSERT INTO com_day_cq_analytics_impl_store_properties_change_listener_info (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_analytics_impl_store_properties_change_listener_info'
--
UPDATE com_day_cq_analytics_impl_store_properties_change_listener_info SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_impl_store_properties_change_listener_info'
--
DELETE FROM com_day_cq_analytics_impl_store_properties_change_listener_info WHERE 1=2;

