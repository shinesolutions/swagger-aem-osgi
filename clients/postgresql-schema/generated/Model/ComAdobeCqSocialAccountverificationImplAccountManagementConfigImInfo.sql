--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_accountverification_impl_account_management'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_accountverification_impl_account_management WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_accountverification_impl_account_management'
--
INSERT INTO com_adobe_cq_social_accountverification_impl_account_management (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_accountverification_impl_account_management'
--
UPDATE com_adobe_cq_social_accountverification_impl_account_management SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_accountverification_impl_account_management'
--
DELETE FROM com_adobe_cq_social_accountverification_impl_account_management WHERE 1=2;

