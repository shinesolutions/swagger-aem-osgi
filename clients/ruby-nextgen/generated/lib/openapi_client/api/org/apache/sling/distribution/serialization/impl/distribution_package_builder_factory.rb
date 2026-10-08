# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionSerializationImplDistributionPackageBuilderFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, type: nil, format_target: nil, temp_fs_folder: nil, file_threshold: nil, memory_unit: nil, use_off_heap_memory: nil, digest_algorithm: nil, monitoring_queue_size: nil, cleanup_delay: nil, package_filters: nil, property_filters: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionSerializationImplDistributionPH4250b837,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'type' => type, 'format.target' => format_target, 'tempFsFolder' => temp_fs_folder, 'fileThreshold' => file_threshold, 'memoryUnit' => memory_unit, 'useOffHeapMemory' => use_off_heap_memory, 'digestAlgorithm' => digest_algorithm, 'monitoringQueueSize' => monitoring_queue_size, 'cleanupDelay' => cleanup_delay, 'package.filters' => package_filters, 'property.filters' => property_filters }
        )
      end
    end
  end
end
