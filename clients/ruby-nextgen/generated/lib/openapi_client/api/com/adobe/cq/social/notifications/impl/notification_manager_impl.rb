# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialNotificationsImplNotificationManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_unread_notification_count: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'max.unread.notification.count' => max_unread_notification_count }
        )
      end
    end
  end
end
