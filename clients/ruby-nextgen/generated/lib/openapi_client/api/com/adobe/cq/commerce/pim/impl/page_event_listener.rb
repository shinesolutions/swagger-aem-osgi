# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqCommercePimImplPageEventListener
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_commerce_pageeventlistener_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener',
          type: OpenapiClient::Models::ComAdobeCqCommercePimImplPageEventListenerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.commerce.pageeventlistener.enabled' => cq_commerce_pageeventlistener_enabled }
        )
      end
    end
  end
end
