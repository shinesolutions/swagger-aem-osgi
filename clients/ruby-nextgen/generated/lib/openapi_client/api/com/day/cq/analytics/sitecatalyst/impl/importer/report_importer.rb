# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAnalyticsSitecatalystImplImporterReportImporter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, report_fetch_attempts: nil, report_fetch_delay: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter',
          type: OpenapiClient::Models::ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'report.fetch.attempts' => report_fetch_attempts, 'report.fetch.delay' => report_fetch_delay }
        )
      end
    end
  end
end
