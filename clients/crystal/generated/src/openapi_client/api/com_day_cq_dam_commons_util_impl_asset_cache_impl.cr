require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCommonsUtilImplAssetCacheImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, large_file_min : Int32? = nil, cache_apply : Bool? = nil, mime_types : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamCommonsUtilImplAssetCacheImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCommonsUtilImplAssetCacheImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "large.file.min" => large_file_min, "cache.apply" => cache_apply, "mime.types" => mime_types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
