require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, compatgroups : Array(String)? = nil, enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "compatgroups" => compatgroups, "enabled" => enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
