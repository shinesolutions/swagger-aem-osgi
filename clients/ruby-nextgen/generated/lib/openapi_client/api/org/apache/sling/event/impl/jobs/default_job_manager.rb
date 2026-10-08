# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEventImplJobsDefaultJobManager
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, queue_priority: nil, queue_retries: nil, queue_retrydelay: nil, queue_maxparallel: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager',
          type: OpenapiClient::Models::OrgApacheSlingEventImplJobsDefaultJobManagerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'queue.priority' => queue_priority, 'queue.retries' => queue_retries, 'queue.retrydelay' => queue_retrydelay, 'queue.maxparallel' => queue_maxparallel }
        )
      end
    end
  end
end
