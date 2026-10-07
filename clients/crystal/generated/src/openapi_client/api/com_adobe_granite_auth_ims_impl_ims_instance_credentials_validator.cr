require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_provider_id : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.provider.id" => oauth_provider_id },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
