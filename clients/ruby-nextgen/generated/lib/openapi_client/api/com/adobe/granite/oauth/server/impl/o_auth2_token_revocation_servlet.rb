# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_token_revocation_active: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet',
          type: OpenapiClient::Models::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationSHd8a24d00,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.token.revocation.active' => oauth_token_revocation_active }
        )
      end
    end
  end
end
