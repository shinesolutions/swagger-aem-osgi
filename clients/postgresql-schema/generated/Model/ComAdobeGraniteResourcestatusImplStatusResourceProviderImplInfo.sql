--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_resourcestatus_impl_status_resource_provider_'
--
SELECT pid, title, description, properties FROM com_adobe_granite_resourcestatus_impl_status_resource_provider_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_resourcestatus_impl_status_resource_provider_'
--
INSERT INTO com_adobe_granite_resourcestatus_impl_status_resource_provider_ (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_resourcestatus_impl_status_resource_provider_'
--
UPDATE com_adobe_granite_resourcestatus_impl_status_resource_provider_ SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_resourcestatus_impl_status_resource_provider_'
--
DELETE FROM com_adobe_granite_resourcestatus_impl_status_resource_provider_ WHERE 1=2;

