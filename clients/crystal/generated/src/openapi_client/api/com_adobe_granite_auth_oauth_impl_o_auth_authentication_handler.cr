require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
