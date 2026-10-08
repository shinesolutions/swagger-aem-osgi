# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeFormsCommonServletTempCleanUpTask
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_expression: nil, duration_for_temporary_storage: nil, duration_for_anonymous_storage: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask',
          type: OpenapiClient::Models::ComAdobeFormsCommonServletTempCleanUpTaskInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.expression' => scheduler_expression, 'Duration for Temporary Storage' => duration_for_temporary_storage, 'Duration for Anonymous Storage' => duration_for_anonymous_storage }
        )
      end
    end
  end
end
