# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_tags: nil, dispatcher_address: nil, dispatcher_filter_allowed: nil, dispatcher_filter_blocked: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck',
          type: OpenapiClient::Models::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHeaH3820c17c,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.tags' => hc_tags, 'dispatcher.address' => dispatcher_address, 'dispatcher.filter.allowed' => dispatcher_filter_allowed, 'dispatcher.filter.blocked' => dispatcher_filter_blocked }
        )
      end
    end
  end
end
