require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamHandlerStandardPsPostScriptHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, raster_annotation : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamHandlerStandardPsPostScriptHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamHandlerStandardPsPostScriptHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "raster.annotation" => raster_annotation },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
