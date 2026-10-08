# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExternalLoginModuleFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, jaas_ranking: nil, jaas_control_flag: nil, jaas_realm_name: nil, idp_name: nil, sync_handler_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalH88b3fb13,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'jaas.ranking' => jaas_ranking, 'jaas.controlFlag' => jaas_control_flag, 'jaas.realmName' => jaas_realm_name, 'idp.name' => idp_name, 'sync.handlerName' => sync_handler_name }
        )
      end
    end
  end
end
