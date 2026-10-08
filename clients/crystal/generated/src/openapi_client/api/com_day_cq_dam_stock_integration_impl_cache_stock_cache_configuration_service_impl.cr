require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, get_cache_expiration_unit : String? = nil, get_cache_expiration_value : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "getCacheExpirationUnit" => get_cache_expiration_unit, "getCacheExpirationValue" => get_cache_expiration_value },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
