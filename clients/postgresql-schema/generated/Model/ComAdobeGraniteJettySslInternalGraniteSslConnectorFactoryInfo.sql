--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact'
--
SELECT pid, title, description, properties, additional_properties, bundle_location, service_location FROM com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact'
--
INSERT INTO com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact (pid, title, description, properties, additional_properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact'
--
UPDATE com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact SET pid = ?, title = ?, description = ?, properties = ?, additional_properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact'
--
DELETE FROM com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_fact WHERE 1=2;

