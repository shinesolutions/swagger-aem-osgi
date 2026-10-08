--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_hc_core_impl_servlet_health_check_executor_ser'
--
SELECT servlet_path, disabled, cors/access_control_allow_origin FROM org_apache_sling_hc_core_impl_servlet_health_check_executor_ser WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_hc_core_impl_servlet_health_check_executor_ser'
--
INSERT INTO org_apache_sling_hc_core_impl_servlet_health_check_executor_ser (servlet_path, disabled, cors/access_control_allow_origin) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_hc_core_impl_servlet_health_check_executor_ser'
--
UPDATE org_apache_sling_hc_core_impl_servlet_health_check_executor_ser SET servlet_path = ?, disabled = ?, cors/access_control_allow_origin = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_hc_core_impl_servlet_health_check_executor_ser'
--
DELETE FROM org_apache_sling_hc_core_impl_servlet_health_check_executor_ser WHERE 1=2;

