# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler',
          type: OpenapiClient::Models::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'path' => path }
        )
      end
    end
  end
end
