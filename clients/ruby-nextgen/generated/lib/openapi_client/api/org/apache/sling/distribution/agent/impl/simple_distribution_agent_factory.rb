# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, title: nil, details: nil, enabled: nil, service_name: nil, log_level: nil, queue_processing_enabled: nil, package_exporter_target: nil, package_importer_target: nil, request_authorization_strategy_target: nil, triggers_target: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionAgentImplSimpleDistributionAH84eaf1c9,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'title' => title, 'details' => details, 'enabled' => enabled, 'serviceName' => service_name, 'log.level' => log_level, 'queue.processing.enabled' => queue_processing_enabled, 'packageExporter.target' => package_exporter_target, 'packageImporter.target' => package_importer_target, 'requestAuthorizationStrategy.target' => request_authorization_strategy_target, 'triggers.target' => triggers_target }
        )
      end
    end
  end
end
