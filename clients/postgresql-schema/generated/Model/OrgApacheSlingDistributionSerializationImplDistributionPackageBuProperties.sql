--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_serialization_impl_distribution_p'
--
SELECT "name", "type", format/target, temp_fs_folder, file_threshold, memory_unit, use_off_heap_memory, digest_algorithm, monitoring_queue_size, cleanup_delay, package/filters, property/filters FROM org_apache_sling_distribution_serialization_impl_distribution_p WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_serialization_impl_distribution_p'
--
INSERT INTO org_apache_sling_distribution_serialization_impl_distribution_p ("name", "type", format/target, temp_fs_folder, file_threshold, memory_unit, use_off_heap_memory, digest_algorithm, monitoring_queue_size, cleanup_delay, package/filters, property/filters) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_serialization_impl_distribution_p'
--
UPDATE org_apache_sling_distribution_serialization_impl_distribution_p SET "name" = ?, "type" = ?, format/target = ?, temp_fs_folder = ?, file_threshold = ?, memory_unit = ?, use_off_heap_memory = ?, digest_algorithm = ?, monitoring_queue_size = ?, cleanup_delay = ?, package/filters = ?, property/filters = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_serialization_impl_distribution_p'
--
DELETE FROM org_apache_sling_distribution_serialization_impl_distribution_p WHERE 1=2;

