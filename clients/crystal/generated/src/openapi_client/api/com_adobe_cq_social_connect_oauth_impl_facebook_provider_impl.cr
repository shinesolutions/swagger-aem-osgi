require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialConnectOauthImplFacebookProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_provider_id : String? = nil, oauth_cloud_config_root : String? = nil, provider_config_root : String? = nil, provider_config_create_tags_enabled : Bool? = nil, provider_config_user_folder : String? = nil, provider_config_facebook_fetch_fields : Bool? = nil, provider_config_facebook_fields : Array(String)? = nil, provider_config_refresh_userdata_enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.provider.id" => oauth_provider_id, "oauth.cloud.config.root" => oauth_cloud_config_root, "provider.config.root" => provider_config_root, "provider.config.create.tags.enabled" => provider_config_create_tags_enabled, "provider.config.user.folder" => provider_config_user_folder, "provider.config.facebook.fetch.fields" => provider_config_facebook_fetch_fields, "provider.config.facebook.fields" => provider_config_facebook_fields, "provider.config.refresh.userdata.enabled" => provider_config_refresh_userdata_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
