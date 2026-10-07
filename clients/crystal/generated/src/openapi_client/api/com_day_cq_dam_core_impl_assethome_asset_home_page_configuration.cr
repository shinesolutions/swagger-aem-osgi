require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, is_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "isEnabled" => is_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
