require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthOauthProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_config_id : String? = nil, oauth_client_id : String? = nil, oauth_client_secret : String? = nil, oauth_scope : Array(String)? = nil, oauth_config_provider_id : String? = nil, oauth_create_users : Bool? = nil, oauth_userid_property : String? = nil, force_strict_username_matching : Bool? = nil, oauth_encode_userids : Bool? = nil, oauth_hash_userids : Bool? = nil, oauth_call_back_url : String? = nil, oauth_access_token_persist : Bool? = nil, oauth_access_token_persist_cookie : Bool? = nil, oauth_csrf_state_protection : Bool? = nil, oauth_redirect_request_params : Bool? = nil, oauth_config_siblings_allow : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthOauthProviderInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthOauthProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.oauth.provider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.config.id" => oauth_config_id, "oauth.client.id" => oauth_client_id, "oauth.client.secret" => oauth_client_secret, "oauth.scope" => oauth_scope, "oauth.config.provider.id" => oauth_config_provider_id, "oauth.create.users" => oauth_create_users, "oauth.userid.property" => oauth_userid_property, "force.strict.username.matching" => force_strict_username_matching, "oauth.encode.userids" => oauth_encode_userids, "oauth.hash.userids" => oauth_hash_userids, "oauth.callBackUrl" => oauth_call_back_url, "oauth.access.token.persist" => oauth_access_token_persist, "oauth.access.token.persist.cookie" => oauth_access_token_persist_cookie, "oauth.csrf.state.protection" => oauth_csrf_state_protection, "oauth.redirect.request.params" => oauth_redirect_request_params, "oauth.config.siblings.allow" => oauth_config_siblings_allow },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
