# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmFoundationImplAdaptiveImageComponentServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, adapt_supported_widths: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet',
          type: OpenapiClient::Models::ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'adapt.supported.widths' => adapt_supported_widths }
        )
      end
    end
  end
end
