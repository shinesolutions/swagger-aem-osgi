# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCommonsSchedulerImplQuartzScheduler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, pool_name: nil, allowed_pool_names: nil, scheduler_useleaderforsingle: nil, metrics_filters: nil, slow_threshold_millis: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler',
          type: OpenapiClient::Models::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'poolName' => pool_name, 'allowedPoolNames' => allowed_pool_names, 'scheduler.useleaderforsingle' => scheduler_useleaderforsingle, 'metrics.filters' => metrics_filters, 'slowThresholdMillis' => slow_threshold_millis }
        )
      end
    end
  end
end
