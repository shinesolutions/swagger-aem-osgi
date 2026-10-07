# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistributionPackageImporterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, service_name: nil, path: nil, privilege_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionPackagingImplImporterRepositoHafe4dea0,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'service.name' => service_name, 'path' => path, 'privilege.name' => privilege_name }
        )
      end
    end
  end
end
