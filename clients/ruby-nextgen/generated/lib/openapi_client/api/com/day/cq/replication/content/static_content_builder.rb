# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReplicationContentStaticContentBuilder
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, host: nil, port: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder',
          type: OpenapiClient::Models::ComDayCqReplicationContentStaticContentBuilderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'host' => host, 'port' => port }
        )
      end
    end
  end
end
