# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTriggerFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, endpoint: nil, transport_secret_provider_target: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionTriggerImplRemoteEventDistriHa47583fa,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'endpoint' => endpoint, 'transportSecretProvider.target' => transport_secret_provider_target }
        )
      end
    end
  end
end
