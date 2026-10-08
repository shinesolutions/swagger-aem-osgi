require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, provider_root : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "provider.root" => provider_root },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
