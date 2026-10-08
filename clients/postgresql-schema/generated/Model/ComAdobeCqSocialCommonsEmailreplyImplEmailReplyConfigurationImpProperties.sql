--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_emailreply_impl_email_reply_configu'
--
SELECT email/name, email/create_post_from_reply, email/add_comment_id_to, email/subject_maximum_length, email/reply_to_address, email/reply_to_delimiter, email/tracker_id_prefix_in_subject, email/tracker_id_prefix_in_body, email/as_html, email/default_user_name, email/templates/root_path FROM com_adobe_cq_social_commons_emailreply_impl_email_reply_configu WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_emailreply_impl_email_reply_configu'
--
INSERT INTO com_adobe_cq_social_commons_emailreply_impl_email_reply_configu (email/name, email/create_post_from_reply, email/add_comment_id_to, email/subject_maximum_length, email/reply_to_address, email/reply_to_delimiter, email/tracker_id_prefix_in_subject, email/tracker_id_prefix_in_body, email/as_html, email/default_user_name, email/templates/root_path) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_emailreply_impl_email_reply_configu'
--
UPDATE com_adobe_cq_social_commons_emailreply_impl_email_reply_configu SET email/name = ?, email/create_post_from_reply = ?, email/add_comment_id_to = ?, email/subject_maximum_length = ?, email/reply_to_address = ?, email/reply_to_delimiter = ?, email/tracker_id_prefix_in_subject = ?, email/tracker_id_prefix_in_body = ?, email/as_html = ?, email/default_user_name = ?, email/templates/root_path = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_emailreply_impl_email_reply_configu'
--
DELETE FROM com_adobe_cq_social_commons_emailreply_impl_email_reply_configu WHERE 1=2;

