# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportImporterServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_social_reporting_analytics_polling_importer_interval: nil, cq_social_reporting_analytics_polling_importer_page_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticHd0d47877,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.social.reporting.analytics.polling.importer.interval' => cq_social_reporting_analytics_polling_importer_interval, 'cq.social.reporting.analytics.polling.importer.pageSize' => cq_social_reporting_analytics_polling_importer_page_size }
        )
      end
    end
  end
end
