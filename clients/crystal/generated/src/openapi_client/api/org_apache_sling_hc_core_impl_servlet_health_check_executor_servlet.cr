require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, servlet_path : String? = nil, disabled : Bool? = nil, cors_access_control_allow_origin : String? = nil) : Response(OpenAPIClient::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "servletPath" => servlet_path, "disabled" => disabled, "cors.accessControlAllowOrigin" => cors_access_control_allow_origin },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
