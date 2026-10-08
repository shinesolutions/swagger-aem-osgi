--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_emailreply_impl_unknown_email_clien'
--
SELECT reply_email_patterns, priority_order FROM com_adobe_cq_social_commons_emailreply_impl_unknown_email_clien WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_emailreply_impl_unknown_email_clien'
--
INSERT INTO com_adobe_cq_social_commons_emailreply_impl_unknown_email_clien (reply_email_patterns, priority_order) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_emailreply_impl_unknown_email_clien'
--
UPDATE com_adobe_cq_social_commons_emailreply_impl_unknown_email_clien SET reply_email_patterns = ?, priority_order = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_emailreply_impl_unknown_email_clien'
--
DELETE FROM com_adobe_cq_social_commons_emailreply_impl_unknown_email_clien WHERE 1=2;

