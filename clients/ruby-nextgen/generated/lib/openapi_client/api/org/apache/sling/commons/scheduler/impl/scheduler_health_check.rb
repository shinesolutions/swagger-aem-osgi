# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_quartz_job_duration_acceptable: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck',
          type: OpenapiClient::Models::OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'max.quartzJob.duration.acceptable' => max_quartz_job_duration_acceptable }
        )
      end
    end
  end
end
