# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamProcessorNuiImplNuiAssetProcessor
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, nui_enabled: nil, nui_service_url: nil, nui_api_key: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor',
          type: OpenapiClient::Models::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'nuiEnabled' => nui_enabled, 'nuiServiceUrl' => nui_service_url, 'nuiApiKey' => nui_api_key }
        )
      end
    end
  end
end
