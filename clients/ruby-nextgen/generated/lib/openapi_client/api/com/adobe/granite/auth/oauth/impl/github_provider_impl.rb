# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthOauthImplGithubProviderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_provider_id: nil, oauth_provider_github_authorization_url: nil, oauth_provider_github_token_url: nil, oauth_provider_github_profile_url: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl',
          type: OpenapiClient::Models::ComAdobeGraniteAuthOauthImplGithubProviderImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.provider.id' => oauth_provider_id, 'oauth.provider.github.authorization.url' => oauth_provider_github_authorization_url, 'oauth.provider.github.token.url' => oauth_provider_github_token_url, 'oauth.provider.github.profile.url' => oauth_provider_github_profile_url }
        )
      end
    end
  end
end
