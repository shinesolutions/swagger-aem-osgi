--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_apicontroller_filter_resolver_hook_factory_in'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_granite_apicontroller_filter_resolver_hook_factory_in WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_apicontroller_filter_resolver_hook_factory_in'
--
INSERT INTO com_adobe_granite_apicontroller_filter_resolver_hook_factory_in (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_apicontroller_filter_resolver_hook_factory_in'
--
UPDATE com_adobe_granite_apicontroller_filter_resolver_hook_factory_in SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_apicontroller_filter_resolver_hook_factory_in'
--
DELETE FROM com_adobe_granite_apicontroller_filter_resolver_hook_factory_in WHERE 1=2;

