# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqNotificationImplNotificationServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, event_filter: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl',
          type: OpenapiClient::Models::ComDayCqNotificationImplNotificationServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'event.filter' => event_filter }
        )
      end
    end
  end
end
