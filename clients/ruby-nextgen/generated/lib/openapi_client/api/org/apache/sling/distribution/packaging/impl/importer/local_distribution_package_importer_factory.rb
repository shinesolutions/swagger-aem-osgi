# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionPackagingImplImporterLocalDistributionPackageImporterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, package_builder_target: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionPackagingImplImporterLocalDiH5e6c1b48,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'packageBuilder.target' => package_builder_target }
        )
      end
    end
  end
end
