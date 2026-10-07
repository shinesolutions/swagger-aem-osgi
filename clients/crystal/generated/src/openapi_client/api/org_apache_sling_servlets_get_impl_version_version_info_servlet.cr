require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingServletsGetImplVersionVersionInfoServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_servlet_selectors : Array(String)? = nil, ecma_suport : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.servlet.selectors" => sling_servlet_selectors, "ecmaSuport" => ecma_suport },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
