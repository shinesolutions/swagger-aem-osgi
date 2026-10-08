require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingStrategy
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil, fallback_paths : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled, "fallbackPaths" => fallback_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
