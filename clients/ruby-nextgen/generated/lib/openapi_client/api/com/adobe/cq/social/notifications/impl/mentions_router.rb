# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialNotificationsImplMentionsRouter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, event_topics: nil, event_filter: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter',
          type: OpenapiClient::Models::ComAdobeCqSocialNotificationsImplMentionsRouterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'event.topics' => event_topics, 'event.filter' => event_filter }
        )
      end
    end
  end
end
