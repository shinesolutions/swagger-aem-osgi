# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReplicationImplContentDurboBinaryLessContentBuilder
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, binary_threshold: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder',
          type: OpenapiClient::Models::ComDayCqReplicationImplContentDurboBinaryLessContentBH6c0072db,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'binary.threshold' => binary_threshold }
        )
      end
    end
  end
end
