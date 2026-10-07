require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamVideoImplServletVideoTestServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamVideoImplServletVideoTestServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamVideoImplServletVideoTestServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
