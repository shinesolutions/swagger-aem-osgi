--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_threads_impl_default_thread_pool_facto'
--
SELECT pid, title, description, properties FROM org_apache_sling_commons_threads_impl_default_thread_pool_facto WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_threads_impl_default_thread_pool_facto'
--
INSERT INTO org_apache_sling_commons_threads_impl_default_thread_pool_facto (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_commons_threads_impl_default_thread_pool_facto'
--
UPDATE org_apache_sling_commons_threads_impl_default_thread_pool_facto SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_threads_impl_default_thread_pool_facto'
--
DELETE FROM org_apache_sling_commons_threads_impl_default_thread_pool_facto WHERE 1=2;

