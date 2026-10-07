# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAnalyticsTestandtargetImplSegmentImporter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_analytics_testandtarget_segmentimporter_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter',
          type: OpenapiClient::Models::ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.analytics.testandtarget.segmentimporter.enabled' => cq_analytics_testandtarget_segmentimporter_enabled }
        )
      end
    end
  end
end
