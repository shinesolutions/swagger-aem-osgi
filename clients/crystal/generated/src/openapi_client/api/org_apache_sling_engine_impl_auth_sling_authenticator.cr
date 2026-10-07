require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEngineImplAuthSlingAuthenticator
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, osgi_http_whiteboard_context_select : String? = nil, osgi_http_whiteboard_listener : String? = nil, auth_sudo_cookie : String? = nil, auth_sudo_parameter : String? = nil, auth_annonymous : Bool? = nil, sling_auth_requirements : Array(String)? = nil, sling_auth_anonymous_user : String? = nil, sling_auth_anonymous_password : String? = nil, auth_http : String? = nil, auth_http_realm : String? = nil, auth_uri_suffix : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "osgi.http.whiteboard.context.select" => osgi_http_whiteboard_context_select, "osgi.http.whiteboard.listener" => osgi_http_whiteboard_listener, "auth.sudo.cookie" => auth_sudo_cookie, "auth.sudo.parameter" => auth_sudo_parameter, "auth.annonymous" => auth_annonymous, "sling.auth.requirements" => sling_auth_requirements, "sling.auth.anonymous.user" => sling_auth_anonymous_user, "sling.auth.anonymous.password" => sling_auth_anonymous_password, "auth.http" => auth_http, "auth.http.realm" => auth_http_realm, "auth.uri.suffix" => auth_uri_suffix },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
