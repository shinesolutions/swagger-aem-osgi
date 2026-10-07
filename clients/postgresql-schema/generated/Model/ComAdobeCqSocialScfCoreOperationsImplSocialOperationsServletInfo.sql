--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_scf_core_operations_impl_social_operations_'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_scf_core_operations_impl_social_operations_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_scf_core_operations_impl_social_operations_'
--
INSERT INTO com_adobe_cq_social_scf_core_operations_impl_social_operations_ (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_scf_core_operations_impl_social_operations_'
--
UPDATE com_adobe_cq_social_scf_core_operations_impl_social_operations_ SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_scf_core_operations_impl_social_operations_'
--
DELETE FROM com_adobe_cq_social_scf_core_operations_impl_social_operations_ WHERE 1=2;

