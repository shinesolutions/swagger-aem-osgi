require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletCreateAssetServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, detect_duplicate : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletCreateAssetServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletCreateAssetServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "detect_duplicate" => detect_duplicate },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
