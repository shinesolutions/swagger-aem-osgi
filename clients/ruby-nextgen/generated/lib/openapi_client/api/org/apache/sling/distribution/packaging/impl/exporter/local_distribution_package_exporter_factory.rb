# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionPackagingImplExporterLocalDistributionPackageExporterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, package_builder_target: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionPackagingImplExporterLocalDiH95408943,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'packageBuilder.target' => package_builder_target }
        )
      end
    end
  end
end
