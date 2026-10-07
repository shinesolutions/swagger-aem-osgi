--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_utils_default_page_name_validator_prop'
--
SELECT non_valid_chars FROM com_day_cq_wcm_core_impl_utils_default_page_name_validator_prop WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_utils_default_page_name_validator_prop'
--
INSERT INTO com_day_cq_wcm_core_impl_utils_default_page_name_validator_prop (non_valid_chars) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_utils_default_page_name_validator_prop'
--
UPDATE com_day_cq_wcm_core_impl_utils_default_page_name_validator_prop SET non_valid_chars = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_utils_default_page_name_validator_prop'
--
DELETE FROM com_day_cq_wcm_core_impl_utils_default_page_name_validator_prop WHERE 1=2;

