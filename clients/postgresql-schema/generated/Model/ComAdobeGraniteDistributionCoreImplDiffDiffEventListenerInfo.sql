--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_distribution_core_impl_diff_diff_event_listen'
--
SELECT pid, title, description, properties FROM com_adobe_granite_distribution_core_impl_diff_diff_event_listen WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_distribution_core_impl_diff_diff_event_listen'
--
INSERT INTO com_adobe_granite_distribution_core_impl_diff_diff_event_listen (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_distribution_core_impl_diff_diff_event_listen'
--
UPDATE com_adobe_granite_distribution_core_impl_diff_diff_event_listen SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_distribution_core_impl_diff_diff_event_listen'
--
DELETE FROM com_adobe_granite_distribution_core_impl_diff_diff_event_listen WHERE 1=2;

