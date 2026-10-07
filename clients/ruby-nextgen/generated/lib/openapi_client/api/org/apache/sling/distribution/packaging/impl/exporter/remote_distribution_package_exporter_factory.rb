# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributionPackageExporterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, endpoints: nil, pull_items: nil, package_builder_target: nil, transport_secret_provider_target: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionPackagingImplExporterRemoteDH61a57407,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'endpoints' => endpoints, 'pull.items' => pull_items, 'packageBuilder.target' => package_builder_target, 'transportSecretProvider.target' => transport_secret_provider_target }
        )
      end
    end
  end
end
