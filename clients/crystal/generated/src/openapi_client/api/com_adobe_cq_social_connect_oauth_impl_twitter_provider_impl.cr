require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialConnectOauthImplTwitterProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_provider_id : String? = nil, oauth_cloud_config_root : String? = nil, provider_config_root : String? = nil, provider_config_user_folder : String? = nil, provider_config_twitter_enable_params : Bool? = nil, provider_config_twitter_params : Array(String)? = nil, provider_config_refresh_userdata_enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.provider.id" => oauth_provider_id, "oauth.cloud.config.root" => oauth_cloud_config_root, "provider.config.root" => provider_config_root, "provider.config.user.folder" => provider_config_user_folder, "provider.config.twitter.enable.params" => provider_config_twitter_enable_params, "provider.config.twitter.params" => provider_config_twitter_params, "provider.config.refresh.userdata.enabled" => provider_config_refresh_userdata_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
