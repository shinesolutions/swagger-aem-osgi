# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqCommerceImplPromotionPromotionManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_commerce_promotion_root: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl',
          type: OpenapiClient::Models::ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.commerce.promotion.root' => cq_commerce_promotion_root }
        )
      end
    end
  end
end
