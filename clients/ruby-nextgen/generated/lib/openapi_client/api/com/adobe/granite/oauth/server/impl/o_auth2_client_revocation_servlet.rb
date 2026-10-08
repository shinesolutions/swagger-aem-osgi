# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_client_revocation_active: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet',
          type: OpenapiClient::Models::ComAdobeGraniteOauthServerImplOAuth2ClientRevocationHcf6a1046,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.client.revocation.active' => oauth_client_revocation_active }
        )
      end
    end
  end
end
