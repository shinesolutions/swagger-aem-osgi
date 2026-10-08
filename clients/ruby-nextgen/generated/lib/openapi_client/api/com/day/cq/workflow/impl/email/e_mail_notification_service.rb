# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWorkflowImplEmailEMailNotificationService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, from_address: nil, host_prefix: nil, notify_onabort: nil, notify_oncomplete: nil, notify_oncontainercomplete: nil, notify_useronly: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService',
          type: OpenapiClient::Models::ComDayCqWorkflowImplEmailEMailNotificationServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'from.address' => from_address, 'host.prefix' => host_prefix, 'notify.onabort' => notify_onabort, 'notify.oncomplete' => notify_oncomplete, 'notify.oncontainercomplete' => notify_oncontainercomplete, 'notify.useronly' => notify_useronly }
        )
      end
    end
  end
end
