# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmFoundationFormsImplMailServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_servlet_resource_types: nil, sling_servlet_selectors: nil, resource_whitelist: nil, resource_blacklist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet',
          type: OpenapiClient::Models::ComDayCqWcmFoundationFormsImplMailServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.servlet.resourceTypes' => sling_servlet_resource_types, 'sling.servlet.selectors' => sling_servlet_selectors, 'resource.whitelist' => resource_whitelist, 'resource.blacklist' => resource_blacklist }
        )
      end
    end
  end
end
