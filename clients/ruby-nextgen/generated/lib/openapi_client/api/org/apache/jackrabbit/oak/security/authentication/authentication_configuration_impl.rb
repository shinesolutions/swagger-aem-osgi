# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, org_apache_jackrabbit_oak_authentication_app_name: nil, org_apache_jackrabbit_oak_authentication_config_spi_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticatiH121780e1,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'org.apache.jackrabbit.oak.authentication.appName' => org_apache_jackrabbit_oak_authentication_app_name, 'org.apache.jackrabbit.oak.authentication.configSpiName' => org_apache_jackrabbit_oak_authentication_config_spi_name }
        )
      end
    end
  end
end
