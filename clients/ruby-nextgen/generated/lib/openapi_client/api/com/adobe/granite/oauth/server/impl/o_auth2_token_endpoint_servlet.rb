# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_issuer: nil, oauth_access_token_expires_in: nil, osgi_http_whiteboard_servlet_pattern: nil, osgi_http_whiteboard_context_select: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet',
          type: OpenapiClient::Models::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.issuer' => oauth_issuer, 'oauth.access.token.expires.in' => oauth_access_token_expires_in, 'osgi.http.whiteboard.servlet.pattern' => osgi_http_whiteboard_servlet_pattern, 'osgi.http.whiteboard.context.select' => osgi_http_whiteboard_context_select }
        )
      end
    end
  end
end
