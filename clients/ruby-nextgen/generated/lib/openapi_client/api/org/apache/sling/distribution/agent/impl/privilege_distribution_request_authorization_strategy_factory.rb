# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAuthorizationStrategyFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, jcr_privilege: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionAgentImplPrivilegeDistributioH2ae89bc2,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'jcrPrivilege' => jcr_privilege }
        )
      end
    end
  end
end
