# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEventJobsQueueConfiguration
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, queue_name: nil, queue_topics: nil, queue_type: nil, queue_priority: nil, queue_retries: nil, queue_retrydelay: nil, queue_maxparallel: nil, queue_keep_jobs: nil, queue_prefer_run_on_creation_instance: nil, queue_thread_pool_size: nil, service_ranking: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration',
          type: OpenapiClient::Models::OrgApacheSlingEventJobsQueueConfigurationInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'queue.name' => queue_name, 'queue.topics' => queue_topics, 'queue.type' => queue_type, 'queue.priority' => queue_priority, 'queue.retries' => queue_retries, 'queue.retrydelay' => queue_retrydelay, 'queue.maxparallel' => queue_maxparallel, 'queue.keepJobs' => queue_keep_jobs, 'queue.preferRunOnCreationInstance' => queue_prefer_run_on_creation_instance, 'queue.threadPoolSize' => queue_thread_pool_size, 'service.ranking' => service_ranking }
        )
      end
    end
  end
end
