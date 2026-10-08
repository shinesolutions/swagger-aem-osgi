--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_emailreply_impl_custom_email_client'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_commons_emailreply_impl_custom_email_client WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_emailreply_impl_custom_email_client'
--
INSERT INTO com_adobe_cq_social_commons_emailreply_impl_custom_email_client (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_emailreply_impl_custom_email_client'
--
UPDATE com_adobe_cq_social_commons_emailreply_impl_custom_email_client SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_emailreply_impl_custom_email_client'
--
DELETE FROM com_adobe_cq_social_commons_emailreply_impl_custom_email_client WHERE 1=2;

