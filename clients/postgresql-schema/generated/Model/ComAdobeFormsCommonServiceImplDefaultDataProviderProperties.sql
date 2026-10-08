--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeFormsCommonServiceImplDefaultDataProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_forms_common_service_impl_default_data_provider_prope'
--
SELECT alloweddata_file_locations FROM com_adobe_forms_common_service_impl_default_data_provider_prope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_forms_common_service_impl_default_data_provider_prope'
--
INSERT INTO com_adobe_forms_common_service_impl_default_data_provider_prope (alloweddata_file_locations) VALUES (?);

--
-- UPDATE template for table 'com_adobe_forms_common_service_impl_default_data_provider_prope'
--
UPDATE com_adobe_forms_common_service_impl_default_data_provider_prope SET alloweddata_file_locations = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_forms_common_service_impl_default_data_provider_prope'
--
DELETE FROM com_adobe_forms_common_service_impl_default_data_provider_prope WHERE 1=2;

