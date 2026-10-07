# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCrxSecurityTokenImplTokenCleanupTask
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enable_token_cleanup_task: nil, scheduler_expression: nil, batch_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask',
          type: OpenapiClient::Models::ComDayCrxSecurityTokenImplTokenCleanupTaskInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enable.token.cleanup.task' => enable_token_cleanup_task, 'scheduler.expression' => scheduler_expression, 'batch.size' => batch_size }
        )
      end
    end
  end
end
