# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path: nil, service_ranking: nil, jaas_control_flag: nil, jaas_realm_name: nil, jaas_ranking: nil, headers: nil, cookies: nil, parameters: nil, usermap: nil, format: nil, trusted_credentials_attribute: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler',
          type: OpenapiClient::Models::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'path' => path, 'service.ranking' => service_ranking, 'jaas.controlFlag' => jaas_control_flag, 'jaas.realmName' => jaas_realm_name, 'jaas.ranking' => jaas_ranking, 'headers' => headers, 'cookies' => cookies, 'parameters' => parameters, 'usermap' => usermap, 'format' => format, 'trustedCredentialsAttribute' => trusted_credentials_attribute }
        )
      end
    end
  end
end
