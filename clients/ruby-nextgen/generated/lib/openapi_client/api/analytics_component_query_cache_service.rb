# frozen_string_literal: true

module OpenapiClient
  module Api
    class Analytics Component Query Cache Service
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_analytics_component_query_cache_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/Analytics Component Query Cache Service',
          type: OpenapiClient::Models::AnalyticsComponentQueryCacheServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.analytics.component.query.cache.size' => cq_analytics_component_query_cache_size }
        )
      end
    end
  end
end
