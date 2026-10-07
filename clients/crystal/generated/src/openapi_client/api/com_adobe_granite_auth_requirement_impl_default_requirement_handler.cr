require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, supported_paths : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "supportedPaths" => supported_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
