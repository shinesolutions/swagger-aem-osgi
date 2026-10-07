require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmFoundationImplHTTPAuthHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : String? = nil, auth_http_nologin : Bool? = nil, auth_http_realm : String? = nil, auth_default_loginpage : String? = nil, auth_cred_form : Array(String)? = nil, auth_cred_utf8 : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmFoundationImplHTTPAuthHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmFoundationImplHTTPAuthHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path, "auth.http.nologin" => auth_http_nologin, "auth.http.realm" => auth_http_realm, "auth.default.loginpage" => auth_default_loginpage, "auth.cred.form" => auth_cred_form, "auth.cred.utf8" => auth_cred_utf8 },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
