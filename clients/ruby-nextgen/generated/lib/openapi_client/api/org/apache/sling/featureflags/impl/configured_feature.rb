# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingFeatureflagsImplConfiguredFeature
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, description: nil, enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature',
          type: OpenapiClient::Models::OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'description' => description, 'enabled' => enabled }
        )
      end
    end
  end
end
