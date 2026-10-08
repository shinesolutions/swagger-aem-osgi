require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletAssetStatusServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_batch_status_maxassets : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletAssetStatusServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletAssetStatusServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.batch.status.maxassets" => cq_dam_batch_status_maxassets },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
