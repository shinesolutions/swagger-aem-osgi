--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_scheduler_impl_scheduler_health_check_'
--
SELECT max/quartz_job/duration/acceptable FROM org_apache_sling_commons_scheduler_impl_scheduler_health_check_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_scheduler_impl_scheduler_health_check_'
--
INSERT INTO org_apache_sling_commons_scheduler_impl_scheduler_health_check_ (max/quartz_job/duration/acceptable) VALUES (?);

--
-- UPDATE template for table 'org_apache_sling_commons_scheduler_impl_scheduler_health_check_'
--
UPDATE org_apache_sling_commons_scheduler_impl_scheduler_health_check_ SET max/quartz_job/duration/acceptable = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_scheduler_impl_scheduler_health_check_'
--
DELETE FROM org_apache_sling_commons_scheduler_impl_scheduler_health_check_ WHERE 1=2;

