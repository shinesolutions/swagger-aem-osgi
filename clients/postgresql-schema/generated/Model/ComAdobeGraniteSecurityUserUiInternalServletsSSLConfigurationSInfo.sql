--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_security_user_ui_internal_servlets_ssl_config'
--
SELECT pid, title, description, properties FROM com_adobe_granite_security_user_ui_internal_servlets_ssl_config WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_security_user_ui_internal_servlets_ssl_config'
--
INSERT INTO com_adobe_granite_security_user_ui_internal_servlets_ssl_config (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_security_user_ui_internal_servlets_ssl_config'
--
UPDATE com_adobe_granite_security_user_ui_internal_servlets_ssl_config SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_security_user_ui_internal_servlets_ssl_config'
--
DELETE FROM com_adobe_granite_security_user_ui_internal_servlets_ssl_config WHERE 1=2;

