# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageConfigurator
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, felix_memoryusage_dump_threshold: nil, felix_memoryusage_dump_interval: nil, felix_memoryusage_dump_location: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator',
          type: OpenapiClient::Models::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemorHe18991f1,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'felix.memoryusage.dump.threshold' => felix_memoryusage_dump_threshold, 'felix.memoryusage.dump.interval' => felix_memoryusage_dump_interval, 'felix.memoryusage.dump.location' => felix_memoryusage_dump_location }
        )
      end
    end
  end
end
