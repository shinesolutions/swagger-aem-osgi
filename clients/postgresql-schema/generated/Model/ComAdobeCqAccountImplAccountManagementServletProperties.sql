--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqAccountImplAccountManagementServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_account_impl_account_management_servlet_properties'
--
SELECT cq/accountmanager/config/informnewaccount/mail, cq/accountmanager/config/informnewpwd/mail FROM com_adobe_cq_account_impl_account_management_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_account_impl_account_management_servlet_properties'
--
INSERT INTO com_adobe_cq_account_impl_account_management_servlet_properties (cq/accountmanager/config/informnewaccount/mail, cq/accountmanager/config/informnewpwd/mail) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_account_impl_account_management_servlet_properties'
--
UPDATE com_adobe_cq_account_impl_account_management_servlet_properties SET cq/accountmanager/config/informnewaccount/mail = ?, cq/accountmanager/config/informnewpwd/mail = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_account_impl_account_management_servlet_properties'
--
DELETE FROM com_adobe_cq_account_impl_account_management_servlet_properties WHERE 1=2;

