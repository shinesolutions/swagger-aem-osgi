--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_threads_impl_default_thread_pool_facto'
--
SELECT "name", min_pool_size, max_pool_size, queue_size, max_thread_age, keep_alive_time, block_policy, shutdown_graceful, daemon, shutdown_wait_time, priority FROM org_apache_sling_commons_threads_impl_default_thread_pool_facto WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_threads_impl_default_thread_pool_facto'
--
INSERT INTO org_apache_sling_commons_threads_impl_default_thread_pool_facto ("name", min_pool_size, max_pool_size, queue_size, max_thread_age, keep_alive_time, block_policy, shutdown_graceful, daemon, shutdown_wait_time, priority) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_commons_threads_impl_default_thread_pool_facto'
--
UPDATE org_apache_sling_commons_threads_impl_default_thread_pool_facto SET "name" = ?, min_pool_size = ?, max_pool_size = ?, queue_size = ?, max_thread_age = ?, keep_alive_time = ?, block_policy = ?, shutdown_graceful = ?, daemon = ?, shutdown_wait_time = ?, priority = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_threads_impl_default_thread_pool_facto'
--
DELETE FROM org_apache_sling_commons_threads_impl_default_thread_pool_facto WHERE 1=2;

