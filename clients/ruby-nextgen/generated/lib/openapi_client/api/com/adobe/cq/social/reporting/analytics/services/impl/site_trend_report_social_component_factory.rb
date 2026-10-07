# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSocialComponentFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_social_console_analytics_sites_mapping: nil, priority: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory',
          type: OpenapiClient::Models::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTreH5be02b93,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.social.console.analytics.sites.mapping' => cq_social_console_analytics_sites_mapping, 'priority' => priority }
        )
      end
    end
  end
end
