require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamS7damCommonServletsS7damProductInfoServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_servlet_paths : String? = nil, sling_servlet_methods : String? = nil) : Response(OpenAPIClient::ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.servlet.paths" => sling_servlet_paths, "sling.servlet.methods" => sling_servlet_methods },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
