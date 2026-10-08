--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_site_endpoints_impl_site_operation_service_'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_site_endpoints_impl_site_operation_service_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_site_endpoints_impl_site_operation_service_'
--
INSERT INTO com_adobe_cq_social_site_endpoints_impl_site_operation_service_ (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_site_endpoints_impl_site_operation_service_'
--
UPDATE com_adobe_cq_social_site_endpoints_impl_site_operation_service_ SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_site_endpoints_impl_site_operation_service_'
--
DELETE FROM com_adobe_cq_social_site_endpoints_impl_site_operation_service_ WHERE 1=2;

