require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplCacheCQBufferedImageCache
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_image_cache_max_memory : Int32? = nil, cq_dam_image_cache_max_age : Int32? = nil, cq_dam_image_cache_max_dimension : String? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.image.cache.max.memory" => cq_dam_image_cache_max_memory, "cq.dam.image.cache.max.age" => cq_dam_image_cache_max_age, "cq.dam.image.cache.max.dimension" => cq_dam_image_cache_max_dimension },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
