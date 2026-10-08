# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEventImplEventingThreadPool
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, min_pool_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool',
          type: OpenapiClient::Models::OrgApacheSlingEventImplEventingThreadPoolInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'minPoolSize' => min_pool_size }
        )
      end
    end
  end
end
