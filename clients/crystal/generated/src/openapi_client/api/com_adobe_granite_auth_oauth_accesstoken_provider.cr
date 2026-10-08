require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthOauthAccesstokenProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, auth_token_provider_title : String? = nil, auth_token_provider_default_claims : Array(String)? = nil, auth_token_provider_endpoint : String? = nil, auth_access_token_request : String? = nil, auth_token_provider_keypair_alias : String? = nil, auth_token_provider_conn_timeout : Int32? = nil, auth_token_provider_so_timeout : Int32? = nil, auth_token_provider_client_id : String? = nil, auth_token_provider_scope : String? = nil, auth_token_provider_reuse_access_token : Bool? = nil, auth_token_provider_relaxed_ssl : Bool? = nil, token_request_customizer_type : String? = nil, auth_token_validator_type : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthOauthAccesstokenProviderInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthOauthAccesstokenProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "auth.token.provider.title" => auth_token_provider_title, "auth.token.provider.default.claims" => auth_token_provider_default_claims, "auth.token.provider.endpoint" => auth_token_provider_endpoint, "auth.access.token.request" => auth_access_token_request, "auth.token.provider.keypair.alias" => auth_token_provider_keypair_alias, "auth.token.provider.conn.timeout" => auth_token_provider_conn_timeout, "auth.token.provider.so.timeout" => auth_token_provider_so_timeout, "auth.token.provider.client.id" => auth_token_provider_client_id, "auth.token.provider.scope" => auth_token_provider_scope, "auth.token.provider.reuse.access.token" => auth_token_provider_reuse_access_token, "auth.token.provider.relaxed.ssl" => auth_token_provider_relaxed_ssl, "token.request.customizer.type" => token_request_customizer_type, "auth.token.validator.type" => auth_token_validator_type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
