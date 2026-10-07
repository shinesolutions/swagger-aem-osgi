--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_'
--
SELECT scheduler/expression, scheduler/concurrent, chunk/cleanup/age FROM org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_'
--
INSERT INTO org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_ (scheduler/expression, scheduler/concurrent, chunk/cleanup/age) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_'
--
UPDATE org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_ SET scheduler/expression = ?, scheduler/concurrent = ?, chunk/cleanup/age = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_'
--
DELETE FROM org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_ WHERE 1=2;

