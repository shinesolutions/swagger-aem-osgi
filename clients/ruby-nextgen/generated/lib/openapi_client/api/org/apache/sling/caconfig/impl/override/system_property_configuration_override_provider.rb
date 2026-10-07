# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOverrideProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled: nil, service_ranking: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider',
          type: OpenapiClient::Models::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigH4d1699f2,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabled' => enabled, 'service.ranking' => service_ranking }
        )
      end
    end
  end
end
