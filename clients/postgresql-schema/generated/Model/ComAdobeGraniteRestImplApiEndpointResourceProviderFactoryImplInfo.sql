--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_rest_impl_api_endpoint_resource_provider_fact'
--
SELECT pid, title, description, properties FROM com_adobe_granite_rest_impl_api_endpoint_resource_provider_fact WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_rest_impl_api_endpoint_resource_provider_fact'
--
INSERT INTO com_adobe_granite_rest_impl_api_endpoint_resource_provider_fact (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_rest_impl_api_endpoint_resource_provider_fact'
--
UPDATE com_adobe_granite_rest_impl_api_endpoint_resource_provider_fact SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_rest_impl_api_endpoint_resource_provider_fact'
--
DELETE FROM com_adobe_granite_rest_impl_api_endpoint_resource_provider_fact WHERE 1=2;

