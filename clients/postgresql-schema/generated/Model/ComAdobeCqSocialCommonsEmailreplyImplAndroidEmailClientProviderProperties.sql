--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_emailreply_impl_android_email_clien'
--
SELECT priority_order, reply_email_patterns FROM com_adobe_cq_social_commons_emailreply_impl_android_email_clien WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_emailreply_impl_android_email_clien'
--
INSERT INTO com_adobe_cq_social_commons_emailreply_impl_android_email_clien (priority_order, reply_email_patterns) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_emailreply_impl_android_email_clien'
--
UPDATE com_adobe_cq_social_commons_emailreply_impl_android_email_clien SET priority_order = ?, reply_email_patterns = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_emailreply_impl_android_email_clien'
--
DELETE FROM com_adobe_cq_social_commons_emailreply_impl_android_email_clien WHERE 1=2;

