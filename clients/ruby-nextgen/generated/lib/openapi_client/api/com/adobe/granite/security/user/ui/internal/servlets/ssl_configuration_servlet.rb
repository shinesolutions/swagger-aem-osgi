# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_tags: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet',
          type: OpenapiClient::Models::ComAdobeGraniteSecurityUserUiInternalServletsSSLConfiHeb85b20e,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.tags' => hc_tags }
        )
      end
    end
  end
end
