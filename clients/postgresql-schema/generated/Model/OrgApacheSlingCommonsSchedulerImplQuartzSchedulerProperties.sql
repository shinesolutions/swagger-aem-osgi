--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_scheduler_impl_quartz_scheduler_proper'
--
SELECT pool_name, allowed_pool_names, scheduler/useleaderforsingle, metrics/filters, slow_threshold_millis FROM org_apache_sling_commons_scheduler_impl_quartz_scheduler_proper WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_scheduler_impl_quartz_scheduler_proper'
--
INSERT INTO org_apache_sling_commons_scheduler_impl_quartz_scheduler_proper (pool_name, allowed_pool_names, scheduler/useleaderforsingle, metrics/filters, slow_threshold_millis) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_commons_scheduler_impl_quartz_scheduler_proper'
--
UPDATE org_apache_sling_commons_scheduler_impl_quartz_scheduler_proper SET pool_name = ?, allowed_pool_names = ?, scheduler/useleaderforsingle = ?, metrics/filters = ?, slow_threshold_millis = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_scheduler_impl_quartz_scheduler_proper'
--
DELETE FROM org_apache_sling_commons_scheduler_impl_quartz_scheduler_proper WHERE 1=2;

