# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, get_cache_expiration_unit: nil, get_cache_expiration_value: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl',
          type: OpenapiClient::Models::ComDayCqDamStockIntegrationImplCacheStockCacheConfigHa3531142,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'getCacheExpirationUnit' => get_cache_expiration_unit, 'getCacheExpirationValue' => get_cache_expiration_value }
        )
      end
    end
  end
end
