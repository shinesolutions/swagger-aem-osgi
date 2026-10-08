require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamHandlerFfmpegLocatorImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, executable_searchpath : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamHandlerFfmpegLocatorImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamHandlerFfmpegLocatorImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "executable.searchpath" => executable_searchpath },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
