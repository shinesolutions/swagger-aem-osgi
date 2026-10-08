--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_ideation_client_endpoints_impl_ideation_ope'
--
SELECT field_whitelist, attachment_type_blacklist FROM com_adobe_cq_social_ideation_client_endpoints_impl_ideation_ope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_ideation_client_endpoints_impl_ideation_ope'
--
INSERT INTO com_adobe_cq_social_ideation_client_endpoints_impl_ideation_ope (field_whitelist, attachment_type_blacklist) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_ideation_client_endpoints_impl_ideation_ope'
--
UPDATE com_adobe_cq_social_ideation_client_endpoints_impl_ideation_ope SET field_whitelist = ?, attachment_type_blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_ideation_client_endpoints_impl_ideation_ope'
--
DELETE FROM com_adobe_cq_social_ideation_client_endpoints_impl_ideation_ope WHERE 1=2;

