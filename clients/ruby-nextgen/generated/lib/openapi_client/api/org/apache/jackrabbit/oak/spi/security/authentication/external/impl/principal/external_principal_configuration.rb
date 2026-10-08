# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrincipalExternalPrincipalConfiguration
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, protect_external_id: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalH9e1da8a0,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'protectExternalId' => protect_external_id }
        )
      end
    end
  end
end
