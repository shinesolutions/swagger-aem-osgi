# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponentFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, priority: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory',
          type: OpenapiClient::Models::ComAdobeCqSocialModerationDashboardApiUserDetailsSociH341c3db3,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'priority' => priority }
        )
      end
    end
  end
end
