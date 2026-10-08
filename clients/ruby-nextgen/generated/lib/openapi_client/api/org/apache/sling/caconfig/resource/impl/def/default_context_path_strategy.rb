# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled: nil, config_ref_resource_names: nil, config_ref_property_names: nil, service_ranking: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy',
          type: OpenapiClient::Models::OrgApacheSlingCaconfigResourceImplDefDefaultContextPaH8b1ba595,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabled' => enabled, 'configRefResourceNames' => config_ref_resource_names, 'configRefPropertyNames' => config_ref_property_names, 'service.ranking' => service_ranking }
        )
      end
    end
  end
end
