# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, queue: nil, drop_invalid_items: nil, agent_target: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionPackagingImplExporterAgentDiHd9bfb1a1,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'queue' => queue, 'drop.invalid.items' => drop_invalid_items, 'agent.target' => agent_target }
        )
      end
    end
  end
end
