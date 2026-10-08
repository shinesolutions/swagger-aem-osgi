# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixJaasConfigurationFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, jaas_control_flag: nil, jaas_ranking: nil, jaas_realm_name: nil, jaas_classname: nil, jaas_options: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.jaas.Configuration.factory',
          type: OpenapiClient::Models::OrgApacheFelixJaasConfigurationFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'jaas.controlFlag' => jaas_control_flag, 'jaas.ranking' => jaas_ranking, 'jaas.realmName' => jaas_realm_name, 'jaas.classname' => jaas_classname, 'jaas.options' => jaas_options }
        )
      end
    end
  end
end
