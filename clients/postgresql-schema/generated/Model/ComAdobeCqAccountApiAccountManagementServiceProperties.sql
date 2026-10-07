--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqAccountApiAccountManagementServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_account_api_account_management_service_properties'
--
SELECT cq/accountmanager/token/validity/period, cq/accountmanager/config/requestnewaccount/mail, cq/accountmanager/config/requestnewpwd/mail FROM com_adobe_cq_account_api_account_management_service_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_account_api_account_management_service_properties'
--
INSERT INTO com_adobe_cq_account_api_account_management_service_properties (cq/accountmanager/token/validity/period, cq/accountmanager/config/requestnewaccount/mail, cq/accountmanager/config/requestnewpwd/mail) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_account_api_account_management_service_properties'
--
UPDATE com_adobe_cq_account_api_account_management_service_properties SET cq/accountmanager/token/validity/period = ?, cq/accountmanager/config/requestnewaccount/mail = ?, cq/accountmanager/config/requestnewpwd/mail = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_account_api_account_management_service_properties'
--
DELETE FROM com_adobe_cq_account_api_account_management_service_properties WHERE 1=2;

