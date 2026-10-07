# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWorkflowImplEmailTaskEMailNotificationService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, notify_onupdate: nil, notify_oncomplete: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService',
          type: OpenapiClient::Models::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'notify.onupdate' => notify_onupdate, 'notify.oncomplete' => notify_oncomplete }
        )
      end
    end
  end
end
