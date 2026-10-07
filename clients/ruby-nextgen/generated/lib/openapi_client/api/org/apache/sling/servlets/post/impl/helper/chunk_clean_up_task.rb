# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingServletsPostImplHelperChunkCleanUpTask
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_expression: nil, scheduler_concurrent: nil, chunk_cleanup_age: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask',
          type: OpenapiClient::Models::OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.expression' => scheduler_expression, 'scheduler.concurrent' => scheduler_concurrent, 'chunk.cleanup.age' => chunk_cleanup_age }
        )
      end
    end
  end
end
