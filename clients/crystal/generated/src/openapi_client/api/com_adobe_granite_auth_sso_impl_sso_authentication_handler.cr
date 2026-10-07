require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : String? = nil, service_ranking : Int32? = nil, jaas_control_flag : String? = nil, jaas_realm_name : String? = nil, jaas_ranking : Int32? = nil, headers : Array(String)? = nil, cookies : Array(String)? = nil, parameters : Array(String)? = nil, usermap : Array(String)? = nil, format : String? = nil, trusted_credentials_attribute : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path, "service.ranking" => service_ranking, "jaas.controlFlag" => jaas_control_flag, "jaas.realmName" => jaas_realm_name, "jaas.ranking" => jaas_ranking, "headers" => headers, "cookies" => cookies, "parameters" => parameters, "usermap" => usermap, "format" => format, "trustedCredentialsAttribute" => trusted_credentials_attribute },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
