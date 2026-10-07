require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplHandlerIndesignFormatHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, mimetype : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "mimetype" => mimetype },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
