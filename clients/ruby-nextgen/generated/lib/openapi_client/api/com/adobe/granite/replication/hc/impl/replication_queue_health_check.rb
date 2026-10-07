# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, number_of_retries_allowed: nil, hc_tags: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck',
          type: OpenapiClient::Models::ComAdobeGraniteReplicationHcImplReplicationQueueHealthHb13d31cb,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'number.of.retries.allowed' => number_of_retries_allowed, 'hc.tags' => hc_tags }
        )
      end
    end
  end
end
