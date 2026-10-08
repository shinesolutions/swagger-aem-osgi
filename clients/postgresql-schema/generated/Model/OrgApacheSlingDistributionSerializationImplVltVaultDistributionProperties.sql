--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_serialization_impl_vlt_vault_dist'
--
SELECT "name", "type", import_mode, acl_handling, package/roots, package/filters, property/filters, temp_fs_folder, use_binary_references, auto_save_threshold, cleanup_delay, file_threshold, mega_bytes, use_off_heap_memory, digest_algorithm, monitoring_queue_size, paths_mapping, strict_import FROM org_apache_sling_distribution_serialization_impl_vlt_vault_dist WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_serialization_impl_vlt_vault_dist'
--
INSERT INTO org_apache_sling_distribution_serialization_impl_vlt_vault_dist ("name", "type", import_mode, acl_handling, package/roots, package/filters, property/filters, temp_fs_folder, use_binary_references, auto_save_threshold, cleanup_delay, file_threshold, mega_bytes, use_off_heap_memory, digest_algorithm, monitoring_queue_size, paths_mapping, strict_import) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_serialization_impl_vlt_vault_dist'
--
UPDATE org_apache_sling_distribution_serialization_impl_vlt_vault_dist SET "name" = ?, "type" = ?, import_mode = ?, acl_handling = ?, package/roots = ?, package/filters = ?, property/filters = ?, temp_fs_folder = ?, use_binary_references = ?, auto_save_threshold = ?, cleanup_delay = ?, file_threshold = ?, mega_bytes = ?, use_off_heap_memory = ?, digest_algorithm = ?, monitoring_queue_size = ?, paths_mapping = ?, strict_import = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_serialization_impl_vlt_vault_dist'
--
DELETE FROM org_apache_sling_distribution_serialization_impl_vlt_vault_dist WHERE 1=2;

