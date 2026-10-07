--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqHistoryImplHistoryServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_history_impl_history_service_impl_properties'
--
SELECT history/service/resource_types, history/service/path_filter FROM com_adobe_cq_history_impl_history_service_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_history_impl_history_service_impl_properties'
--
INSERT INTO com_adobe_cq_history_impl_history_service_impl_properties (history/service/resource_types, history/service/path_filter) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_history_impl_history_service_impl_properties'
--
UPDATE com_adobe_cq_history_impl_history_service_impl_properties SET history/service/resource_types = ?, history/service/path_filter = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_history_impl_history_service_impl_properties'
--
DELETE FROM com_adobe_cq_history_impl_history_service_impl_properties WHERE 1=2;

