# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteRestImplServletDefaultGETServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, default_limit: nil, use_absolute_uri: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet',
          type: OpenapiClient::Models::ComAdobeGraniteRestImplServletDefaultGETServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'default.limit' => default_limit, 'use.absolute.uri' => use_absolute_uri }
        )
      end
    end
  end
end
