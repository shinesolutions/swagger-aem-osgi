# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStrategy
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy',
          type: OpenapiClient::Models::OrgApacheSlingCaconfigImplDefDefaultConfigurationPersiH97c411f7,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabled' => enabled }
        )
      end
    end
  end
end
