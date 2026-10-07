# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAnalyzerBaseSystemStatusServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, disabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet',
          type: OpenapiClient::Models::ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'disabled' => disabled }
        )
      end
    end
  end
end
