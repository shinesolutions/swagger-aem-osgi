# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, type: nil, import_mode: nil, acl_handling: nil, package_roots: nil, package_filters: nil, property_filters: nil, temp_fs_folder: nil, use_binary_references: nil, auto_save_threshold: nil, cleanup_delay: nil, file_threshold: nil, mega_bytes: nil, use_off_heap_memory: nil, digest_algorithm: nil, monitoring_queue_size: nil, paths_mapping: nil, strict_import: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionSerializationImplVltVaultDisHb1baa1cc,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'type' => type, 'importMode' => import_mode, 'aclHandling' => acl_handling, 'package.roots' => package_roots, 'package.filters' => package_filters, 'property.filters' => property_filters, 'tempFsFolder' => temp_fs_folder, 'useBinaryReferences' => use_binary_references, 'autoSaveThreshold' => auto_save_threshold, 'cleanupDelay' => cleanup_delay, 'fileThreshold' => file_threshold, 'MEGA_BYTES' => mega_bytes, 'useOffHeapMemory' => use_off_heap_memory, 'digestAlgorithm' => digest_algorithm, 'monitoringQueueSize' => monitoring_queue_size, 'pathsMapping' => paths_mapping, 'strictImport' => strict_import }
        )
      end
    end
  end
end
