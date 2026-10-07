# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, archiving_enabled: nil, scheduler_expression: nil, archive_since_days_completed: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService',
          type: OpenapiClient::Models::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'archiving.enabled' => archiving_enabled, 'scheduler.expression' => scheduler_expression, 'archive.since.days.completed' => archive_since_days_completed }
        )
      end
    end
  end
end
