--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteSecurityUserUserPropertiesServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_security_user_user_properties_service_info'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_granite_security_user_user_properties_service_info WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_security_user_user_properties_service_info'
--
INSERT INTO com_adobe_granite_security_user_user_properties_service_info (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_security_user_user_properties_service_info'
--
UPDATE com_adobe_granite_security_user_user_properties_service_info SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_security_user_user_properties_service_info'
--
DELETE FROM com_adobe_granite_security_user_user_properties_service_info WHERE 1=2;

