# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqStatisticsImplStatisticsServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_period: nil, scheduler_concurrent: nil, path: nil, workspace: nil, keywords_path: nil, async_entries: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl',
          type: OpenapiClient::Models::ComDayCqStatisticsImplStatisticsServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.period' => scheduler_period, 'scheduler.concurrent' => scheduler_concurrent, 'path' => path, 'workspace' => workspace, 'keywordsPath' => keywords_path, 'asyncEntries' => async_entries }
        )
      end
    end
  end
end
