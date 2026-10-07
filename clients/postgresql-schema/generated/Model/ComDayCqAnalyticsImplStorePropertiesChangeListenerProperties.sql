--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsImplStorePropertiesChangeListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_impl_store_properties_change_listener_prop'
--
SELECT cq/store/listener/additional_store_paths FROM com_day_cq_analytics_impl_store_properties_change_listener_prop WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_impl_store_properties_change_listener_prop'
--
INSERT INTO com_day_cq_analytics_impl_store_properties_change_listener_prop (cq/store/listener/additional_store_paths) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_analytics_impl_store_properties_change_listener_prop'
--
UPDATE com_day_cq_analytics_impl_store_properties_change_listener_prop SET cq/store/listener/additional_store_paths = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_impl_store_properties_change_listener_prop'
--
DELETE FROM com_day_cq_analytics_impl_store_properties_change_listener_prop WHERE 1=2;

