--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteSecurityUserUserPropertiesServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_security_user_user_properties_service_propert'
--
SELECT adapter/condition, granite/userproperties/nodetypes, granite/userproperties/resourcetypes FROM com_adobe_granite_security_user_user_properties_service_propert WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_security_user_user_properties_service_propert'
--
INSERT INTO com_adobe_granite_security_user_user_properties_service_propert (adapter/condition, granite/userproperties/nodetypes, granite/userproperties/resourcetypes) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_security_user_user_properties_service_propert'
--
UPDATE com_adobe_granite_security_user_user_properties_service_propert SET adapter/condition = ?, granite/userproperties/nodetypes = ?, granite/userproperties/resourcetypes = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_security_user_user_properties_service_propert'
--
DELETE FROM com_adobe_granite_security_user_user_properties_service_propert WHERE 1=2;

