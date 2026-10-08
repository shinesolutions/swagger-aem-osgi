# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportManagementServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, report_fetch_delay: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticH00b9a75b,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'report.fetch.delay' => report_fetch_delay }
        )
      end
    end
  end
end
