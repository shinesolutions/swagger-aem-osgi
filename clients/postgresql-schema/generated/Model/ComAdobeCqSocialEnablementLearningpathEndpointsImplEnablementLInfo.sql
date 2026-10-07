--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_enablement_learningpath_endpoints_impl_enab'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_enablement_learningpath_endpoints_impl_enab WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_enablement_learningpath_endpoints_impl_enab'
--
INSERT INTO com_adobe_cq_social_enablement_learningpath_endpoints_impl_enab (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_enablement_learningpath_endpoints_impl_enab'
--
UPDATE com_adobe_cq_social_enablement_learningpath_endpoints_impl_enab SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_enablement_learningpath_endpoints_impl_enab'
--
DELETE FROM com_adobe_cq_social_enablement_learningpath_endpoints_impl_enab WHERE 1=2;

