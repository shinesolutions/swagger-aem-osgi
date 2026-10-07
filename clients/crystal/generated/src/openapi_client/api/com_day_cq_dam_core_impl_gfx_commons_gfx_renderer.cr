require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplGfxCommonsGfxRenderer
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, skip_bufferedcache : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplGfxCommonsGfxRendererInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplGfxCommonsGfxRendererInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "skip.bufferedcache" => skip_bufferedcache },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
