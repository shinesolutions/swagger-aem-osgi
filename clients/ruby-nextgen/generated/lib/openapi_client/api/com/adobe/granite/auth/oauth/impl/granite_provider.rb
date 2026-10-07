# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthOauthImplGraniteProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_provider_id: nil, oauth_provider_granite_authorization_url: nil, oauth_provider_granite_token_url: nil, oauth_provider_granite_profile_url: nil, oauth_provider_granite_extended_details_urls: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider',
          type: OpenapiClient::Models::ComAdobeGraniteAuthOauthImplGraniteProviderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.provider.id' => oauth_provider_id, 'oauth.provider.granite.authorization.url' => oauth_provider_granite_authorization_url, 'oauth.provider.granite.token.url' => oauth_provider_granite_token_url, 'oauth.provider.granite.profile.url' => oauth_provider_granite_profile_url, 'oauth.provider.granite.extended.details.urls' => oauth_provider_granite_extended_details_urls }
        )
      end
    end
  end
end
