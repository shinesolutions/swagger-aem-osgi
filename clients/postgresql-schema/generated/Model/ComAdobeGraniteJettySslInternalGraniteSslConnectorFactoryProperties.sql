--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact'
--
SELECT com/adobe/granite/jetty/ssl/port, com/adobe/granite/jetty/ssl/keystore/user, com/adobe/granite/jetty/ssl/keystore/password, com/adobe/granite/jetty/ssl/ciphersuites/excluded, com/adobe/granite/jetty/ssl/ciphersuites/included, com/adobe/granite/jetty/ssl/client/certificate FROM com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact'
--
INSERT INTO com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact (com/adobe/granite/jetty/ssl/port, com/adobe/granite/jetty/ssl/keystore/user, com/adobe/granite/jetty/ssl/keystore/password, com/adobe/granite/jetty/ssl/ciphersuites/excluded, com/adobe/granite/jetty/ssl/ciphersuites/included, com/adobe/granite/jetty/ssl/client/certificate) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact'
--
UPDATE com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact SET com/adobe/granite/jetty/ssl/port = ?, com/adobe/granite/jetty/ssl/keystore/user = ?, com/adobe/granite/jetty/ssl/keystore/password = ?, com/adobe/granite/jetty/ssl/ciphersuites/excluded = ?, com/adobe/granite/jetty/ssl/ciphersuites/included = ?, com/adobe/granite/jetty/ssl/client/certificate = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact'
--
DELETE FROM com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact WHERE 1=2;

