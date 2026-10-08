# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponentFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, resource_type_filters: nil, priority: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory',
          type: OpenapiClient::Models::ComAdobeCqSocialModerationDashboardApiFilterGroupSociHcc7d0a79,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'resourceType.filters' => resource_type_filters, 'priority' => priority }
        )
      end
    end
  end
end
