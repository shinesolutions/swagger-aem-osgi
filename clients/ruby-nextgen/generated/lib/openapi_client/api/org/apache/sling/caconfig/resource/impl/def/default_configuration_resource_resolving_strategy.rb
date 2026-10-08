# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategy
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled: nil, config_path: nil, fallback_paths: nil, config_collection_inheritance_property_names: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy',
          type: OpenapiClient::Models::OrgApacheSlingCaconfigResourceImplDefDefaultConfiguratHcea41f8e,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabled' => enabled, 'configPath' => config_path, 'fallbackPaths' => fallback_paths, 'configCollectionInheritancePropertyNames' => config_collection_inheritance_property_names }
        )
      end
    end
  end
end
