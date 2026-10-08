require "json"

module OpenAPIClient
  module Api
  class AnalyticsComponentQueryCacheService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_analytics_component_query_cache_size : Int32? = nil) : Response(OpenAPIClient::AnalyticsComponentQueryCacheServiceInfo)
      @conn.request(OpenAPIClient::AnalyticsComponentQueryCacheServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/Analytics Component Query Cache Service",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.analytics.component.query.cache.size" => cq_analytics_component_query_cache_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
