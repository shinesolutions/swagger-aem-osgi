require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_issuer : String? = nil, oauth_access_token_expires_in : String? = nil, osgi_http_whiteboard_servlet_pattern : String? = nil, osgi_http_whiteboard_context_select : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.issuer" => oauth_issuer, "oauth.access.token.expires.in" => oauth_access_token_expires_in, "osgi.http.whiteboard.servlet.pattern" => osgi_http_whiteboard_servlet_pattern, "osgi.http.whiteboard.context.select" => osgi_http_whiteboard_context_select },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
