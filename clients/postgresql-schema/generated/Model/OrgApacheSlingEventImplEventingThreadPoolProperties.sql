--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEventImplEventingThreadPoolProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_event_impl_eventing_thread_pool_properties'
--
SELECT min_pool_size FROM org_apache_sling_event_impl_eventing_thread_pool_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_event_impl_eventing_thread_pool_properties'
--
INSERT INTO org_apache_sling_event_impl_eventing_thread_pool_properties (min_pool_size) VALUES (?);

--
-- UPDATE template for table 'org_apache_sling_event_impl_eventing_thread_pool_properties'
--
UPDATE org_apache_sling_event_impl_eventing_thread_pool_properties SET min_pool_size = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_event_impl_eventing_thread_pool_properties'
--
DELETE FROM org_apache_sling_event_impl_eventing_thread_pool_properties WHERE 1=2;

