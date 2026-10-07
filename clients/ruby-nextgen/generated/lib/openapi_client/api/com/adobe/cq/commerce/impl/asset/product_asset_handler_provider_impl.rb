# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_commerce_asset_handler_fallback: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl',
          type: OpenapiClient::Models::ComAdobeCqCommerceImplAssetProductAssetHandlerProvideHdda0b0bc,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.commerce.asset.handler.fallback' => cq_commerce_asset_handler_fallback }
        )
      end
    end
  end
end
