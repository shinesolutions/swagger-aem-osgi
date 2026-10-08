# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReplicationImplReplicatorImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, distribute_events: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl',
          type: OpenapiClient::Models::ComDayCqReplicationImplReplicatorImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'distribute_events' => distribute_events }
        )
      end
    end
  end
end
