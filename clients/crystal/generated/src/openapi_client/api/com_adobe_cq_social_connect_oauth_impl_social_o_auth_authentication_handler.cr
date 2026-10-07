require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : Array(String)? = nil, service_ranking : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path, "service.ranking" => service_ranking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
