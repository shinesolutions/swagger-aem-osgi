require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, provider_roots : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "provider.roots" => provider_roots },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
