# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStrategy
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled: nil, config_property_inheritance_property_names: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy',
          type: OpenapiClient::Models::OrgApacheSlingCaconfigImplDefDefaultConfigurationInherH2e560514,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabled' => enabled, 'configPropertyInheritancePropertyNames' => config_property_inheritance_property_names }
        )
      end
    end
  end
end
