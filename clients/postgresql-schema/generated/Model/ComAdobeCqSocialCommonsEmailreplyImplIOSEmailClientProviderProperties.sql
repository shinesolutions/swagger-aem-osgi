--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_emailreply_impl_ios_email_client_pr'
--
SELECT priority_order, reply_email_patterns FROM com_adobe_cq_social_commons_emailreply_impl_ios_email_client_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_emailreply_impl_ios_email_client_pr'
--
INSERT INTO com_adobe_cq_social_commons_emailreply_impl_ios_email_client_pr (priority_order, reply_email_patterns) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_emailreply_impl_ios_email_client_pr'
--
UPDATE com_adobe_cq_social_commons_emailreply_impl_ios_email_client_pr SET priority_order = ?, reply_email_patterns = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_emailreply_impl_ios_email_client_pr'
--
DELETE FROM com_adobe_cq_social_commons_emailreply_impl_ios_email_client_pr WHERE 1=2;

