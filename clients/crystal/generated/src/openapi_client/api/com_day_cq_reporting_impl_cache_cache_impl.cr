require "json"

module OpenAPIClient
  module Api
  class ComDayCqReportingImplCacheCacheImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, repcache_enable : Bool? = nil, repcache_ttl : Int32? = nil, repcache_max : Int32? = nil) : Response(OpenAPIClient::ComDayCqReportingImplCacheCacheImplInfo)
      @conn.request(OpenAPIClient::ComDayCqReportingImplCacheCacheImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "repcache.enable" => repcache_enable, "repcache.ttl" => repcache_ttl, "repcache.max" => repcache_max },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
