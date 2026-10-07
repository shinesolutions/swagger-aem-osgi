require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteCompatrouterImplRoutingConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, id : String? = nil, compat_path : String? = nil, new_path : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteCompatrouterImplRoutingConfigInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteCompatrouterImplRoutingConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "id" => id, "compatPath" => compat_path, "newPath" => new_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
