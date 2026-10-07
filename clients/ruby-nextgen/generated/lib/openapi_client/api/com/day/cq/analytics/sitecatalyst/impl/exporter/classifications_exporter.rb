# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, allowed_paths: nil, cq_analytics_saint_exporter_pagesize: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter',
          type: OpenapiClient::Models::ComDayCqAnalyticsSitecatalystImplExporterClassificationHe62cfe69,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'allowed.paths' => allowed_paths, 'cq.analytics.saint.exporter.pagesize' => cq_analytics_saint_exporter_pagesize }
        )
      end
    end
  end
end
