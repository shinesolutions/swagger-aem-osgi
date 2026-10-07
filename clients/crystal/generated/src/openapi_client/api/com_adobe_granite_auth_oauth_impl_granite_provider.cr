require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthOauthImplGraniteProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_provider_id : String? = nil, oauth_provider_granite_authorization_url : String? = nil, oauth_provider_granite_token_url : String? = nil, oauth_provider_granite_profile_url : String? = nil, oauth_provider_granite_extended_details_urls : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthOauthImplGraniteProviderInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthOauthImplGraniteProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.provider.id" => oauth_provider_id, "oauth.provider.granite.authorization.url" => oauth_provider_granite_authorization_url, "oauth.provider.granite.token.url" => oauth_provider_granite_token_url, "oauth.provider.granite.profile.url" => oauth_provider_granite_profile_url, "oauth.provider.granite.extended.details.urls" => oauth_provider_granite_extended_details_urls },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
