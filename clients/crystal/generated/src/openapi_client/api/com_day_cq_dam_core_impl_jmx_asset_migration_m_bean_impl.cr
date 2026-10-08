require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, jmx_objectname : String? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "jmx.objectname" => jmx_objectname },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
