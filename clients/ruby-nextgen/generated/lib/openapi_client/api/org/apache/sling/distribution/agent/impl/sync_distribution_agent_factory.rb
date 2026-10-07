# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, title: nil, details: nil, enabled: nil, service_name: nil, log_level: nil, queue_processing_enabled: nil, passive_queues: nil, package_exporter_endpoints: nil, package_importer_endpoints: nil, retry_strategy: nil, retry_attempts: nil, pull_items: nil, http_conn_timeout: nil, request_authorization_strategy_target: nil, transport_secret_provider_target: nil, package_builder_target: nil, triggers_target: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionAgentImplSyncDistributionAgeH541b02bd,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'title' => title, 'details' => details, 'enabled' => enabled, 'serviceName' => service_name, 'log.level' => log_level, 'queue.processing.enabled' => queue_processing_enabled, 'passiveQueues' => passive_queues, 'packageExporter.endpoints' => package_exporter_endpoints, 'packageImporter.endpoints' => package_importer_endpoints, 'retry.strategy' => retry_strategy, 'retry.attempts' => retry_attempts, 'pull.items' => pull_items, 'http.conn.timeout' => http_conn_timeout, 'requestAuthorizationStrategy.target' => request_authorization_strategy_target, 'transportSecretProvider.target' => transport_secret_provider_target, 'packageBuilder.target' => package_builder_target, 'triggers.target' => triggers_target }
        )
      end
    end
  end
end
