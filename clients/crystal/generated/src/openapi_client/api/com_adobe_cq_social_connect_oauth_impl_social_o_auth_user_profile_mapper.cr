require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, facebook : Array(String)? = nil, twitter : Array(String)? = nil, provider_config_user_folder : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "facebook" => facebook, "twitter" => twitter, "provider.config.user.folder" => provider_config_user_folder },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
