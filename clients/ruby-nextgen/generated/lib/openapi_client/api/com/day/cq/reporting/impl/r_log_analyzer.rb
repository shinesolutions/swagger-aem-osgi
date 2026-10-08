# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReportingImplRLogAnalyzer
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, request_log_output: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer',
          type: OpenapiClient::Models::ComDayCqReportingImplRLogAnalyzerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'request.log.output' => request_log_output }
        )
      end
    end
  end
end
