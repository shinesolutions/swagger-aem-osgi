require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_client_revocation_active : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.client.revocation.active" => oauth_client_revocation_active },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
