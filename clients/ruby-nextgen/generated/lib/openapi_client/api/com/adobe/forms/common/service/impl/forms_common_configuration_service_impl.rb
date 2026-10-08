# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, temp_storage_config: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl',
          type: OpenapiClient::Models::ComAdobeFormsCommonServiceImplFormsCommonConfigurationHb23ee019,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'tempStorageConfig' => temp_storage_config }
        )
      end
    end
  end
end
