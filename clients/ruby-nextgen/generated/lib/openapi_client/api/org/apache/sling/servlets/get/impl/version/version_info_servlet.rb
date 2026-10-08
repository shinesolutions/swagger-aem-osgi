# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingServletsGetImplVersionVersionInfoServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_servlet_selectors: nil, ecma_suport: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet',
          type: OpenapiClient::Models::OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.servlet.selectors' => sling_servlet_selectors, 'ecmaSuport' => ecma_suport }
        )
      end
    end
  end
end
