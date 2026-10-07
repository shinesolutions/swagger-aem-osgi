require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamHandlerStandardPsdPsdHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, large_file_threshold : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamHandlerStandardPsdPsdHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamHandlerStandardPsdPsdHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "large_file_threshold" => large_file_threshold },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
