--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_emailreply_impl_custom_email_client'
--
SELECT priority_order, reply_email_patterns FROM com_adobe_cq_social_commons_emailreply_impl_custom_email_client WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_emailreply_impl_custom_email_client'
--
INSERT INTO com_adobe_cq_social_commons_emailreply_impl_custom_email_client (priority_order, reply_email_patterns) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_emailreply_impl_custom_email_client'
--
UPDATE com_adobe_cq_social_commons_emailreply_impl_custom_email_client SET priority_order = ?, reply_email_patterns = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_emailreply_impl_custom_email_client'
--
DELETE FROM com_adobe_cq_social_commons_emailreply_impl_custom_email_client WHERE 1=2;

