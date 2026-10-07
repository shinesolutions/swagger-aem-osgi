# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, testandtarget_endpoint_url: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet',
          type: OpenapiClient::Models::ComDayCqAnalyticsTestandtargetImplServletsAdminServerSH0e39cf75,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'testandtarget.endpoint.url' => testandtarget_endpoint_url }
        )
      end
    end
  end
end
