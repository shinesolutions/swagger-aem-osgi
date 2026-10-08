# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmFoundationFormsImplFormsHandlingServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name_whitelist: nil, allow_expressions: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet',
          type: OpenapiClient::Models::ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name.whitelist' => name_whitelist, 'allow.expressions' => allow_expressions }
        )
      end
    end
  end
end
