# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, description: nil, overrides: nil, enabled: nil, service_ranking: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider',
          type: OpenapiClient::Models::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOveHfae9c296,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'description' => description, 'overrides' => overrides, 'enabled' => enabled, 'service.ranking' => service_ranking }
        )
      end
    end
  end
end
