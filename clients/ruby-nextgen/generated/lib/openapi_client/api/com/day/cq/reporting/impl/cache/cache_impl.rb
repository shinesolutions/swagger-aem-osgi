# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReportingImplCacheCacheImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, repcache_enable: nil, repcache_ttl: nil, repcache_max: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl',
          type: OpenapiClient::Models::ComDayCqReportingImplCacheCacheImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'repcache.enable' => repcache_enable, 'repcache.ttl' => repcache_ttl, 'repcache.max' => repcache_max }
        )
      end
    end
  end
end
