--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_emailreply_impl_comment_email_event'
--
SELECT event/topics FROM com_adobe_cq_social_commons_emailreply_impl_comment_email_event WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_emailreply_impl_comment_email_event'
--
INSERT INTO com_adobe_cq_social_commons_emailreply_impl_comment_email_event (event/topics) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_emailreply_impl_comment_email_event'
--
UPDATE com_adobe_cq_social_commons_emailreply_impl_comment_email_event SET event/topics = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_emailreply_impl_comment_email_event'
--
DELETE FROM com_adobe_cq_social_commons_emailreply_impl_comment_email_event WHERE 1=2;

