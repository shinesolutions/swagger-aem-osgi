require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, jmx_objectname : String? = nil, active : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "jmx.objectname" => jmx_objectname, "active" => active },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
