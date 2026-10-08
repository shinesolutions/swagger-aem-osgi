--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operati'
--
SELECT field_whitelist, attachment_type_blacklist FROM com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operati WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operati'
--
INSERT INTO com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operati (field_whitelist, attachment_type_blacklist) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operati'
--
UPDATE com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operati SET field_whitelist = ?, attachment_type_blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operati'
--
DELETE FROM com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operati WHERE 1=2;

