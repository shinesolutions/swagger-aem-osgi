# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAcpPlatformPlatformServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, query_limit: nil, file_type_extension_map: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet',
          type: OpenapiClient::Models::ComAdobeGraniteAcpPlatformPlatformServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'query.limit' => query_limit, 'file.type.extension.map' => file_type_extension_map }
        )
      end
    end
  end
end
