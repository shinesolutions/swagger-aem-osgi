require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthOauthImplFacebookProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_provider_id : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.provider.id" => oauth_provider_id },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
