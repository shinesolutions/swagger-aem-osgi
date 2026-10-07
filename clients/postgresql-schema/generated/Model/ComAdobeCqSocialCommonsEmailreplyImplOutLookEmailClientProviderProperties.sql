--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_emailreply_impl_out_look_email_clie'
--
SELECT priority_order, reply_email_patterns FROM com_adobe_cq_social_commons_emailreply_impl_out_look_email_clie WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_emailreply_impl_out_look_email_clie'
--
INSERT INTO com_adobe_cq_social_commons_emailreply_impl_out_look_email_clie (priority_order, reply_email_patterns) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_emailreply_impl_out_look_email_clie'
--
UPDATE com_adobe_cq_social_commons_emailreply_impl_out_look_email_clie SET priority_order = ?, reply_email_patterns = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_emailreply_impl_out_look_email_clie'
--
DELETE FROM com_adobe_cq_social_commons_emailreply_impl_out_look_email_clie WHERE 1=2;

