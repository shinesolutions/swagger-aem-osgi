require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingAuthCoreImplLogoutServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_servlet_methods : Array(String)? = nil, sling_servlet_paths : String? = nil) : Response(OpenAPIClient::OrgApacheSlingAuthCoreImplLogoutServletInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingAuthCoreImplLogoutServletInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.servlet.methods" => sling_servlet_methods, "sling.servlet.paths" => sling_servlet_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
