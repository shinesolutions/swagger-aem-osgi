--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_hc_core_impl_executor_health_check_executor_im'
--
SELECT timeout_in_ms, long_running_future_threshold_for_critical_ms, result_cache_ttl_in_ms FROM org_apache_sling_hc_core_impl_executor_health_check_executor_im WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_hc_core_impl_executor_health_check_executor_im'
--
INSERT INTO org_apache_sling_hc_core_impl_executor_health_check_executor_im (timeout_in_ms, long_running_future_threshold_for_critical_ms, result_cache_ttl_in_ms) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_hc_core_impl_executor_health_check_executor_im'
--
UPDATE org_apache_sling_hc_core_impl_executor_health_check_executor_im SET timeout_in_ms = ?, long_running_future_threshold_for_critical_ms = ?, result_cache_ttl_in_ms = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_hc_core_impl_executor_health_check_executor_im'
--
DELETE FROM org_apache_sling_hc_core_impl_executor_health_check_executor_im WHERE 1=2;

