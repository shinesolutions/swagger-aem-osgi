# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path: nil, oauth_client_ids_allowed: nil, auth_bearer_sync_ims: nil, auth_token_request_parameter: nil, oauth_bearer_configid: nil, oauth_jwt_support: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler',
          type: OpenapiClient::Models::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'path' => path, 'oauth.clientIds.allowed' => oauth_client_ids_allowed, 'auth.bearer.sync.ims' => auth_bearer_sync_ims, 'auth.tokenRequestParameter' => auth_token_request_parameter, 'oauth.bearer.configid' => oauth_bearer_configid, 'oauth.jwt.support' => oauth_jwt_support }
        )
      end
    end
  end
end
