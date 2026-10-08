# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistration
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, required_service_pids: nil, authorization_composition_type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSecurityInternalSecurityProviderRH2c7bba69,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'requiredServicePids' => required_service_pids, 'authorizationCompositionType' => authorization_composition_type }
        )
      end
    end
  end
end
