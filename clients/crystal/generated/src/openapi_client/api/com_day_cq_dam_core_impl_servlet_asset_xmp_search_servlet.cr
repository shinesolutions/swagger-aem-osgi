require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletAssetXMPSearchServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_batch_indesign_maxassets : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletAssetXMPSearchServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletAssetXMPSearchServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.batch.indesign.maxassets" => cq_dam_batch_indesign_maxassets },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
