# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path: nil, jaas_control_flag: nil, jaas_realm_name: nil, jaas_ranking: nil, oauth_offline_validation: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler',
          type: OpenapiClient::Models::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenHf8f84982,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'path' => path, 'jaas.controlFlag' => jaas_control_flag, 'jaas.realmName' => jaas_realm_name, 'jaas.ranking' => jaas_ranking, 'oauth.offline.validation' => oauth_offline_validation }
        )
      end
    end
  end
end
