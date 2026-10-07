# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_social_console_analytics_components: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialSiteImplAnalyticsComponentConfiguratioH91b7ab9b,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.social.console.analytics.components' => cq_social_console_analytics_components }
        )
      end
    end
  end
end
