# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmNotificationImplNotificationManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, event_topics: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl',
          type: OpenapiClient::Models::ComDayCqWcmNotificationImplNotificationManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'event.topics' => event_topics }
        )
      end
    end
  end
end
