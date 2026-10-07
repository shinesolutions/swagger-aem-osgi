--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_aem_formsndocuments_config_aem_forms_manager_configur'
--
SELECT forms_manager_config/include_ootb_templates, forms_manager_config/include_deprecated_templates FROM com_adobe_aem_formsndocuments_config_aem_forms_manager_configur WHERE 1=1;

--
-- INSERT template for table 'com_adobe_aem_formsndocuments_config_aem_forms_manager_configur'
--
INSERT INTO com_adobe_aem_formsndocuments_config_aem_forms_manager_configur (forms_manager_config/include_ootb_templates, forms_manager_config/include_deprecated_templates) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_aem_formsndocuments_config_aem_forms_manager_configur'
--
UPDATE com_adobe_aem_formsndocuments_config_aem_forms_manager_configur SET forms_manager_config/include_ootb_templates = ?, forms_manager_config/include_deprecated_templates = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_aem_formsndocuments_config_aem_forms_manager_configur'
--
DELETE FROM com_adobe_aem_formsndocuments_config_aem_forms_manager_configur WHERE 1=2;

