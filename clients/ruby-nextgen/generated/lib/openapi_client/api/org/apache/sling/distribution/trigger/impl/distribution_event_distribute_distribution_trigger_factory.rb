# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeDistributionTriggerFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionTriggerImplDistributionEventDHa9c4cf3d,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'path' => path }
        )
      end
    end
  end
end
