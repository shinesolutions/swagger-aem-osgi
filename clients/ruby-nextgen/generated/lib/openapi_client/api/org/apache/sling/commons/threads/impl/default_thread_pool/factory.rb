# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, min_pool_size: nil, max_pool_size: nil, queue_size: nil, max_thread_age: nil, keep_alive_time: nil, block_policy: nil, shutdown_graceful: nil, daemon: nil, shutdown_wait_time: nil, priority: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory',
          type: OpenapiClient::Models::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'minPoolSize' => min_pool_size, 'maxPoolSize' => max_pool_size, 'queueSize' => queue_size, 'maxThreadAge' => max_thread_age, 'keepAliveTime' => keep_alive_time, 'blockPolicy' => block_policy, 'shutdownGraceful' => shutdown_graceful, 'daemon' => daemon, 'shutdownWaitTime' => shutdown_wait_time, 'priority' => priority }
        )
      end
    end
  end
end
