# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmFoundationImplPageRedirectServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, excluded_resource_types: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet',
          type: OpenapiClient::Models::ComDayCqWcmFoundationImplPageRedirectServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'excluded.resource.types' => excluded_resource_types }
        )
      end
    end
  end
end
