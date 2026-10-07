# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributionPackageImporterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, endpoints: nil, transport_secret_provider_target: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionPackagingImplImporterRemoteDHa03d14ac,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'endpoints' => endpoints, 'transportSecretProvider.target' => transport_secret_provider_target }
        )
      end
    end
  end
end
