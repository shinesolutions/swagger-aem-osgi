# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReplicationImplReverseReplicator
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_period: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator',
          type: OpenapiClient::Models::ComDayCqReplicationImplReverseReplicatorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.period' => scheduler_period }
        )
      end
    end
  end
end
