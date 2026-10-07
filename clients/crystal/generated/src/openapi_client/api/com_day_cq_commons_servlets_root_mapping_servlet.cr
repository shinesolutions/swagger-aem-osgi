require "json"

module OpenAPIClient
  module Api
  class ComDayCqCommonsServletsRootMappingServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, rootmapping_target : String? = nil) : Response(OpenAPIClient::ComDayCqCommonsServletsRootMappingServletInfo)
      @conn.request(OpenAPIClient::ComDayCqCommonsServletsRootMappingServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "rootmapping.target" => rootmapping_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
