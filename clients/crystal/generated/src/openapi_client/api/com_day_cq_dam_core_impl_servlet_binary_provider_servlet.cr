require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletBinaryProviderServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_servlet_resource_types : Array(String)? = nil, sling_servlet_methods : Array(String)? = nil, cq_dam_drm_enable : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletBinaryProviderServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletBinaryProviderServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.servlet.resourceTypes" => sling_servlet_resource_types, "sling.servlet.methods" => sling_servlet_methods, "cq.dam.drm.enable" => cq_dam_drm_enable },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
