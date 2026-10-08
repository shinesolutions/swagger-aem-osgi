require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplRenditionMakerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, xmp_propagate : Bool? = nil, xmp_excludes : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplRenditionMakerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplRenditionMakerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "xmp.propagate" => xmp_propagate, "xmp.excludes" => xmp_excludes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
