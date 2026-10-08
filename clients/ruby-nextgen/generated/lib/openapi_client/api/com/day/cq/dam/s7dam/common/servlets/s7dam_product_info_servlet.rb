# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamS7damCommonServletsS7damProductInfoServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_servlet_paths: nil, sling_servlet_methods: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet',
          type: OpenapiClient::Models::ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.servlet.paths' => sling_servlet_paths, 'sling.servlet.methods' => sling_servlet_methods }
        )
      end
    end
  end
end
