# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, title: nil, details: nil, enabled: nil, service_name: nil, log_level: nil, allowed_roots: nil, queue_processing_enabled: nil, package_importer_endpoints: nil, passive_queues: nil, priority_queues: nil, retry_strategy: nil, retry_attempts: nil, request_authorization_strategy_target: nil, transport_secret_provider_target: nil, package_builder_target: nil, triggers_target: nil, queue_provider: nil, async_delivery: nil, http_conn_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionAgentImplForwardDistributionAH22dcccfc,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'title' => title, 'details' => details, 'enabled' => enabled, 'serviceName' => service_name, 'log.level' => log_level, 'allowed.roots' => allowed_roots, 'queue.processing.enabled' => queue_processing_enabled, 'packageImporter.endpoints' => package_importer_endpoints, 'passiveQueues' => passive_queues, 'priorityQueues' => priority_queues, 'retry.strategy' => retry_strategy, 'retry.attempts' => retry_attempts, 'requestAuthorizationStrategy.target' => request_authorization_strategy_target, 'transportSecretProvider.target' => transport_secret_provider_target, 'packageBuilder.target' => package_builder_target, 'triggers.target' => triggers_target, 'queue.provider' => queue_provider, 'async.delivery' => async_delivery, 'http.conn.timeout' => http_conn_timeout }
        )
      end
    end
  end
end
