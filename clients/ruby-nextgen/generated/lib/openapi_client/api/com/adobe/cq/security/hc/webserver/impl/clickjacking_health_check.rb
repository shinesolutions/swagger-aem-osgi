# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_tags: nil, webserver_address: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck',
          type: OpenapiClient::Models::ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.tags' => hc_tags, 'webserver.address' => webserver_address }
        )
      end
    end
  end
end
