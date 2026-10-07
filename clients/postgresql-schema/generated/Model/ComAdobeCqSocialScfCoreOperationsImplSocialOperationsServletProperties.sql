--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_scf_core_operations_impl_social_operations_'
--
SELECT sling/servlet/selectors, sling/servlet/extensions FROM com_adobe_cq_social_scf_core_operations_impl_social_operations_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_scf_core_operations_impl_social_operations_'
--
INSERT INTO com_adobe_cq_social_scf_core_operations_impl_social_operations_ (sling/servlet/selectors, sling/servlet/extensions) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_scf_core_operations_impl_social_operations_'
--
UPDATE com_adobe_cq_social_scf_core_operations_impl_social_operations_ SET sling/servlet/selectors = ?, sling/servlet/extensions = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_scf_core_operations_impl_social_operations_'
--
DELETE FROM com_adobe_cq_social_scf_core_operations_impl_social_operations_ WHERE 1=2;

