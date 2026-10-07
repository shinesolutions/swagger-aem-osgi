--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletHealthCheckServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_health_check_servlet_propertie'
--
SELECT cq/dam/sync/workflow/id, cq/dam/sync/folder/types FROM com_day_cq_dam_core_impl_servlet_health_check_servlet_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_health_check_servlet_propertie'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_health_check_servlet_propertie (cq/dam/sync/workflow/id, cq/dam/sync/folder/types) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_health_check_servlet_propertie'
--
UPDATE com_day_cq_dam_core_impl_servlet_health_check_servlet_propertie SET cq/dam/sync/workflow/id = ?, cq/dam/sync/folder/types = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_health_check_servlet_propertie'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_health_check_servlet_propertie WHERE 1=2;

