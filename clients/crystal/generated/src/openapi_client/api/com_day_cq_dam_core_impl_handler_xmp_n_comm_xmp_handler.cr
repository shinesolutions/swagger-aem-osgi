require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplHandlerXmpNCommXMPHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, xmphandler_cq_formats : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "xmphandler.cq.formats" => xmphandler_cq_formats },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
