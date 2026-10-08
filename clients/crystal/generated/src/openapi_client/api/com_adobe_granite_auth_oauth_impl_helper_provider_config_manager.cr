require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthOauthImplHelperProviderConfigManager
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_cookie_login_timeout : String? = nil, oauth_cookie_max_age : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.cookie.login.timeout" => oauth_cookie_login_timeout, "oauth.cookie.max.age" => oauth_cookie_max_age },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
