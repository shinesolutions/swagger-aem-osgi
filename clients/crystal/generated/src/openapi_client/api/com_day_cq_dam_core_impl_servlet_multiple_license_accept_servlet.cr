require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_drm_enable : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.drm.enable" => cq_dam_drm_enable },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
