# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiguration
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cug_supported_paths: nil, cug_enabled: nil, configuration_ranking: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCHc5f18c11,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cugSupportedPaths' => cug_supported_paths, 'cugEnabled' => cug_enabled, 'configurationRanking' => configuration_ranking }
        )
      end
    end
  end
end
