# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSocialComponentFactoryV2
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, resource_type_filters: nil, priority: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2',
          type: OpenapiClient::Models::ComAdobeCqSocialModerationDashboardInternalImplFilterHad6e1f14,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'resourceType.filters' => resource_type_filters, 'priority' => priority }
        )
      end
    end
  end
end
