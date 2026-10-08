# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, username: nil, password: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider',
          type: OpenapiClient::Models::OrgApacheSlingDistributionTransportImplUserCredentialsDH7c2d18e3,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'username' => username, 'password' => password }
        )
      end
    end
  end
end
