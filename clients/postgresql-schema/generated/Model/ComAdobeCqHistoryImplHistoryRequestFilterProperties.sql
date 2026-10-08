--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqHistoryImplHistoryRequestFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_history_impl_history_request_filter_properties'
--
SELECT history/request_filter/excluded_selectors, history/request_filter/excluded_extensions FROM com_adobe_cq_history_impl_history_request_filter_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_history_impl_history_request_filter_properties'
--
INSERT INTO com_adobe_cq_history_impl_history_request_filter_properties (history/request_filter/excluded_selectors, history/request_filter/excluded_extensions) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_history_impl_history_request_filter_properties'
--
UPDATE com_adobe_cq_history_impl_history_request_filter_properties SET history/request_filter/excluded_selectors = ?, history/request_filter/excluded_extensions = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_history_impl_history_request_filter_properties'
--
DELETE FROM com_adobe_cq_history_impl_history_request_filter_properties WHERE 1=2;

