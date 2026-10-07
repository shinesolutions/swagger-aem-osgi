# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_expression: nil, scheduler_concurrent: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner',
          type: OpenapiClient::Models::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReporH231e3b63,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.expression' => scheduler_expression, 'scheduler.concurrent' => scheduler_concurrent }
        )
      end
    end
  end
end
