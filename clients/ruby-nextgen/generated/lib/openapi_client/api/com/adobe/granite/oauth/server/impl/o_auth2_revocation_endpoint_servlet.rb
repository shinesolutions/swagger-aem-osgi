# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_servlet_paths: nil, oauth_revocation_active: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet',
          type: OpenapiClient::Models::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpoinH98e54f68,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.servlet.paths' => sling_servlet_paths, 'oauth.revocation.active' => oauth_revocation_active }
        )
      end
    end
  end
end
