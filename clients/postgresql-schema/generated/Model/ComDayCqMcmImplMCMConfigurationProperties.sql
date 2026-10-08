--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMcmImplMCMConfigurationProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mcm_impl_mcm_configuration_properties'
--
SELECT experience/indirection, touchpoint/indirection FROM com_day_cq_mcm_impl_mcm_configuration_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mcm_impl_mcm_configuration_properties'
--
INSERT INTO com_day_cq_mcm_impl_mcm_configuration_properties (experience/indirection, touchpoint/indirection) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_mcm_impl_mcm_configuration_properties'
--
UPDATE com_day_cq_mcm_impl_mcm_configuration_properties SET experience/indirection = ?, touchpoint/indirection = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mcm_impl_mcm_configuration_properties'
--
DELETE FROM com_day_cq_mcm_impl_mcm_configuration_properties WHERE 1=2;

