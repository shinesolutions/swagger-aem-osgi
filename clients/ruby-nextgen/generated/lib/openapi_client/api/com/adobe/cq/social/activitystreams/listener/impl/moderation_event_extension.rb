# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtension
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, accepted: nil, ranked: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension',
          type: OpenapiClient::Models::ComAdobeCqSocialActivitystreamsListenerImplModerationEHa964e4b6,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'accepted' => accepted, 'ranked' => ranked }
        )
      end
    end
  end
end
