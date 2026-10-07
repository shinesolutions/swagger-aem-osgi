# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixSystemreadyImplServletSystemReadyServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, osgi_http_whiteboard_servlet_pattern: nil, osgi_http_whiteboard_context_select: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet',
          type: OpenapiClient::Models::OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'osgi.http.whiteboard.servlet.pattern' => osgi_http_whiteboard_servlet_pattern, 'osgi.http.whiteboard.context.select' => osgi_http_whiteboard_context_select }
        )
      end
    end
  end
end
