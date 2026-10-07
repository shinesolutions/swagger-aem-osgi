require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : String? = nil, jaas_control_flag : String? = nil, jaas_realm_name : String? = nil, jaas_ranking : Int32? = nil, oauth_offline_validation : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path, "jaas.controlFlag" => jaas_control_flag, "jaas.realmName" => jaas_realm_name, "jaas.ranking" => jaas_ranking, "oauth.offline.validation" => oauth_offline_validation },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
