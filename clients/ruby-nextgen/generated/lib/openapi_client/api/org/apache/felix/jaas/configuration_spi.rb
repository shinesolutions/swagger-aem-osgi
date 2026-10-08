# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixJaasConfigurationSpi
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, jaas_default_realm_name: nil, jaas_config_provider_name: nil, jaas_global_config_policy: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi',
          type: OpenapiClient::Models::OrgApacheFelixJaasConfigurationSpiInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'jaas.defaultRealmName' => jaas_default_realm_name, 'jaas.configProviderName' => jaas_config_provider_name, 'jaas.globalConfigPolicy' => jaas_global_config_policy }
        )
      end
    end
  end
end
