require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSecretProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, username : String? = nil, encrypted_password : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "username" => username, "encryptedPassword" => encrypted_password },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
