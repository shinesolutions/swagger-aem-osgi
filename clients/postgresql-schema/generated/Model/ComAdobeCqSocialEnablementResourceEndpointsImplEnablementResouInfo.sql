--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_enablement_resource_endpoints_impl_enableme'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_enablement_resource_endpoints_impl_enableme WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_enablement_resource_endpoints_impl_enableme'
--
INSERT INTO com_adobe_cq_social_enablement_resource_endpoints_impl_enableme (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_enablement_resource_endpoints_impl_enableme'
--
UPDATE com_adobe_cq_social_enablement_resource_endpoints_impl_enableme SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_enablement_resource_endpoints_impl_enableme'
--
DELETE FROM com_adobe_cq_social_enablement_resource_endpoints_impl_enableme WHERE 1=2;

