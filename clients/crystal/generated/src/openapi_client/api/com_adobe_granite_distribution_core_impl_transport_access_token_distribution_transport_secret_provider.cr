require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistributionTransportSecretProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, service_name : String? = nil, user_id : String? = nil, access_token_provider_target : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "serviceName" => service_name, "userId" => user_id, "accessTokenProvider.target" => access_token_provider_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
