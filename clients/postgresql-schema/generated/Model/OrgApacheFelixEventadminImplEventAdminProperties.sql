--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixEventadminImplEventAdminProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_eventadmin_impl_event_admin_properties'
--
SELECT org/apache/felix/eventadmin/thread_pool_size, org/apache/felix/eventadmin/async_to_sync_thread_ratio, org/apache/felix/eventadmin/timeout, org/apache/felix/eventadmin/require_topic, org/apache/felix/eventadmin/ignore_timeout, org/apache/felix/eventadmin/ignore_topic FROM org_apache_felix_eventadmin_impl_event_admin_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_eventadmin_impl_event_admin_properties'
--
INSERT INTO org_apache_felix_eventadmin_impl_event_admin_properties (org/apache/felix/eventadmin/thread_pool_size, org/apache/felix/eventadmin/async_to_sync_thread_ratio, org/apache/felix/eventadmin/timeout, org/apache/felix/eventadmin/require_topic, org/apache/felix/eventadmin/ignore_timeout, org/apache/felix/eventadmin/ignore_topic) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_eventadmin_impl_event_admin_properties'
--
UPDATE org_apache_felix_eventadmin_impl_event_admin_properties SET org/apache/felix/eventadmin/thread_pool_size = ?, org/apache/felix/eventadmin/async_to_sync_thread_ratio = ?, org/apache/felix/eventadmin/timeout = ?, org/apache/felix/eventadmin/require_topic = ?, org/apache/felix/eventadmin/ignore_timeout = ?, org/apache/felix/eventadmin/ignore_topic = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_eventadmin_impl_event_admin_properties'
--
DELETE FROM org_apache_felix_eventadmin_impl_event_admin_properties WHERE 1=2;

