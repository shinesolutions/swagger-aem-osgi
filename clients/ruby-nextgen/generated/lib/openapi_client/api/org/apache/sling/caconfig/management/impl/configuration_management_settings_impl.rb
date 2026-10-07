# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, ignore_property_name_regex: nil, config_collection_properties_resource_names: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl',
          type: OpenapiClient::Models::OrgApacheSlingCaconfigManagementImplConfigurationManageH60202ef7,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'ignorePropertyNameRegex' => ignore_property_name_regex, 'configCollectionPropertiesResourceNames' => config_collection_properties_resource_names }
        )
      end
    end
  end
end
