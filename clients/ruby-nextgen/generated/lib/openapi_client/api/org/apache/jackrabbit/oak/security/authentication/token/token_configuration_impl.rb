# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, token_expiration: nil, token_length: nil, token_refresh: nil, token_cleanup_threshold: nil, password_hash_algorithm: nil, password_hash_iterations: nil, password_salt_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenCH1eae8cbf,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'tokenExpiration' => token_expiration, 'tokenLength' => token_length, 'tokenRefresh' => token_refresh, 'tokenCleanupThreshold' => token_cleanup_threshold, 'passwordHashAlgorithm' => password_hash_algorithm, 'passwordHashIterations' => password_hash_iterations, 'passwordSaltSize' => password_salt_size }
        )
      end
    end
  end
end
