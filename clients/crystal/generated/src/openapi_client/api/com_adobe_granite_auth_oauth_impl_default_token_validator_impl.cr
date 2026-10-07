require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, auth_token_validator_type : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "auth.token.validator.type" => auth_token_validator_type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
