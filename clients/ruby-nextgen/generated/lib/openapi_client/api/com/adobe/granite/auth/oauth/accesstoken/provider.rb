# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthOauthAccesstokenProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, auth_token_provider_title: nil, auth_token_provider_default_claims: nil, auth_token_provider_endpoint: nil, auth_access_token_request: nil, auth_token_provider_keypair_alias: nil, auth_token_provider_conn_timeout: nil, auth_token_provider_so_timeout: nil, auth_token_provider_client_id: nil, auth_token_provider_scope: nil, auth_token_provider_reuse_access_token: nil, auth_token_provider_relaxed_ssl: nil, token_request_customizer_type: nil, auth_token_validator_type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider',
          type: OpenapiClient::Models::ComAdobeGraniteAuthOauthAccesstokenProviderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'auth.token.provider.title' => auth_token_provider_title, 'auth.token.provider.default.claims' => auth_token_provider_default_claims, 'auth.token.provider.endpoint' => auth_token_provider_endpoint, 'auth.access.token.request' => auth_access_token_request, 'auth.token.provider.keypair.alias' => auth_token_provider_keypair_alias, 'auth.token.provider.conn.timeout' => auth_token_provider_conn_timeout, 'auth.token.provider.so.timeout' => auth_token_provider_so_timeout, 'auth.token.provider.client.id' => auth_token_provider_client_id, 'auth.token.provider.scope' => auth_token_provider_scope, 'auth.token.provider.reuse.access.token' => auth_token_provider_reuse_access_token, 'auth.token.provider.relaxed.ssl' => auth_token_provider_relaxed_ssl, 'token.request.customizer.type' => token_request_customizer_type, 'auth.token.validator.type' => auth_token_validator_type }
        )
      end
    end
  end
end
