require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplLightboxLightboxServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_servlet_paths : String? = nil, sling_servlet_methods : Array(String)? = nil, cq_dam_enable_anonymous : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplLightboxLightboxServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplLightboxLightboxServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.servlet.paths" => sling_servlet_paths, "sling.servlet.methods" => sling_servlet_methods, "cq.dam.enable.anonymous" => cq_dam_enable_anonymous },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
