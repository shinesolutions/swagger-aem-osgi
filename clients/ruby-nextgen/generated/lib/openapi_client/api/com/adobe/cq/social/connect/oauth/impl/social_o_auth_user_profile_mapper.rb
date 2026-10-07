# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, facebook: nil, twitter: nil, provider_config_user_folder: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper',
          type: OpenapiClient::Models::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfHbf3c388a,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'facebook' => facebook, 'twitter' => twitter, 'provider.config.user.folder' => provider_config_user_folder }
        )
      end
    end
  end
end
