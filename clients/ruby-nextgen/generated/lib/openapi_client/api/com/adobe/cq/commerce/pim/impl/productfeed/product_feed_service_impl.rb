# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, feed_generator_algorithm: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqCommercePimImplProductfeedProductFeedServicH35a566b9,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'Feed generator algorithm' => feed_generator_algorithm }
        )
      end
    end
  end
end
