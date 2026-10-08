# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, title: nil, details: nil, enabled: nil, service_name: nil, log_level: nil, allowed_roots: nil, request_authorization_strategy_target: nil, queue_provider_factory_target: nil, package_builder_target: nil, triggers_target: nil, priority_queues: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionAgentImplQueueDistributionAgHc48435fb,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'title' => title, 'details' => details, 'enabled' => enabled, 'serviceName' => service_name, 'log.level' => log_level, 'allowed.roots' => allowed_roots, 'requestAuthorizationStrategy.target' => request_authorization_strategy_target, 'queueProviderFactory.target' => queue_provider_factory_target, 'packageBuilder.target' => package_builder_target, 'triggers.target' => triggers_target, 'priorityQueues' => priority_queues }
        )
      end
    end
  end
end
