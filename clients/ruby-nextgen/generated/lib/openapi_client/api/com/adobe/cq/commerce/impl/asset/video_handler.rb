# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqCommerceImplAssetVideoHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_commerce_asset_handler_active: nil, cq_commerce_asset_handler_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler',
          type: OpenapiClient::Models::ComAdobeCqCommerceImplAssetVideoHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.commerce.asset.handler.active' => cq_commerce_asset_handler_active, 'cq.commerce.asset.handler.name' => cq_commerce_asset_handler_name }
        )
      end
    end
  end
end
