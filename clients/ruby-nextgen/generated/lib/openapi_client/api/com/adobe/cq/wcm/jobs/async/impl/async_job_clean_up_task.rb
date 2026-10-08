# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_expression: nil, job_purge_threshold: nil, job_purge_max_jobs: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask',
          type: OpenapiClient::Models::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.expression' => scheduler_expression, 'job.purge.threshold' => job_purge_threshold, 'job.purge.max.jobs' => job_purge_max_jobs }
        )
      end
    end
  end
end
