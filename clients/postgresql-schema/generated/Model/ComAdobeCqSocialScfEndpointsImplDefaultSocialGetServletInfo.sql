--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_scf_endpoints_impl_default_social_get_servl'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_scf_endpoints_impl_default_social_get_servl WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_scf_endpoints_impl_default_social_get_servl'
--
INSERT INTO com_adobe_cq_social_scf_endpoints_impl_default_social_get_servl (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_scf_endpoints_impl_default_social_get_servl'
--
UPDATE com_adobe_cq_social_scf_endpoints_impl_default_social_get_servl SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_scf_endpoints_impl_default_social_get_servl'
--
DELETE FROM com_adobe_cq_social_scf_endpoints_impl_default_social_get_servl WHERE 1=2;

