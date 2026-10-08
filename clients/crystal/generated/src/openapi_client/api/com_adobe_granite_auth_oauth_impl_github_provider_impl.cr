require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthOauthImplGithubProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_provider_id : String? = nil, oauth_provider_github_authorization_url : String? = nil, oauth_provider_github_token_url : String? = nil, oauth_provider_github_profile_url : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthOauthImplGithubProviderImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthOauthImplGithubProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.provider.id" => oauth_provider_id, "oauth.provider.github.authorization.url" => oauth_provider_github_authorization_url, "oauth.provider.github.token.url" => oauth_provider_github_token_url, "oauth.provider.github.profile.url" => oauth_provider_github_profile_url },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
