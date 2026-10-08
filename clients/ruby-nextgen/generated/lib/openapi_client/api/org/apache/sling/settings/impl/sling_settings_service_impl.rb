# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingSettingsImplSlingSettingsServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_name: nil, sling_description: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl',
          type: OpenapiClient::Models::OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.name' => sling_name, 'sling.description' => sling_description }
        )
      end
    end
  end
end
