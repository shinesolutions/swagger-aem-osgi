# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqCommonsServletsRootMappingServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, rootmapping_target: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet',
          type: OpenapiClient::Models::ComDayCqCommonsServletsRootMappingServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'rootmapping.target' => rootmapping_target }
        )
      end
    end
  end
end
