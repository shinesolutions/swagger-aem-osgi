--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqPersonalizationImplServletsTargetingConfigurationServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_personalization_impl_servlets_targeting_configuratio'
--
SELECT pid, title, description, properties FROM com_day_cq_personalization_impl_servlets_targeting_configuratio WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_personalization_impl_servlets_targeting_configuratio'
--
INSERT INTO com_day_cq_personalization_impl_servlets_targeting_configuratio (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_personalization_impl_servlets_targeting_configuratio'
--
UPDATE com_day_cq_personalization_impl_servlets_targeting_configuratio SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_personalization_impl_servlets_targeting_configuratio'
--
DELETE FROM com_day_cq_personalization_impl_servlets_targeting_configuratio WHERE 1=2;

