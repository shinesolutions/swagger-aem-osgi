--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteMonitoringImplScriptConfigImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_monitoring_impl_script_config_impl_properties'
--
SELECT script/filename, script/display, script/path, script/platform, "interval", jmxdomain FROM com_adobe_granite_monitoring_impl_script_config_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_monitoring_impl_script_config_impl_properties'
--
INSERT INTO com_adobe_granite_monitoring_impl_script_config_impl_properties (script/filename, script/display, script/path, script/platform, "interval", jmxdomain) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_monitoring_impl_script_config_impl_properties'
--
UPDATE com_adobe_granite_monitoring_impl_script_config_impl_properties SET script/filename = ?, script/display = ?, script/path = ?, script/platform = ?, "interval" = ?, jmxdomain = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_monitoring_impl_script_config_impl_properties'
--
DELETE FROM com_adobe_granite_monitoring_impl_script_config_impl_properties WHERE 1=2;

