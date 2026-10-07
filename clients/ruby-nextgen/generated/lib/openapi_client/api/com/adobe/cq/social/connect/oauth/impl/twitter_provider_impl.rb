# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialConnectOauthImplTwitterProviderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_provider_id: nil, oauth_cloud_config_root: nil, provider_config_root: nil, provider_config_user_folder: nil, provider_config_twitter_enable_params: nil, provider_config_twitter_params: nil, provider_config_refresh_userdata_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.provider.id' => oauth_provider_id, 'oauth.cloud.config.root' => oauth_cloud_config_root, 'provider.config.root' => provider_config_root, 'provider.config.user.folder' => provider_config_user_folder, 'provider.config.twitter.enable.params' => provider_config_twitter_enable_params, 'provider.config.twitter.params' => provider_config_twitter_params, 'provider.config.refresh.userdata.enabled' => provider_config_refresh_userdata_enabled }
        )
      end
    end
  end
end
