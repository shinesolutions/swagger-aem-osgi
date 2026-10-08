require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : String? = nil, oauth_client_ids_allowed : Array(String)? = nil, auth_bearer_sync_ims : Bool? = nil, auth_token_request_parameter : String? = nil, oauth_bearer_configid : String? = nil, oauth_jwt_support : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path, "oauth.clientIds.allowed" => oauth_client_ids_allowed, "auth.bearer.sync.ims" => auth_bearer_sync_ims, "auth.tokenRequestParameter" => auth_token_request_parameter, "oauth.bearer.configid" => oauth_bearer_configid, "oauth.jwt.support" => oauth_jwt_support },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
