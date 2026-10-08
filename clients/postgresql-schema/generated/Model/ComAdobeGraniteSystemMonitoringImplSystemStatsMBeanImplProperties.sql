--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_system_monitoring_impl_system_stats_m_bean_im'
--
SELECT scheduler/expression, jmx/objectname FROM com_adobe_granite_system_monitoring_impl_system_stats_m_bean_im WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_system_monitoring_impl_system_stats_m_bean_im'
--
INSERT INTO com_adobe_granite_system_monitoring_impl_system_stats_m_bean_im (scheduler/expression, jmx/objectname) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_system_monitoring_impl_system_stats_m_bean_im'
--
UPDATE com_adobe_granite_system_monitoring_impl_system_stats_m_bean_im SET scheduler/expression = ?, jmx/objectname = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_system_monitoring_impl_system_stats_m_bean_im'
--
DELETE FROM com_adobe_granite_system_monitoring_impl_system_stats_m_bean_im WHERE 1=2;

