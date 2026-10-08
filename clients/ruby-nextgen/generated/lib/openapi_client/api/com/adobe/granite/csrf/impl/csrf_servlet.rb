# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteCsrfImplCSRFServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, csrf_token_expires_in: nil, sling_auth_requirements: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet',
          type: OpenapiClient::Models::ComAdobeGraniteCsrfImplCSRFServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'csrf.token.expires.in' => csrf_token_expires_in, 'sling.auth.requirements' => sling_auth_requirements }
        )
      end
    end
  end
end
