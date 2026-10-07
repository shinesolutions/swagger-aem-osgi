# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeFormsCommonServiceImplDefaultDataProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, alloweddata_file_locations: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider',
          type: OpenapiClient::Models::ComAdobeFormsCommonServiceImplDefaultDataProviderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'alloweddataFileLocations' => alloweddata_file_locations }
        )
      end
    end
  end
end
