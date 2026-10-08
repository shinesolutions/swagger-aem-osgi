--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheAriesJmxFrameworkStateConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_aries_jmx_framework_state_config_properties'
--
SELECT attribute_change_notification_enabled FROM org_apache_aries_jmx_framework_state_config_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_aries_jmx_framework_state_config_properties'
--
INSERT INTO org_apache_aries_jmx_framework_state_config_properties (attribute_change_notification_enabled) VALUES (?);

--
-- UPDATE template for table 'org_apache_aries_jmx_framework_state_config_properties'
--
UPDATE org_apache_aries_jmx_framework_state_config_properties SET attribute_change_notification_enabled = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_aries_jmx_framework_state_config_properties'
--
DELETE FROM org_apache_aries_jmx_framework_state_config_properties WHERE 1=2;

