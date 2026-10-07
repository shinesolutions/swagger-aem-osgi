--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_content_fragments_services_impl_communities'
--
SELECT cq/social/content/fragments/services/enabled, cq/social/content/fragments/services/wait_time_seconds FROM com_adobe_cq_social_content_fragments_services_impl_communities WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_content_fragments_services_impl_communities'
--
INSERT INTO com_adobe_cq_social_content_fragments_services_impl_communities (cq/social/content/fragments/services/enabled, cq/social/content/fragments/services/wait_time_seconds) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_content_fragments_services_impl_communities'
--
UPDATE com_adobe_cq_social_content_fragments_services_impl_communities SET cq/social/content/fragments/services/enabled = ?, cq/social/content/fragments/services/wait_time_seconds = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_content_fragments_services_impl_communities'
--
DELETE FROM com_adobe_cq_social_content_fragments_services_impl_communities WHERE 1=2;

