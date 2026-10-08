require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteCompatrouterImplSwitchMappingConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, group : String? = nil, ids : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "group" => group, "ids" => ids },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
